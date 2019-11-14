/*
 * Copyright 2018 NUROX Ltd.
 *
 * Licensed under the NUROX Ltd Software License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.looseboxes.com/legal/licenses/software.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bc.opendata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author Chinomso Bassey Ikwuagwu on Oct 31, 2018 3:32:27 PM
 */
////////////////////////////////// NOTE ////////////////////////////////////////
// CHANGING ANY OF THESE NAMES WILL AFFECT ALL CACHED/INDEXED VALUES
// BEST NOT TO CHANGE. OTHERWISE FIND ALL USAGES AND DELETE OR RENAME
// EXISTING CACHED/INDEXED VALUES
////////////////////////////////////////////////////////////////////////////////
public enum StandardDataType implements DataType {
    
    BCOPENDATA("bcopendata", null),
    
    EXCHANGE_RATE("exchangerate", BCOPENDATA),
    
    SPORTS("sports", BCOPENDATA),
    
    SOCCER("football", SPORTS),
    
    WEATHER("weather", BCOPENDATA),
    
    LOCATION("location", BCOPENDATA),
    
    NONE("", BCOPENDATA);
    
    private final String label;

    private final StandardDataType parent;

    StandardDataType() {
        this((StandardDataType)null);
    }
    
    StandardDataType(StandardDataType parent) {
        this.label = this.name();
        this.parent = parent;
    }
    
    StandardDataType(String label) {
        this(label, null);
    }

    StandardDataType(String label, StandardDataType parent) {
        this.label = Objects.requireNonNull(label);
        this.parent = parent;
    }
    
    @Override
    public String getName() {
        return this.name();
    }

    public String getLabel() {
        return label;
    }
    
    @Override
    public DataType getParentOrException() {
        return Objects.requireNonNull(this.getParentOrDefault(null), "parent is null");
    }
    
    @Override
    public DataType getParentOrDefault(DataType outputIfNone) {
        return parent == null ? outputIfNone : parent;
    }

    @Override
    public String getPath() {
        return this.getPath('.');
    }

    @Override
    public String getPath(char separator) {
        return this.getNamePath(separator);
    }

    @Override
    public DataType[] getPathArray() {
        final DataType [] result;
        if(this.parent == null) {
            result = new DataType[]{this};
        }else{
            final List<DataType> path = new ArrayList<>();
            DataType d = parent;
            while(d != null){
                path.add(0, d);
                d = d.getParentOrDefault(null);
            }
            path.add(this);
            result = path.toArray(new DataType[0]);
        }        
        return result;
    }

    public String getNamePath(char separator) {
        final String result;
        if(this.parent != null) {
            result = this.parent.getNamePath(separator) + separator + this.getName();
        }else{
            result = this.getName();
        }
        return result;
    }

    public String getLabelPath(char separator) {
        final String result;
        if(this.parent != null) {
            result = this.parent.getLabelPath(separator) + separator + this.getLabel();
        }else{
            result = this.getLabel();
        }
        return result;
    }

    public static RuntimeException getExceptionForUnsupported(StandardDataType type) {
        return new IllegalArgumentException(
                "Not supported: " + type.getClass().getName() + ' ' + type.name() +
                ". Supported: " + Arrays.toString(StandardDataType.values())
        );
    }
}

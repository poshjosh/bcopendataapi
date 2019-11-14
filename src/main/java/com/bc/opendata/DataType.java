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

/**
 * @author Chinomso Bassey Ikwuagwu on Oct 31, 2018 6:40:34 PM
 */
public interface DataType {
    
    String getName();
    
    String getPath();

    String getPath(char separator);    
    
    DataType [] getPathArray();
    
    DataType getParentOrException();
    
    DataType getParentOrDefault(DataType outputIfNone);
}

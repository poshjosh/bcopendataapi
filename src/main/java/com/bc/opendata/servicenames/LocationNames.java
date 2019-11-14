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

package com.bc.opendata.servicenames;

/**
 * @author Chinomso Bassey Ikwuagwu on Nov 4, 2018 11:53:36 PM
 */
public interface LocationNames extends ServiceProperties {

    public static final String SERVICE_NAME_IPSTACK = ServiceNames.LOCATION_IPSTACK;
    
    public static final String PROPERTY_IPADDRESS = GlobalNames.PROPERTY_IPADDRESS;
    public static final String [] ALL = {PROPERTY_IPADDRESS};
}

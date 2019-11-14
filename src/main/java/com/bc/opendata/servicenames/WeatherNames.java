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
 * @author Chinomso Bassey Ikwuagwu on Nov 1, 2018 11:10:15 AM
 */
public interface WeatherNames extends ServiceProperties {

    public static final String SERVICE_NAME_YAHOO = ServiceNames.WEATHER_YAHOO;
    public static final String SERVICE_NAME_FORECASTIO = ServiceNames.WEATHER_FORECASTIO;

    public static final String PROPERTY_EXCLUDED_URLS = "excluded_urls";

    public static final String PROPERTY_LOCATION = GlobalNames.PROPERTY_LOCATION;
    public static final String PROPERTY_WOEID = GlobalNames.PROPERTY_WOEID;
    
    public static final String PROPERTY_LATITUDE = GlobalNames.PROPERTY_LATITUDE;
    public static final String PROPERTY_LONGITUDE = GlobalNames.PROPERTY_LONGITUDE;
    
    public static final String [] ALL = {PROPERTY_EXCLUDED_URLS, PROPERTY_LOCATION,
        PROPERTY_WOEID, PROPERTY_LATITUDE, PROPERTY_LONGITUDE
    };
}

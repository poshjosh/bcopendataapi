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

import com.bc.opendata.StandardDataType;

/**
 * @author Chinomso Bassey Ikwuagwu on Nov 1, 2018 1:40:20 PM
 */
public interface ServiceNames {
    public static final String EXHANGERATE_BCFXRATESERVICE = StandardDataType.EXCHANGE_RATE.getPath('_') + "_BCFXRATESERVICE";
    public static final String LOCATION_IPSTACK = StandardDataType.LOCATION.getPath('_') + "_IPSTACK";
    public static final String SPORTS_FOOTBALLDATA = StandardDataType.SOCCER.getPath('_') + "_FOOTBALLDATA";
    public static final String SPORTS_OPENDATA = StandardDataType.SOCCER.getPath('_') + "_OPENDATA";
    public static final String WEATHER_YAHOO = StandardDataType.WEATHER.getPath('_') + "_YAHOO"; 
    public static final String WEATHER_FORECASTIO = StandardDataType.WEATHER.getPath('_') + "_FORECASTIO"; 
}

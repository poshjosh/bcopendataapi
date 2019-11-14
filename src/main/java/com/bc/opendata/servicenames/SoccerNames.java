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
 * @author Chinomso Bassey Ikwuagwu on Nov 1, 2018 2:28:28 PM
 */
public interface SoccerNames extends ServiceProperties{
    
    public static final String SERVICE_NAME_FOOTBALLDATA = ServiceNames.SPORTS_FOOTBALLDATA;
    public static final String SERVICE_NAME_OPENDATA = ServiceNames.SPORTS_OPENDATA;

    public static final String PROPERTY_STARTDATE = GlobalNames.PROPERTY_STARTDATE;
    public static final String PROPERTY_ENDDATE = GlobalNames.PROPERTY_ENDDATE;

    public static final String PROPERTY_FOOTBALLDATA_LEAGUE = SERVICE_NAME_FOOTBALLDATA + ".league";
    public static final String FOOTBALLDATA_EPL = "PL";
    
    public static final String PROPERTY_OPENDATA_LEAGUE = SERVICE_NAME_OPENDATA + ".league";
    public static final String OPENDATA_EPL = "premier-league";
    public static final String PROPERTY_SEASON = "season";
    public static final String PROPERTY_ROUND = "round";
    
    public static final String [] ALL = {PROPERTY_STARTDATE, PROPERTY_ENDDATE,
        PROPERTY_FOOTBALLDATA_LEAGUE, PROPERTY_OPENDATA_LEAGUE,
        PROPERTY_SEASON, PROPERTY_ROUND
    };
}


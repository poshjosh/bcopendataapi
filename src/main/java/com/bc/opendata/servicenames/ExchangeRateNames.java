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
 * @author Chinomso Bassey Ikwuagwu on Nov 1, 2018 2:32:29 PM
 */
public interface ExchangeRateNames extends ServiceProperties{

    public static final String SERVICE_NAME_BCFXRATESERVICE = ServiceNames.EXHANGERATE_BCFXRATESERVICE;
    
    public static final String PROPERTY_BASE_CURRENCY = "rates_base";
    public static final String PROPERTY_OTHER_CURRENCIES = "rates_others";
    
    public static final String [] ALL = {PROPERTY_BASE_CURRENCY, PROPERTY_OTHER_CURRENCIES};
}

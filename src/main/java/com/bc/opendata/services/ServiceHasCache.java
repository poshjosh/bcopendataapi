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

package com.bc.opendata.services;

import com.bc.opendata.caching.HasCache;

/**
 * @author Chinomso Bassey Ikwuagwu on Nov 2, 2018 9:51:51 AM
 */
public interface ServiceHasCache<K, V> extends Service<K, V>, HasCache<K, V> {

}

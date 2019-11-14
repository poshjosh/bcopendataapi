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

import java.io.Closeable;
import java.io.IOException;
import java.util.Set;

/**
 * @author Chinomso Bassey Ikwuagwu on Nov 2, 2018 6:35:08 PM
 */
public interface ServiceFactory<K, V> extends Closeable {

    @Override
    void close() throws IOException;

    V get(K type);

    Set<K> getServiceIds();

    boolean isClosed();
}

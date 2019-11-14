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

package com.bc.opendata.caching;

import java.io.IOException;

/**
 * @author Chinomso Bassey Ikwuagwu on Nov 2, 2018 10:05:14 AM
 */
public interface Cache<K, V>{

    Cache NO_OP = new Cache() {
        @Override
        public Object getOrDefault(Object key, Object outputIfNone) {
            return outputIfNone;
        }
        @Override
        public boolean put(Object key, Object value) { 
            return false; 
        }
        @Override
        public void flush() { }
        @Override
        public boolean isClosed() { return false; }
        @Override
        public void close() { }
        @Override
        public void clear() { }
        @Override
        public boolean remove(Object key) { return false; }
        @Override
        public void delete() { }
    };

    V getOrDefault(K key, V outputIfNone);

    boolean put(K key, V value);

    void flush() throws IOException;

    boolean isClosed();

    void close() throws IOException;

    /**
     * User should be sure there are no outstanding operations.
     * @throws java.io.IOException
     */
    void clear() throws IOException;

    boolean remove(K key);

    void delete() throws IOException;
}

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.mode.repository.cluster.etcd.props;

import org.junit.Test;

import java.util.Properties;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public final class EtcdPropertiesTest {
    
    @Test
    public void assertGetValue() {
        assertThat(new EtcdProperties(createProperties()).getValue(EtcdPropertyKey.TIME_TO_LIVE_SECONDS), is(50L));
    }
    
    private Properties createProperties() {
        Properties result = new Properties();
        result.setProperty(EtcdPropertyKey.TIME_TO_LIVE_SECONDS.getKey(), "50");
        return result;
    }
    
    @Test
    public void assertGetDefaultValue() {
        assertThat(new EtcdProperties(new Properties()).getValue(EtcdPropertyKey.TIME_TO_LIVE_SECONDS), is(30L));
    }
}

/*
 * Copyright 2015-2017 EntIT Software LLC, a Micro Focus company.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.cafdataprocessing.worker.policy.testing.shared;

import com.github.cafdataprocessing.worker.policy.PolicyWorkerConfiguration;

/**
 * Helper methods relating to Policy Worker configuration for use in testing.
 */
public class TestPolicyWorkerConfigurationHelper {
    public static PolicyWorkerConfiguration getWorkerConfiguration(String resultQueue)
    {
        PolicyWorkerConfiguration config = new PolicyWorkerConfiguration();
        config.setResultQueue(resultQueue);
        return config;
    }
}

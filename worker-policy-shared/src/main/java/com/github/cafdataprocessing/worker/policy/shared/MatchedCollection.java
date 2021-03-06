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
package com.github.cafdataprocessing.worker.policy.shared;

import java.util.ArrayList;
import java.util.Collection;
/**
 * Result object for a matched collection, holds the collection description and conditions that caused the match.
 */

public class MatchedCollection {
    private Long id;
    private String name;
    private Collection<MatchedCondition> matched_conditions;
    private Collection<CollectionPolicy> policies;

    // default constructor used for serialization of this object from json.
    public MatchedCollection(){
        this.policies = new ArrayList<>();
    }

    public MatchedCollection(DocumentCollection collection, Collection<MatchedCondition> matchedConditions){
        this();
        this.id = collection.id;
        this.name = collection.name;
        this.matched_conditions = matchedConditions;

        if(collection.policyIds!=null){
            collection.policyIds.forEach(p -> {
                CollectionPolicy collectionPolicy = new CollectionPolicy();
                collectionPolicy.setId(p);
                this.policies.add(collectionPolicy);
            });
        }
    }

    /**
     * Set the matched conditions defined for the collection.
     */
    public void setMatchedConditions(Collection<MatchedCondition> conditions) {
        matched_conditions = conditions;
    }

    /**
     * The matched conditions defined for the collection.
     * @return Collection of matched conditions
     */
    public Collection<MatchedCondition> getMatchedConditions() {
        return matched_conditions;
    }

    /**
     * The id of the collection that the document matched.
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * The id of the collection that the document matched.
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * The name of the collection that the document matched.
     * @return
     */

    public String getName() {
        return name;
    }

    /**
     * The id of the collection that the document matched.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Collection<CollectionPolicy> getPolicies() {
        return policies;
    }

    public void setPolicies(Collection<CollectionPolicy> policies) {
        this.policies = policies;
    }
}

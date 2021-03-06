/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The base resource set for visibility and auto-approval.
 */
public class ResourceSet {
    /**
     * The list of subscriptions.
     */
    @JsonProperty(value = "subscriptions")
    private List<String> subscriptions;

    /**
     * Get the list of subscriptions.
     *
     * @return the subscriptions value
     */
    public List<String> subscriptions() {
        return this.subscriptions;
    }

    /**
     * Set the list of subscriptions.
     *
     * @param subscriptions the subscriptions value to set
     * @return the ResourceSet object itself.
     */
    public ResourceSet withSubscriptions(List<String> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

}

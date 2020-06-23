/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01.implementation;

import com.microsoft.azure.management.network.v2020_04_01.ConnectionMonitorSourceStatus;
import java.util.List;
import com.microsoft.azure.management.network.v2020_04_01.ConnectionStateSnapshot;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List of connection states snapshots.
 */
public class ConnectionMonitorQueryResultInner {
    /**
     * Status of connection monitor source. Possible values include: 'Unknown',
     * 'Active', 'Inactive'.
     */
    @JsonProperty(value = "sourceStatus")
    private ConnectionMonitorSourceStatus sourceStatus;

    /**
     * Information about connection states.
     */
    @JsonProperty(value = "states")
    private List<ConnectionStateSnapshot> states;

    /**
     * Get status of connection monitor source. Possible values include: 'Unknown', 'Active', 'Inactive'.
     *
     * @return the sourceStatus value
     */
    public ConnectionMonitorSourceStatus sourceStatus() {
        return this.sourceStatus;
    }

    /**
     * Set status of connection monitor source. Possible values include: 'Unknown', 'Active', 'Inactive'.
     *
     * @param sourceStatus the sourceStatus value to set
     * @return the ConnectionMonitorQueryResultInner object itself.
     */
    public ConnectionMonitorQueryResultInner withSourceStatus(ConnectionMonitorSourceStatus sourceStatus) {
        this.sourceStatus = sourceStatus;
        return this;
    }

    /**
     * Get information about connection states.
     *
     * @return the states value
     */
    public List<ConnectionStateSnapshot> states() {
        return this.states;
    }

    /**
     * Set information about connection states.
     *
     * @param states the states value to set
     * @return the ConnectionMonitorQueryResultInner object itself.
     */
    public ConnectionMonitorQueryResultInner withStates(List<ConnectionStateSnapshot> states) {
        this.states = states;
        return this;
    }

}

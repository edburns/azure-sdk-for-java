/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EdgeUsageDataCollectionPolicy model.
 */
public class EdgeUsageDataCollectionPolicy {
    /**
     * Usage data collection frequency in ISO 8601 duration format e.g. PT10M ,
     * PT5H.
     */
    @JsonProperty(value = "dataCollectionFrequency")
    private String dataCollectionFrequency;

    /**
     * Usage data reporting frequency in ISO 8601 duration format e.g. PT10M ,
     * PT5H.
     */
    @JsonProperty(value = "dataReportingFrequency")
    private String dataReportingFrequency;

    /**
     * Maximum time for which the functionality of the device will not be
     * hampered for not reporting the usage data.
     */
    @JsonProperty(value = "maxAllowedUnreportedUsageDuration")
    private String maxAllowedUnreportedUsageDuration;

    /**
     * Details of Event Hub where the usage will be reported.
     */
    @JsonProperty(value = "eventHubDetails")
    private EdgeUsageDataEventHub eventHubDetails;

    /**
     * Get usage data collection frequency in ISO 8601 duration format e.g. PT10M , PT5H.
     *
     * @return the dataCollectionFrequency value
     */
    public String dataCollectionFrequency() {
        return this.dataCollectionFrequency;
    }

    /**
     * Set usage data collection frequency in ISO 8601 duration format e.g. PT10M , PT5H.
     *
     * @param dataCollectionFrequency the dataCollectionFrequency value to set
     * @return the EdgeUsageDataCollectionPolicy object itself.
     */
    public EdgeUsageDataCollectionPolicy withDataCollectionFrequency(String dataCollectionFrequency) {
        this.dataCollectionFrequency = dataCollectionFrequency;
        return this;
    }

    /**
     * Get usage data reporting frequency in ISO 8601 duration format e.g. PT10M , PT5H.
     *
     * @return the dataReportingFrequency value
     */
    public String dataReportingFrequency() {
        return this.dataReportingFrequency;
    }

    /**
     * Set usage data reporting frequency in ISO 8601 duration format e.g. PT10M , PT5H.
     *
     * @param dataReportingFrequency the dataReportingFrequency value to set
     * @return the EdgeUsageDataCollectionPolicy object itself.
     */
    public EdgeUsageDataCollectionPolicy withDataReportingFrequency(String dataReportingFrequency) {
        this.dataReportingFrequency = dataReportingFrequency;
        return this;
    }

    /**
     * Get maximum time for which the functionality of the device will not be hampered for not reporting the usage data.
     *
     * @return the maxAllowedUnreportedUsageDuration value
     */
    public String maxAllowedUnreportedUsageDuration() {
        return this.maxAllowedUnreportedUsageDuration;
    }

    /**
     * Set maximum time for which the functionality of the device will not be hampered for not reporting the usage data.
     *
     * @param maxAllowedUnreportedUsageDuration the maxAllowedUnreportedUsageDuration value to set
     * @return the EdgeUsageDataCollectionPolicy object itself.
     */
    public EdgeUsageDataCollectionPolicy withMaxAllowedUnreportedUsageDuration(String maxAllowedUnreportedUsageDuration) {
        this.maxAllowedUnreportedUsageDuration = maxAllowedUnreportedUsageDuration;
        return this;
    }

    /**
     * Get details of Event Hub where the usage will be reported.
     *
     * @return the eventHubDetails value
     */
    public EdgeUsageDataEventHub eventHubDetails() {
        return this.eventHubDetails;
    }

    /**
     * Set details of Event Hub where the usage will be reported.
     *
     * @param eventHubDetails the eventHubDetails value to set
     * @return the EdgeUsageDataCollectionPolicy object itself.
     */
    public EdgeUsageDataCollectionPolicy withEventHubDetails(EdgeUsageDataEventHub eventHubDetails) {
        this.eventHubDetails = eventHubDetails;
        return this;
    }

}

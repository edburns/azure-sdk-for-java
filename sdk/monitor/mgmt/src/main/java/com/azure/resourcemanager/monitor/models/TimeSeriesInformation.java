// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The TimeSeriesInformation model. */
@Fluent
public final class TimeSeriesInformation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TimeSeriesInformation.class);

    /*
     * the list of sensitivities for calculating the baseline.
     */
    @JsonProperty(value = "sensitivities", required = true)
    private List<String> sensitivities;

    /*
     * The metric values to calculate the baseline.
     */
    @JsonProperty(value = "values", required = true)
    private List<Double> values;

    /*
     * the array of timestamps of the baselines.
     */
    @JsonProperty(value = "timestamps")
    private List<OffsetDateTime> timestamps;

    /**
     * Get the sensitivities property: the list of sensitivities for calculating the baseline.
     *
     * @return the sensitivities value.
     */
    public List<String> sensitivities() {
        return this.sensitivities;
    }

    /**
     * Set the sensitivities property: the list of sensitivities for calculating the baseline.
     *
     * @param sensitivities the sensitivities value to set.
     * @return the TimeSeriesInformation object itself.
     */
    public TimeSeriesInformation withSensitivities(List<String> sensitivities) {
        this.sensitivities = sensitivities;
        return this;
    }

    /**
     * Get the values property: The metric values to calculate the baseline.
     *
     * @return the values value.
     */
    public List<Double> values() {
        return this.values;
    }

    /**
     * Set the values property: The metric values to calculate the baseline.
     *
     * @param values the values value to set.
     * @return the TimeSeriesInformation object itself.
     */
    public TimeSeriesInformation withValues(List<Double> values) {
        this.values = values;
        return this;
    }

    /**
     * Get the timestamps property: the array of timestamps of the baselines.
     *
     * @return the timestamps value.
     */
    public List<OffsetDateTime> timestamps() {
        return this.timestamps;
    }

    /**
     * Set the timestamps property: the array of timestamps of the baselines.
     *
     * @param timestamps the timestamps value to set.
     * @return the TimeSeriesInformation object itself.
     */
    public TimeSeriesInformation withTimestamps(List<OffsetDateTime> timestamps) {
        this.timestamps = timestamps;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sensitivities() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sensitivities in model TimeSeriesInformation"));
        }
        if (values() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property values in model TimeSeriesInformation"));
        }
    }
}

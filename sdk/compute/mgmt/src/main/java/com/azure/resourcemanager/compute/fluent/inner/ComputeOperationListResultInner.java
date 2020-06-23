// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.inner;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ComputeOperationListResult model. */
@Immutable
public final class ComputeOperationListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ComputeOperationListResultInner.class);

    /*
     * The list of compute operations
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<ComputeOperationValueInner> value;

    /**
     * Get the value property: The list of compute operations.
     *
     * @return the value value.
     */
    public List<ComputeOperationValueInner> value() {
        return this.value;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}

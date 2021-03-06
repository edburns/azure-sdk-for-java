// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The json object that contains properties required to create a security policy. */
@Fluent
public final class SecurityPolicyProperties extends AfdStateProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SecurityPolicyProperties.class);

    /*
     * object which contains security policy parameters
     */
    @JsonProperty(value = "parameters")
    private SecurityPolicyParameters parameters;

    /**
     * Get the parameters property: object which contains security policy parameters.
     *
     * @return the parameters value.
     */
    public SecurityPolicyParameters parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: object which contains security policy parameters.
     *
     * @param parameters the parameters value to set.
     * @return the SecurityPolicyProperties object itself.
     */
    public SecurityPolicyProperties withParameters(SecurityPolicyParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (parameters() != null) {
            parameters().validate();
        }
    }
}

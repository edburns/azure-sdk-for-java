// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;

/**
 * Initializes a new instance of the AccessControlClient type.
 */
public final class AccessControlClientImpl {
    /**
     * Client API version.
     */
    private String apiVersion;

    /**
     * Gets Client API version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * Sets Client API version.
     *
     * @param apiVersion the apiVersion value.
     */
    AccessControlClientImpl setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The RoleDefinitionsImpl object to access its operations.
     */
    private RoleDefinitionsImpl roleDefinitions;

    /**
     * Gets the RoleDefinitionsImpl object to access its operations.
     *
     * @return the RoleDefinitionsImpl object.
     */
    public RoleDefinitionsImpl roleDefinitions() {
        return this.roleDefinitions;
    }

    /**
     * The RoleAssignmentsImpl object to access its operations.
     */
    private RoleAssignmentsImpl roleAssignments;

    /**
     * Gets the RoleAssignmentsImpl object to access its operations.
     *
     * @return the RoleAssignmentsImpl object.
     */
    public RoleAssignmentsImpl roleAssignments() {
        return this.roleAssignments;
    }

    /**
     * Initializes an instance of AccessControlClient client.
     */
    public AccessControlClientImpl() {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build());
    }

    /**
     * Initializes an instance of AccessControlClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public AccessControlClientImpl(HttpPipeline httpPipeline) {
        this.httpPipeline = httpPipeline;
        this.roleDefinitions = new RoleDefinitionsImpl(this);
        this.roleAssignments = new RoleAssignmentsImpl(this);
    }
}
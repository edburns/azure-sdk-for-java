/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Common error details representation.
 */
public class ErrorDetails {
    /**
     * Error code.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * Error target.
     */
    @JsonProperty(value = "target")
    private String target;

    /**
     * Error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get error code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set error code.
     *
     * @param code the code value to set
     * @return the ErrorDetails object itself.
     */
    public ErrorDetails withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get error target.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Set error target.
     *
     * @param target the target value to set
     * @return the ErrorDetails object itself.
     */
    public ErrorDetails withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get error message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set error message.
     *
     * @param message the message value to set
     * @return the ErrorDetails object itself.
     */
    public ErrorDetails withMessage(String message) {
        this.message = message;
        return this;
    }

}

/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Exclude variables from managed rule evaluation.
 */
public class ManagedRuleExclusion {
    /**
     * The variable type to be excluded. Possible values include:
     * 'RequestHeaderNames', 'RequestCookieNames', 'QueryStringArgNames',
     * 'RequestBodyPostArgNames'.
     */
    @JsonProperty(value = "matchVariable", required = true)
    private ManagedRuleExclusionMatchVariable matchVariable;

    /**
     * Comparison operator to apply to the selector when specifying which
     * elements in the collection this exclusion applies to. Possible values
     * include: 'Equals', 'Contains', 'StartsWith', 'EndsWith', 'EqualsAny'.
     */
    @JsonProperty(value = "selectorMatchOperator", required = true)
    private ManagedRuleExclusionSelectorMatchOperator selectorMatchOperator;

    /**
     * Selector value for which elements in the collection this exclusion
     * applies to.
     */
    @JsonProperty(value = "selector", required = true)
    private String selector;

    /**
     * Get the variable type to be excluded. Possible values include: 'RequestHeaderNames', 'RequestCookieNames', 'QueryStringArgNames', 'RequestBodyPostArgNames'.
     *
     * @return the matchVariable value
     */
    public ManagedRuleExclusionMatchVariable matchVariable() {
        return this.matchVariable;
    }

    /**
     * Set the variable type to be excluded. Possible values include: 'RequestHeaderNames', 'RequestCookieNames', 'QueryStringArgNames', 'RequestBodyPostArgNames'.
     *
     * @param matchVariable the matchVariable value to set
     * @return the ManagedRuleExclusion object itself.
     */
    public ManagedRuleExclusion withMatchVariable(ManagedRuleExclusionMatchVariable matchVariable) {
        this.matchVariable = matchVariable;
        return this;
    }

    /**
     * Get comparison operator to apply to the selector when specifying which elements in the collection this exclusion applies to. Possible values include: 'Equals', 'Contains', 'StartsWith', 'EndsWith', 'EqualsAny'.
     *
     * @return the selectorMatchOperator value
     */
    public ManagedRuleExclusionSelectorMatchOperator selectorMatchOperator() {
        return this.selectorMatchOperator;
    }

    /**
     * Set comparison operator to apply to the selector when specifying which elements in the collection this exclusion applies to. Possible values include: 'Equals', 'Contains', 'StartsWith', 'EndsWith', 'EqualsAny'.
     *
     * @param selectorMatchOperator the selectorMatchOperator value to set
     * @return the ManagedRuleExclusion object itself.
     */
    public ManagedRuleExclusion withSelectorMatchOperator(ManagedRuleExclusionSelectorMatchOperator selectorMatchOperator) {
        this.selectorMatchOperator = selectorMatchOperator;
        return this;
    }

    /**
     * Get selector value for which elements in the collection this exclusion applies to.
     *
     * @return the selector value
     */
    public String selector() {
        return this.selector;
    }

    /**
     * Set selector value for which elements in the collection this exclusion applies to.
     *
     * @param selector the selector value to set
     * @return the ManagedRuleExclusion object itself.
     */
    public ManagedRuleExclusion withSelector(String selector) {
        this.selector = selector;
        return this;
    }

}

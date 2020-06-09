/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for IpActionType.
 */
public final class IpActionType extends ExpandableStringEnum<IpActionType> {
    /** Static value Allow for IpActionType. */
    public static final IpActionType ALLOW = fromString("Allow");

    /**
     * Creates or finds a IpActionType from its string representation.
     * @param name a name to look for
     * @return the corresponding IpActionType
     */
    @JsonCreator
    public static IpActionType fromString(String name) {
        return fromString(name, IpActionType.class);
    }

    /**
     * @return known IpActionType values
     */
    public static Collection<IpActionType> values() {
        return values(IpActionType.class);
    }
}
/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2019_09_01;

import rx.Observable;
import com.microsoft.azure.management.keyvault.v2019_09_01.implementation.PrivateLinkResourcesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PrivateLinkResources.
 */
public interface PrivateLinkResources extends HasInner<PrivateLinkResourcesInner> {
    /**
     * Gets the private link resources supported for the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PrivateLinkResourceListResult> listByVaultAsync(String resourceGroupName, String vaultName);

}

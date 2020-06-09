// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.tables.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import java.util.Map;

/** Contains all response data for the insertEntity operation. */
public final class TablesInsertEntityResponse extends ResponseBase<TablesInsertEntityHeaders, Map<String, Object>> {
    /**
     * Creates an instance of TablesInsertEntityResponse.
     *
     * @param request the request which resulted in this TablesInsertEntityResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public TablesInsertEntityResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            Map<String, Object> value,
            TablesInsertEntityHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public Map<String, Object> getValue() {
        return super.getValue();
    }
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.billing.fluent.models.InvoiceSectionInner;

/**
 * Resource collection API of InvoiceSections.
 */
public interface InvoiceSections {
    /**
     * Validates if the invoice section can be deleted. The operation is supported for billing accounts with agreement
     * type Microsoft Customer Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return eligibility to delete an invoice section result along with {@link Response}.
     */
    Response<DeleteInvoiceSectionEligibilityResult> validateDeleteEligibilityWithResponse(String billingAccountName,
        String billingProfileName, String invoiceSectionName, Context context);

    /**
     * Validates if the invoice section can be deleted. The operation is supported for billing accounts with agreement
     * type Microsoft Customer Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return eligibility to delete an invoice section result.
     */
    DeleteInvoiceSectionEligibilityResult validateDeleteEligibility(String billingAccountName,
        String billingProfileName, String invoiceSectionName);

    /**
     * Deletes an invoice section. The operation is supported for billing accounts with agreement type Microsoft
     * Customer Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String billingAccountName, String billingProfileName, String invoiceSectionName);

    /**
     * Deletes an invoice section. The operation is supported for billing accounts with agreement type Microsoft
     * Customer Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String billingAccountName, String billingProfileName, String invoiceSectionName, Context context);

    /**
     * Gets an invoice section by its ID. The operation is supported only for billing accounts with agreement type
     * Microsoft Customer Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an invoice section by its ID along with {@link Response}.
     */
    Response<InvoiceSection> getWithResponse(String billingAccountName, String billingProfileName,
        String invoiceSectionName, Context context);

    /**
     * Gets an invoice section by its ID. The operation is supported only for billing accounts with agreement type
     * Microsoft Customer Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an invoice section by its ID.
     */
    InvoiceSection get(String billingAccountName, String billingProfileName, String invoiceSectionName);

    /**
     * Creates or updates an invoice section. The operation is supported only for billing accounts with agreement type
     * Microsoft Customer Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param parameters An invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an invoice section.
     */
    InvoiceSection createOrUpdate(String billingAccountName, String billingProfileName, String invoiceSectionName,
        InvoiceSectionInner parameters);

    /**
     * Creates or updates an invoice section. The operation is supported only for billing accounts with agreement type
     * Microsoft Customer Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param parameters An invoice section.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an invoice section.
     */
    InvoiceSection createOrUpdate(String billingAccountName, String billingProfileName, String invoiceSectionName,
        InvoiceSectionInner parameters, Context context);

    /**
     * Lists the invoice sections that a user has access to. The operation is supported only for billing accounts with
     * agreement type Microsoft Customer Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container for a list of resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<InvoiceSection> listByBillingProfile(String billingAccountName, String billingProfileName);

    /**
     * Lists the invoice sections that a user has access to. The operation is supported only for billing accounts with
     * agreement type Microsoft Customer Agreement.
     * 
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param includeDeleted Can be used to get deleted invoice sections.
     * @param filter The filter query option allows clients to filter a collection of resources that are addressed by a
     * request URL.
     * @param orderBy The orderby query option allows clients to request resources in a particular order.
     * @param top The top query option requests the number of items in the queried collection to be included in the
     * result. The maximum supported value for top is 50.
     * @param skip The skip query option requests the number of items in the queried collection that are to be skipped
     * and not included in the result.
     * @param count The count query option allows clients to request a count of the matching resources included with the
     * resources in the response.
     * @param search The search query option allows clients to request items within a collection matching a free-text
     * search expression. search is only supported for string fields.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container for a list of resources as paginated response with {@link PagedIterable}.
     */
    PagedIterable<InvoiceSection> listByBillingProfile(String billingAccountName, String billingProfileName,
        Boolean includeDeleted, String filter, String orderBy, Long top, Long skip, Boolean count, String search,
        Context context);
}

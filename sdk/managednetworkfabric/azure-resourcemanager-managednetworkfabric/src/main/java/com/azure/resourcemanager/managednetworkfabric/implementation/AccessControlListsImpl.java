// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.fluent.AccessControlListsClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.AccessControlListInner;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.CommonPostActionResponseForStateUpdateInner;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.ValidateConfigurationResponseInner;
import com.azure.resourcemanager.managednetworkfabric.models.AccessControlList;
import com.azure.resourcemanager.managednetworkfabric.models.AccessControlLists;
import com.azure.resourcemanager.managednetworkfabric.models.CommonPostActionResponseForStateUpdate;
import com.azure.resourcemanager.managednetworkfabric.models.UpdateAdministrativeState;
import com.azure.resourcemanager.managednetworkfabric.models.ValidateConfigurationResponse;

public final class AccessControlListsImpl implements AccessControlLists {
    private static final ClientLogger LOGGER = new ClientLogger(AccessControlListsImpl.class);

    private final AccessControlListsClient innerClient;

    private final com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager;

    public AccessControlListsImpl(AccessControlListsClient innerClient,
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<AccessControlList> getByResourceGroupWithResponse(String resourceGroupName,
        String accessControlListName, Context context) {
        Response<AccessControlListInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, accessControlListName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AccessControlListImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessControlList getByResourceGroup(String resourceGroupName, String accessControlListName) {
        AccessControlListInner inner
            = this.serviceClient().getByResourceGroup(resourceGroupName, accessControlListName);
        if (inner != null) {
            return new AccessControlListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String accessControlListName) {
        this.serviceClient().delete(resourceGroupName, accessControlListName);
    }

    public void delete(String resourceGroupName, String accessControlListName, Context context) {
        this.serviceClient().delete(resourceGroupName, accessControlListName, context);
    }

    public PagedIterable<AccessControlList> listByResourceGroup(String resourceGroupName) {
        PagedIterable<AccessControlListInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AccessControlListImpl(inner1, this.manager()));
    }

    public PagedIterable<AccessControlList> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<AccessControlListInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AccessControlListImpl(inner1, this.manager()));
    }

    public PagedIterable<AccessControlList> list() {
        PagedIterable<AccessControlListInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AccessControlListImpl(inner1, this.manager()));
    }

    public PagedIterable<AccessControlList> list(Context context) {
        PagedIterable<AccessControlListInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AccessControlListImpl(inner1, this.manager()));
    }

    public CommonPostActionResponseForStateUpdate updateAdministrativeState(String resourceGroupName,
        String accessControlListName, UpdateAdministrativeState body) {
        CommonPostActionResponseForStateUpdateInner inner
            = this.serviceClient().updateAdministrativeState(resourceGroupName, accessControlListName, body);
        if (inner != null) {
            return new CommonPostActionResponseForStateUpdateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public CommonPostActionResponseForStateUpdate updateAdministrativeState(String resourceGroupName,
        String accessControlListName, UpdateAdministrativeState body, Context context) {
        CommonPostActionResponseForStateUpdateInner inner
            = this.serviceClient().updateAdministrativeState(resourceGroupName, accessControlListName, body, context);
        if (inner != null) {
            return new CommonPostActionResponseForStateUpdateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public CommonPostActionResponseForStateUpdate resync(String resourceGroupName, String accessControlListName) {
        CommonPostActionResponseForStateUpdateInner inner
            = this.serviceClient().resync(resourceGroupName, accessControlListName);
        if (inner != null) {
            return new CommonPostActionResponseForStateUpdateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public CommonPostActionResponseForStateUpdate resync(String resourceGroupName, String accessControlListName,
        Context context) {
        CommonPostActionResponseForStateUpdateInner inner
            = this.serviceClient().resync(resourceGroupName, accessControlListName, context);
        if (inner != null) {
            return new CommonPostActionResponseForStateUpdateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ValidateConfigurationResponse validateConfiguration(String resourceGroupName, String accessControlListName) {
        ValidateConfigurationResponseInner inner
            = this.serviceClient().validateConfiguration(resourceGroupName, accessControlListName);
        if (inner != null) {
            return new ValidateConfigurationResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ValidateConfigurationResponse validateConfiguration(String resourceGroupName, String accessControlListName,
        Context context) {
        ValidateConfigurationResponseInner inner
            = this.serviceClient().validateConfiguration(resourceGroupName, accessControlListName, context);
        if (inner != null) {
            return new ValidateConfigurationResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AccessControlList getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accessControlListName = ResourceManagerUtils.getValueFromIdByName(id, "accessControlLists");
        if (accessControlListName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'accessControlLists'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, accessControlListName, Context.NONE).getValue();
    }

    public Response<AccessControlList> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accessControlListName = ResourceManagerUtils.getValueFromIdByName(id, "accessControlLists");
        if (accessControlListName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'accessControlLists'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, accessControlListName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accessControlListName = ResourceManagerUtils.getValueFromIdByName(id, "accessControlLists");
        if (accessControlListName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'accessControlLists'.", id)));
        }
        this.delete(resourceGroupName, accessControlListName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accessControlListName = ResourceManagerUtils.getValueFromIdByName(id, "accessControlLists");
        if (accessControlListName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'accessControlLists'.", id)));
        }
        this.delete(resourceGroupName, accessControlListName, context);
    }

    private AccessControlListsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager() {
        return this.serviceManager;
    }

    public AccessControlListImpl define(String name) {
        return new AccessControlListImpl(name, this.manager());
    }
}

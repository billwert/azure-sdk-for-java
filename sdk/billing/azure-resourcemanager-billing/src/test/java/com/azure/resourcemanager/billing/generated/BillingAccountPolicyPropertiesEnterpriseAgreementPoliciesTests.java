// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.BillingAccountPolicyPropertiesEnterpriseAgreementPolicies;
import com.azure.resourcemanager.billing.models.EnrollmentAccountOwnerViewCharges;
import com.azure.resourcemanager.billing.models.EnrollmentAuthLevelState;
import com.azure.resourcemanager.billing.models.EnrollmentDepartmentAdminViewCharges;
import org.junit.jupiter.api.Assertions;

public final class BillingAccountPolicyPropertiesEnterpriseAgreementPoliciesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BillingAccountPolicyPropertiesEnterpriseAgreementPolicies model = BinaryData.fromString(
            "{\"authenticationType\":\"OrganizationalAccountCrossTenant\",\"accountOwnerViewCharges\":\"NotAllowed\",\"departmentAdminViewCharges\":\"Other\"}")
            .toObject(BillingAccountPolicyPropertiesEnterpriseAgreementPolicies.class);
        Assertions.assertEquals(EnrollmentAuthLevelState.ORGANIZATIONAL_ACCOUNT_CROSS_TENANT,
            model.authenticationType());
        Assertions.assertEquals(EnrollmentAccountOwnerViewCharges.NOT_ALLOWED, model.accountOwnerViewCharges());
        Assertions.assertEquals(EnrollmentDepartmentAdminViewCharges.OTHER, model.departmentAdminViewCharges());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BillingAccountPolicyPropertiesEnterpriseAgreementPolicies model
            = new BillingAccountPolicyPropertiesEnterpriseAgreementPolicies()
                .withAuthenticationType(EnrollmentAuthLevelState.ORGANIZATIONAL_ACCOUNT_CROSS_TENANT)
                .withAccountOwnerViewCharges(EnrollmentAccountOwnerViewCharges.NOT_ALLOWED)
                .withDepartmentAdminViewCharges(EnrollmentDepartmentAdminViewCharges.OTHER);
        model = BinaryData.fromObject(model).toObject(BillingAccountPolicyPropertiesEnterpriseAgreementPolicies.class);
        Assertions.assertEquals(EnrollmentAuthLevelState.ORGANIZATIONAL_ACCOUNT_CROSS_TENANT,
            model.authenticationType());
        Assertions.assertEquals(EnrollmentAccountOwnerViewCharges.NOT_ALLOWED, model.accountOwnerViewCharges());
        Assertions.assertEquals(EnrollmentDepartmentAdminViewCharges.OTHER, model.departmentAdminViewCharges());
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagepool.models.Acl;
import com.azure.resourcemanager.storagepool.models.IscsiLun;
import com.azure.resourcemanager.storagepool.models.IscsiTargetAclMode;
import com.azure.resourcemanager.storagepool.models.IscsiTargetCreate;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class IscsiTargetCreateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IscsiTargetCreate model = BinaryData.fromString(
            "{\"properties\":{\"aclMode\":\"Static\",\"targetIqn\":\"xgc\",\"staticAcls\":[{\"initiatorIqn\":\"brh\",\"mappedLuns\":[\"xsdqrhzoymibmrqy\",\"bahwfl\",\"szdtmhrkwof\",\"yvoqa\"]},{\"initiatorIqn\":\"piexpbtgiw\",\"mappedLuns\":[\"oenwashr\"]},{\"initiatorIqn\":\"dtkcnqxwbpokulp\",\"mappedLuns\":[\"jwaa\"]}],\"luns\":[{\"name\":\"qiiobyuqer\",\"managedDiskAzureResourceId\":\"qlpqwcciuq\",\"lun\":1816858814},{\"name\":\"butauvfb\",\"managedDiskAzureResourceId\":\"kuwhh\",\"lun\":1745648414},{\"name\":\"k\",\"managedDiskAzureResourceId\":\"joxafnndlpi\",\"lun\":1639639314}]},\"managedBy\":\"ymkcdyhb\",\"managedByExtended\":[\"pwdreqnovvqf\"],\"id\":\"vljxywsu\",\"name\":\"syrsndsytgadgvra\",\"type\":\"aeneqnzarrwl\"}")
            .toObject(IscsiTargetCreate.class);
        Assertions.assertEquals("ymkcdyhb", model.managedBy());
        Assertions.assertEquals("pwdreqnovvqf", model.managedByExtended().get(0));
        Assertions.assertEquals(IscsiTargetAclMode.STATIC, model.aclMode());
        Assertions.assertEquals("xgc", model.targetIqn());
        Assertions.assertEquals("brh", model.staticAcls().get(0).initiatorIqn());
        Assertions.assertEquals("xsdqrhzoymibmrqy", model.staticAcls().get(0).mappedLuns().get(0));
        Assertions.assertEquals("qiiobyuqer", model.luns().get(0).name());
        Assertions.assertEquals("qlpqwcciuq", model.luns().get(0).managedDiskAzureResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IscsiTargetCreate model = new IscsiTargetCreate().withManagedBy("ymkcdyhb")
            .withManagedByExtended(Arrays.asList("pwdreqnovvqf"))
            .withAclMode(IscsiTargetAclMode.STATIC)
            .withTargetIqn("xgc")
            .withStaticAcls(Arrays.asList(
                new Acl().withInitiatorIqn("brh")
                    .withMappedLuns(Arrays.asList("xsdqrhzoymibmrqy", "bahwfl", "szdtmhrkwof", "yvoqa")),
                new Acl().withInitiatorIqn("piexpbtgiw").withMappedLuns(Arrays.asList("oenwashr")),
                new Acl().withInitiatorIqn("dtkcnqxwbpokulp").withMappedLuns(Arrays.asList("jwaa"))))
            .withLuns(Arrays.asList(new IscsiLun().withName("qiiobyuqer").withManagedDiskAzureResourceId("qlpqwcciuq"),
                new IscsiLun().withName("butauvfb").withManagedDiskAzureResourceId("kuwhh"),
                new IscsiLun().withName("k").withManagedDiskAzureResourceId("joxafnndlpi")));
        model = BinaryData.fromObject(model).toObject(IscsiTargetCreate.class);
        Assertions.assertEquals("ymkcdyhb", model.managedBy());
        Assertions.assertEquals("pwdreqnovvqf", model.managedByExtended().get(0));
        Assertions.assertEquals(IscsiTargetAclMode.STATIC, model.aclMode());
        Assertions.assertEquals("xgc", model.targetIqn());
        Assertions.assertEquals("brh", model.staticAcls().get(0).initiatorIqn());
        Assertions.assertEquals("xsdqrhzoymibmrqy", model.staticAcls().get(0).mappedLuns().get(0));
        Assertions.assertEquals("qiiobyuqer", model.luns().get(0).name());
        Assertions.assertEquals("qlpqwcciuq", model.luns().get(0).managedDiskAzureResourceId());
    }
}

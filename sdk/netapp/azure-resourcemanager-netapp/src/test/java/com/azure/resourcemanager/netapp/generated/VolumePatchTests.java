// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.ChownMode;
import com.azure.resourcemanager.netapp.models.CoolAccessRetrievalPolicy;
import com.azure.resourcemanager.netapp.models.CoolAccessTieringPolicy;
import com.azure.resourcemanager.netapp.models.ExportPolicyRule;
import com.azure.resourcemanager.netapp.models.ServiceLevel;
import com.azure.resourcemanager.netapp.models.SmbAccessBasedEnumeration;
import com.azure.resourcemanager.netapp.models.SmbNonBrowsable;
import com.azure.resourcemanager.netapp.models.VolumeBackupProperties;
import com.azure.resourcemanager.netapp.models.VolumePatch;
import com.azure.resourcemanager.netapp.models.VolumePatchPropertiesDataProtection;
import com.azure.resourcemanager.netapp.models.VolumePatchPropertiesExportPolicy;
import com.azure.resourcemanager.netapp.models.VolumeSnapshotProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class VolumePatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumePatch model = BinaryData.fromString(
            "{\"properties\":{\"serviceLevel\":\"StandardZRS\",\"usageThreshold\":8579990630368040334,\"exportPolicy\":{\"rules\":[{\"ruleIndex\":478767297,\"unixReadOnly\":false,\"unixReadWrite\":false,\"kerberos5ReadOnly\":false,\"kerberos5ReadWrite\":true,\"kerberos5iReadOnly\":false,\"kerberos5iReadWrite\":false,\"kerberos5pReadOnly\":false,\"kerberos5pReadWrite\":false,\"cifs\":true,\"nfsv3\":true,\"nfsv41\":true,\"allowedClients\":\"edplvwiwubmw\",\"hasRootAccess\":false,\"chownMode\":\"Unrestricted\"},{\"ruleIndex\":1055481655,\"unixReadOnly\":false,\"unixReadWrite\":false,\"kerberos5ReadOnly\":true,\"kerberos5ReadWrite\":false,\"kerberos5iReadOnly\":true,\"kerberos5iReadWrite\":false,\"kerberos5pReadOnly\":true,\"kerberos5pReadWrite\":true,\"cifs\":true,\"nfsv3\":false,\"nfsv41\":true,\"allowedClients\":\"kvmkqzeqq\",\"hasRootAccess\":false,\"chownMode\":\"Unrestricted\"},{\"ruleIndex\":684892546,\"unixReadOnly\":false,\"unixReadWrite\":false,\"kerberos5ReadOnly\":true,\"kerberos5ReadWrite\":false,\"kerberos5iReadOnly\":false,\"kerberos5iReadWrite\":true,\"kerberos5pReadOnly\":true,\"kerberos5pReadWrite\":true,\"cifs\":true,\"nfsv3\":true,\"nfsv41\":false,\"allowedClients\":\"dxbx\",\"hasRootAccess\":true,\"chownMode\":\"Unrestricted\"}]},\"protocolTypes\":[\"xndlkzgxhu\"],\"throughputMibps\":53.371555,\"dataProtection\":{\"backup\":{\"backupPolicyId\":\"odxun\",\"policyEnforced\":true,\"backupVaultId\":\"xmubyyntwlrbq\"},\"snapshot\":{\"snapshotPolicyId\":\"ievseotgqrllt\"}},\"isDefaultQuotaEnabled\":true,\"defaultUserQuotaInKiBs\":3793721948753294900,\"defaultGroupQuotaInKiBs\":1220428875779333606,\"unixPermissions\":\"xbmp\",\"coolAccess\":true,\"coolnessPeriod\":473319481,\"coolAccessRetrievalPolicy\":\"Default\",\"coolAccessTieringPolicy\":\"Auto\",\"snapshotDirectoryVisible\":false,\"smbAccessBasedEnumeration\":\"Enabled\",\"smbNonBrowsable\":\"Disabled\"},\"location\":\"um\",\"tags\":{\"hjpglkf\":\"pxebmnzbt\"},\"id\":\"ohdneuel\",\"name\":\"phsdyhto\",\"type\":\"fikdowwqu\"}")
            .toObject(VolumePatch.class);
        Assertions.assertEquals("um", model.location());
        Assertions.assertEquals("pxebmnzbt", model.tags().get("hjpglkf"));
        Assertions.assertEquals(ServiceLevel.STANDARD_ZRS, model.serviceLevel());
        Assertions.assertEquals(8579990630368040334L, model.usageThreshold());
        Assertions.assertEquals(478767297, model.exportPolicy().rules().get(0).ruleIndex());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).unixReadOnly());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).unixReadWrite());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5ReadOnly());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5ReadWrite());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5IReadOnly());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5IReadWrite());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5PReadOnly());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5PReadWrite());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).cifs());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).nfsv3());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).nfsv41());
        Assertions.assertEquals("edplvwiwubmw", model.exportPolicy().rules().get(0).allowedClients());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).hasRootAccess());
        Assertions.assertEquals(ChownMode.UNRESTRICTED, model.exportPolicy().rules().get(0).chownMode());
        Assertions.assertEquals("xndlkzgxhu", model.protocolTypes().get(0));
        Assertions.assertEquals(53.371555F, model.throughputMibps());
        Assertions.assertEquals("odxun", model.dataProtection().backup().backupPolicyId());
        Assertions.assertEquals(true, model.dataProtection().backup().policyEnforced());
        Assertions.assertEquals("xmubyyntwlrbq", model.dataProtection().backup().backupVaultId());
        Assertions.assertEquals("ievseotgqrllt", model.dataProtection().snapshot().snapshotPolicyId());
        Assertions.assertEquals(true, model.isDefaultQuotaEnabled());
        Assertions.assertEquals(3793721948753294900L, model.defaultUserQuotaInKiBs());
        Assertions.assertEquals(1220428875779333606L, model.defaultGroupQuotaInKiBs());
        Assertions.assertEquals("xbmp", model.unixPermissions());
        Assertions.assertEquals(true, model.coolAccess());
        Assertions.assertEquals(473319481, model.coolnessPeriod());
        Assertions.assertEquals(CoolAccessRetrievalPolicy.DEFAULT, model.coolAccessRetrievalPolicy());
        Assertions.assertEquals(CoolAccessTieringPolicy.AUTO, model.coolAccessTieringPolicy());
        Assertions.assertEquals(false, model.snapshotDirectoryVisible());
        Assertions.assertEquals(SmbAccessBasedEnumeration.ENABLED, model.smbAccessBasedEnumeration());
        Assertions.assertEquals(SmbNonBrowsable.DISABLED, model.smbNonBrowsable());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumePatch model = new VolumePatch().withLocation("um")
            .withTags(mapOf("hjpglkf", "pxebmnzbt"))
            .withServiceLevel(ServiceLevel.STANDARD_ZRS)
            .withUsageThreshold(8579990630368040334L)
            .withExportPolicy(new VolumePatchPropertiesExportPolicy().withRules(Arrays.asList(
                new ExportPolicyRule().withRuleIndex(478767297)
                    .withUnixReadOnly(false)
                    .withUnixReadWrite(false)
                    .withKerberos5ReadOnly(false)
                    .withKerberos5ReadWrite(true)
                    .withKerberos5IReadOnly(false)
                    .withKerberos5IReadWrite(false)
                    .withKerberos5PReadOnly(false)
                    .withKerberos5PReadWrite(false)
                    .withCifs(true)
                    .withNfsv3(true)
                    .withNfsv41(true)
                    .withAllowedClients("edplvwiwubmw")
                    .withHasRootAccess(false)
                    .withChownMode(ChownMode.UNRESTRICTED),
                new ExportPolicyRule().withRuleIndex(1055481655)
                    .withUnixReadOnly(false)
                    .withUnixReadWrite(false)
                    .withKerberos5ReadOnly(true)
                    .withKerberos5ReadWrite(false)
                    .withKerberos5IReadOnly(true)
                    .withKerberos5IReadWrite(false)
                    .withKerberos5PReadOnly(true)
                    .withKerberos5PReadWrite(true)
                    .withCifs(true)
                    .withNfsv3(false)
                    .withNfsv41(true)
                    .withAllowedClients("kvmkqzeqq")
                    .withHasRootAccess(false)
                    .withChownMode(ChownMode.UNRESTRICTED),
                new ExportPolicyRule().withRuleIndex(684892546)
                    .withUnixReadOnly(false)
                    .withUnixReadWrite(false)
                    .withKerberos5ReadOnly(true)
                    .withKerberos5ReadWrite(false)
                    .withKerberos5IReadOnly(false)
                    .withKerberos5IReadWrite(true)
                    .withKerberos5PReadOnly(true)
                    .withKerberos5PReadWrite(true)
                    .withCifs(true)
                    .withNfsv3(true)
                    .withNfsv41(false)
                    .withAllowedClients("dxbx")
                    .withHasRootAccess(true)
                    .withChownMode(ChownMode.UNRESTRICTED))))
            .withProtocolTypes(Arrays.asList("xndlkzgxhu"))
            .withThroughputMibps(53.371555F)
            .withDataProtection(new VolumePatchPropertiesDataProtection()
                .withBackup(new VolumeBackupProperties().withBackupPolicyId("odxun")
                    .withPolicyEnforced(true)
                    .withBackupVaultId("xmubyyntwlrbq"))
                .withSnapshot(new VolumeSnapshotProperties().withSnapshotPolicyId("ievseotgqrllt")))
            .withIsDefaultQuotaEnabled(true)
            .withDefaultUserQuotaInKiBs(3793721948753294900L)
            .withDefaultGroupQuotaInKiBs(1220428875779333606L)
            .withUnixPermissions("xbmp")
            .withCoolAccess(true)
            .withCoolnessPeriod(473319481)
            .withCoolAccessRetrievalPolicy(CoolAccessRetrievalPolicy.DEFAULT)
            .withCoolAccessTieringPolicy(CoolAccessTieringPolicy.AUTO)
            .withSnapshotDirectoryVisible(false)
            .withSmbAccessBasedEnumeration(SmbAccessBasedEnumeration.ENABLED)
            .withSmbNonBrowsable(SmbNonBrowsable.DISABLED);
        model = BinaryData.fromObject(model).toObject(VolumePatch.class);
        Assertions.assertEquals("um", model.location());
        Assertions.assertEquals("pxebmnzbt", model.tags().get("hjpglkf"));
        Assertions.assertEquals(ServiceLevel.STANDARD_ZRS, model.serviceLevel());
        Assertions.assertEquals(8579990630368040334L, model.usageThreshold());
        Assertions.assertEquals(478767297, model.exportPolicy().rules().get(0).ruleIndex());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).unixReadOnly());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).unixReadWrite());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5ReadOnly());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5ReadWrite());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5IReadOnly());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5IReadWrite());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5PReadOnly());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5PReadWrite());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).cifs());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).nfsv3());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).nfsv41());
        Assertions.assertEquals("edplvwiwubmw", model.exportPolicy().rules().get(0).allowedClients());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).hasRootAccess());
        Assertions.assertEquals(ChownMode.UNRESTRICTED, model.exportPolicy().rules().get(0).chownMode());
        Assertions.assertEquals("xndlkzgxhu", model.protocolTypes().get(0));
        Assertions.assertEquals(53.371555F, model.throughputMibps());
        Assertions.assertEquals("odxun", model.dataProtection().backup().backupPolicyId());
        Assertions.assertEquals(true, model.dataProtection().backup().policyEnforced());
        Assertions.assertEquals("xmubyyntwlrbq", model.dataProtection().backup().backupVaultId());
        Assertions.assertEquals("ievseotgqrllt", model.dataProtection().snapshot().snapshotPolicyId());
        Assertions.assertEquals(true, model.isDefaultQuotaEnabled());
        Assertions.assertEquals(3793721948753294900L, model.defaultUserQuotaInKiBs());
        Assertions.assertEquals(1220428875779333606L, model.defaultGroupQuotaInKiBs());
        Assertions.assertEquals("xbmp", model.unixPermissions());
        Assertions.assertEquals(true, model.coolAccess());
        Assertions.assertEquals(473319481, model.coolnessPeriod());
        Assertions.assertEquals(CoolAccessRetrievalPolicy.DEFAULT, model.coolAccessRetrievalPolicy());
        Assertions.assertEquals(CoolAccessTieringPolicy.AUTO, model.coolAccessTieringPolicy());
        Assertions.assertEquals(false, model.snapshotDirectoryVisible());
        Assertions.assertEquals(SmbAccessBasedEnumeration.ENABLED, model.smbAccessBasedEnumeration());
        Assertions.assertEquals(SmbNonBrowsable.DISABLED, model.smbNonBrowsable());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}

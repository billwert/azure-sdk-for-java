// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.neonpostgres.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.neonpostgres.implementation.models.NeonDatabaseListResult;
import org.junit.jupiter.api.Assertions;

public final class NeonDatabaseListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NeonDatabaseListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"entityId\":\"fdqwowftpt\",\"entityName\":\"wjtkschgcgqyhl\",\"createdAt\":\"eyqrhv\",\"provisioningState\":\"Succeeded\",\"attributes\":[{\"name\":\"tj\",\"value\":\"dkwisw\"},{\"name\":\"kukjtasb\",\"value\":\"wispkxk\"},{\"name\":\"txfkndlqvt\",\"value\":\"knvgmmbugtywat\"},{\"name\":\"qaqkuea\",\"value\":\"groeshoyg\"}],\"branchId\":\"byfqxkfaoy\",\"ownerName\":\"h\"},\"id\":\"uvjmv\",\"name\":\"mtdwcky\",\"type\":\"roejnndl\"},{\"properties\":{\"entityId\":\"uskbrreq\",\"entityName\":\"kceysfaqegplw\",\"createdAt\":\"shwddkvbxgk\",\"provisioningState\":\"Failed\",\"attributes\":[{\"name\":\"w\",\"value\":\"tdacarvvlfn\"},{\"name\":\"ymtpo\",\"value\":\"wenaz\"},{\"name\":\"r\",\"value\":\"hzr\"},{\"name\":\"qalsxkd\",\"value\":\"wqapfgsdp\"}],\"branchId\":\"essmzhhku\",\"ownerName\":\"pldqqct\"},\"id\":\"valblhtjqv\",\"name\":\"yvwehtaemxh\",\"type\":\"zysevusxi\"},{\"properties\":{\"entityId\":\"rryveimipskdy\",\"entityName\":\"tv\",\"createdAt\":\"zkaftjvvrux\",\"provisioningState\":\"Canceled\",\"attributes\":[{\"name\":\"ei\",\"value\":\"qdsmjtg\"}],\"branchId\":\"gdgkki\",\"ownerName\":\"plkcsm\"},\"id\":\"hwtbbaedorvvm\",\"name\":\"floygbdgwumg\",\"type\":\"dgdhpabgdexj\"},{\"properties\":{\"entityId\":\"jsaqwotmmwllcols\",\"entityName\":\"xaptefhexcgjok\",\"createdAt\":\"jnhvlqjbekpeeks\",\"provisioningState\":\"Failed\",\"attributes\":[{\"name\":\"qhjvyklxeslkhhu\",\"value\":\"tcpoqma\"},{\"name\":\"nwqjwgokn\",\"value\":\"ejjjkxybwfdb\"},{\"name\":\"jbzten\",\"value\":\"vkzykjtjknsxf\"},{\"name\":\"us\",\"value\":\"cdp\"}],\"branchId\":\"pn\",\"ownerName\":\"mgjfbpkuwxeoio\"},\"id\":\"izfavkjzwf\",\"name\":\"cyayk\",\"type\":\"mfzsbf\"}],\"nextLink\":\"rzx\"}")
            .toObject(NeonDatabaseListResult.class);
        Assertions.assertEquals("wjtkschgcgqyhl", model.value().get(0).properties().entityName());
        Assertions.assertEquals("tj", model.value().get(0).properties().attributes().get(0).name());
        Assertions.assertEquals("dkwisw", model.value().get(0).properties().attributes().get(0).value());
        Assertions.assertEquals("byfqxkfaoy", model.value().get(0).properties().branchId());
        Assertions.assertEquals("h", model.value().get(0).properties().ownerName());
        Assertions.assertEquals("rzx", model.nextLink());
    }
}

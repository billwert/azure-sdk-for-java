// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.Db2TableDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class Db2TableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Db2TableDataset model = BinaryData.fromString(
            "{\"type\":\"Db2Table\",\"typeProperties\":{\"tableName\":\"datarsvxphtjnhptj\",\"schema\":\"datak\",\"table\":\"datayzhimm\"},\"description\":\"tdtftmizuzjd\",\"structure\":\"datagyzcslazprkq\",\"schema\":\"dataimxpggktteagb\",\"linkedServiceName\":{\"referenceName\":\"acnq\",\"parameters\":{\"eylpby\":\"dataytvu\"}},\"parameters\":{\"glpwdjr\":{\"type\":\"Array\",\"defaultValue\":\"dataoifm\"}},\"annotations\":[\"datafshznu\",\"datattuhaaax\",\"datadcdjmdkqtxfrmbe\",\"dataxstowagehxuihwes\"],\"folder\":{\"name\":\"aqgblkkncyp\"},\"\":{\"piobnhrfbrjokjwq\":\"datavspsaneyvae\",\"zwfwlrfdjwlzseod\":\"datamraqnilppqcaig\",\"zy\":\"dataqfdrs\"}}")
            .toObject(Db2TableDataset.class);
        Assertions.assertEquals("tdtftmizuzjd", model.description());
        Assertions.assertEquals("acnq", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("glpwdjr").type());
        Assertions.assertEquals("aqgblkkncyp", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Db2TableDataset model = new Db2TableDataset().withDescription("tdtftmizuzjd")
            .withStructure("datagyzcslazprkq")
            .withSchema("dataimxpggktteagb")
            .withLinkedServiceName(
                new LinkedServiceReference().withReferenceName("acnq").withParameters(mapOf("eylpby", "dataytvu")))
            .withParameters(mapOf("glpwdjr",
                new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("dataoifm")))
            .withAnnotations(Arrays.asList("datafshznu", "datattuhaaax", "datadcdjmdkqtxfrmbe", "dataxstowagehxuihwes"))
            .withFolder(new DatasetFolder().withName("aqgblkkncyp"))
            .withTableName("datarsvxphtjnhptj")
            .withSchemaTypePropertiesSchema("datak")
            .withTable("datayzhimm");
        model = BinaryData.fromObject(model).toObject(Db2TableDataset.class);
        Assertions.assertEquals("tdtftmizuzjd", model.description());
        Assertions.assertEquals("acnq", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("glpwdjr").type());
        Assertions.assertEquals("aqgblkkncyp", model.folder().name());
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

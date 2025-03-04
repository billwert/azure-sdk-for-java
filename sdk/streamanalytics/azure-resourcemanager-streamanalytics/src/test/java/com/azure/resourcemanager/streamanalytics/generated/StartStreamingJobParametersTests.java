// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.streamanalytics.models.OutputStartMode;
import com.azure.resourcemanager.streamanalytics.models.StartStreamingJobParameters;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class StartStreamingJobParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StartStreamingJobParameters model = BinaryData
            .fromString("{\"outputStartMode\":\"JobStartTime\",\"outputStartTime\":\"2021-02-23T09:32:58Z\"}")
            .toObject(StartStreamingJobParameters.class);
        Assertions.assertEquals(OutputStartMode.JOB_START_TIME, model.outputStartMode());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-23T09:32:58Z"), model.outputStartTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StartStreamingJobParameters model
            = new StartStreamingJobParameters().withOutputStartMode(OutputStartMode.JOB_START_TIME)
                .withOutputStartTime(OffsetDateTime.parse("2021-02-23T09:32:58Z"));
        model = BinaryData.fromObject(model).toObject(StartStreamingJobParameters.class);
        Assertions.assertEquals(OutputStartMode.JOB_START_TIME, model.outputStartMode());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-23T09:32:58Z"), model.outputStartTime());
    }
}

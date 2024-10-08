// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.implementation.models;

import com.azure.ai.vision.face.models.FaceAttributeType;
import com.azure.ai.vision.face.models.FaceDetectionModel;
import com.azure.ai.vision.face.models.FaceRecognitionModel;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import java.util.List;

/**
 * Options for detectFromUrlImpl API.
 */
@Fluent
public final class DetectFromUrlImplOptions {

    /*
     * URL of input image.
     */
    @Generated
    private final String url;

    /*
     * The 'detectionModel' associated with the detected faceIds. Supported 'detectionModel' values include
     * 'detection_01', 'detection_02' and 'detection_03'. The default value is 'detection_01'. 'detection_03' is
     * recommended since its accuracy is improved on smaller faces (64x64 pixels) and rotated face orientations.
     */
    @Generated
    private FaceDetectionModel detectionModel;

    /*
     * The 'recognitionModel' associated with the detected faceIds. Supported 'recognitionModel' values include
     * 'recognition_01', 'recognition_02', 'recognition_03' or 'recognition_04'. The default value is 'recognition_01'.
     * 'recognition_04' is recommended since its accuracy is improved on faces wearing masks compared with
     * 'recognition_03', and its overall accuracy is improved compared with 'recognition_01' and 'recognition_02'.
     */
    @Generated
    private FaceRecognitionModel recognitionModel;

    /*
     * Return faceIds of the detected faces or not. The default value is true.
     */
    @Generated
    private Boolean returnFaceId;

    /*
     * Analyze and return the one or more specified face attributes in the comma-separated string like
     * 'returnFaceAttributes=headPose,glasses'. Face attribute analysis has additional computational and time cost.
     */
    @Generated
    private List<FaceAttributeType> returnFaceAttributes;

    /*
     * Return face landmarks of the detected faces or not. The default value is false.
     */
    @Generated
    private Boolean returnFaceLandmarks;

    /*
     * Return 'recognitionModel' or not. The default value is false. This is only applicable when returnFaceId = true.
     */
    @Generated
    private Boolean returnRecognitionModel;

    /*
     * The number of seconds for the face ID being cached. Supported range from 60 seconds up to 86400 seconds. The
     * default value is 86400 (24 hours).
     */
    @Generated
    private Integer faceIdTimeToLive;

    /**
     * Creates an instance of DetectFromUrlImplOptions class.
     *
     * @param url the url value to set.
     */
    @Generated
    public DetectFromUrlImplOptions(String url) {
        this.url = url;
    }

    /**
     * Get the url property: URL of input image.
     *
     * @return the url value.
     */
    @Generated
    public String getUrl() {
        return this.url;
    }

    /**
     * Get the detectionModel property: The 'detectionModel' associated with the detected faceIds. Supported
     * 'detectionModel' values include 'detection_01', 'detection_02' and 'detection_03'. The default value is
     * 'detection_01'. 'detection_03' is recommended since its accuracy is improved on smaller faces (64x64 pixels) and
     * rotated face orientations.
     *
     * @return the detectionModel value.
     */
    @Generated
    public FaceDetectionModel getDetectionModel() {
        return this.detectionModel;
    }

    /**
     * Set the detectionModel property: The 'detectionModel' associated with the detected faceIds. Supported
     * 'detectionModel' values include 'detection_01', 'detection_02' and 'detection_03'. The default value is
     * 'detection_01'. 'detection_03' is recommended since its accuracy is improved on smaller faces (64x64 pixels) and
     * rotated face orientations.
     *
     * @param detectionModel the detectionModel value to set.
     * @return the DetectFromUrlImplOptions object itself.
     */
    @Generated
    public DetectFromUrlImplOptions setDetectionModel(FaceDetectionModel detectionModel) {
        this.detectionModel = detectionModel;
        return this;
    }

    /**
     * Get the recognitionModel property: The 'recognitionModel' associated with the detected faceIds. Supported
     * 'recognitionModel' values include 'recognition_01', 'recognition_02', 'recognition_03' or 'recognition_04'. The
     * default value is 'recognition_01'. 'recognition_04' is recommended since its accuracy is improved on faces
     * wearing masks compared with 'recognition_03', and its overall accuracy is improved compared with 'recognition_01'
     * and 'recognition_02'.
     *
     * @return the recognitionModel value.
     */
    @Generated
    public FaceRecognitionModel getRecognitionModel() {
        return this.recognitionModel;
    }

    /**
     * Set the recognitionModel property: The 'recognitionModel' associated with the detected faceIds. Supported
     * 'recognitionModel' values include 'recognition_01', 'recognition_02', 'recognition_03' or 'recognition_04'. The
     * default value is 'recognition_01'. 'recognition_04' is recommended since its accuracy is improved on faces
     * wearing masks compared with 'recognition_03', and its overall accuracy is improved compared with 'recognition_01'
     * and 'recognition_02'.
     *
     * @param recognitionModel the recognitionModel value to set.
     * @return the DetectFromUrlImplOptions object itself.
     */
    @Generated
    public DetectFromUrlImplOptions setRecognitionModel(FaceRecognitionModel recognitionModel) {
        this.recognitionModel = recognitionModel;
        return this;
    }

    /**
     * Get the returnFaceId property: Return faceIds of the detected faces or not. The default value is true.
     *
     * @return the returnFaceId value.
     */
    @Generated
    public Boolean isReturnFaceId() {
        return this.returnFaceId;
    }

    /**
     * Set the returnFaceId property: Return faceIds of the detected faces or not. The default value is true.
     *
     * @param returnFaceId the returnFaceId value to set.
     * @return the DetectFromUrlImplOptions object itself.
     */
    @Generated
    public DetectFromUrlImplOptions setReturnFaceId(Boolean returnFaceId) {
        this.returnFaceId = returnFaceId;
        return this;
    }

    /**
     * Get the returnFaceAttributes property: Analyze and return the one or more specified face attributes in the
     * comma-separated string like 'returnFaceAttributes=headPose,glasses'. Face attribute analysis has additional
     * computational and time cost.
     *
     * @return the returnFaceAttributes value.
     */
    @Generated
    public List<FaceAttributeType> getReturnFaceAttributes() {
        return this.returnFaceAttributes;
    }

    /**
     * Set the returnFaceAttributes property: Analyze and return the one or more specified face attributes in the
     * comma-separated string like 'returnFaceAttributes=headPose,glasses'. Face attribute analysis has additional
     * computational and time cost.
     *
     * @param returnFaceAttributes the returnFaceAttributes value to set.
     * @return the DetectFromUrlImplOptions object itself.
     */
    @Generated
    public DetectFromUrlImplOptions setReturnFaceAttributes(List<FaceAttributeType> returnFaceAttributes) {
        this.returnFaceAttributes = returnFaceAttributes;
        return this;
    }

    /**
     * Get the returnFaceLandmarks property: Return face landmarks of the detected faces or not. The default value is
     * false.
     *
     * @return the returnFaceLandmarks value.
     */
    @Generated
    public Boolean isReturnFaceLandmarks() {
        return this.returnFaceLandmarks;
    }

    /**
     * Set the returnFaceLandmarks property: Return face landmarks of the detected faces or not. The default value is
     * false.
     *
     * @param returnFaceLandmarks the returnFaceLandmarks value to set.
     * @return the DetectFromUrlImplOptions object itself.
     */
    @Generated
    public DetectFromUrlImplOptions setReturnFaceLandmarks(Boolean returnFaceLandmarks) {
        this.returnFaceLandmarks = returnFaceLandmarks;
        return this;
    }

    /**
     * Get the returnRecognitionModel property: Return 'recognitionModel' or not. The default value is false. This is
     * only applicable when returnFaceId = true.
     *
     * @return the returnRecognitionModel value.
     */
    @Generated
    public Boolean isReturnRecognitionModel() {
        return this.returnRecognitionModel;
    }

    /**
     * Set the returnRecognitionModel property: Return 'recognitionModel' or not. The default value is false. This is
     * only applicable when returnFaceId = true.
     *
     * @param returnRecognitionModel the returnRecognitionModel value to set.
     * @return the DetectFromUrlImplOptions object itself.
     */
    @Generated
    public DetectFromUrlImplOptions setReturnRecognitionModel(Boolean returnRecognitionModel) {
        this.returnRecognitionModel = returnRecognitionModel;
        return this;
    }

    /**
     * Get the faceIdTimeToLive property: The number of seconds for the face ID being cached. Supported range from 60
     * seconds up to 86400 seconds. The default value is 86400 (24 hours).
     *
     * @return the faceIdTimeToLive value.
     */
    @Generated
    public Integer getFaceIdTimeToLive() {
        return this.faceIdTimeToLive;
    }

    /**
     * Set the faceIdTimeToLive property: The number of seconds for the face ID being cached. Supported range from 60
     * seconds up to 86400 seconds. The default value is 86400 (24 hours).
     *
     * @param faceIdTimeToLive the faceIdTimeToLive value to set.
     * @return the DetectFromUrlImplOptions object itself.
     */
    @Generated
    public DetectFromUrlImplOptions setFaceIdTimeToLive(Integer faceIdTimeToLive) {
        this.faceIdTimeToLive = faceIdTimeToLive;
        return this;
    }
}

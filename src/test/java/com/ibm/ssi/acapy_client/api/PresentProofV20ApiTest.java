/*
 * IBM-Deutschland
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ibm.ssi.acapy_client.api;

import com.ibm.ssi.acapy_client.invoker.*;
import com.ibm.ssi.acapy_client.invoker.auth.*;
import com.ibm.ssi.acapy_client.model.AdminAPIMessageTracing;
import com.ibm.ssi.acapy_client.model.IndyCredPrecis;
import java.util.UUID;
import com.ibm.ssi.acapy_client.model.V20PresCreateRequestRequest;
import com.ibm.ssi.acapy_client.model.V20PresExRecord;
import com.ibm.ssi.acapy_client.model.V20PresExRecordList;
import com.ibm.ssi.acapy_client.model.V20PresProblemReportRequest;
import com.ibm.ssi.acapy_client.model.V20PresProposalRequest;
import com.ibm.ssi.acapy_client.model.V20PresSendRequestRequest;
import com.ibm.ssi.acapy_client.model.V20PresSpecByFormatRequest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PresentProofV20Api
 */
public class PresentProofV20ApiTest {

    private final PresentProofV20Api api = new PresentProofV20Api();

    /**
     * Creates a presentation request not bound to any proposal or connection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void presentProof20CreateRequestPostTest() throws ApiException {
        //V20PresCreateRequestRequest body = null;
        //V20PresExRecord response = api.presentProof20CreateRequestPost(body);
        // TODO: test validations
    }

    /**
     * Fetch all present-proof exchange records
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void presentProof20RecordsGetTest() throws ApiException {
        //UUID connectionId = null;
        //String role = null;
        //String state = null;
        //UUID threadId = null;
        //V20PresExRecordList response = api.presentProof20RecordsGet(connectionId, role, state, threadId);
        // TODO: test validations
    }

    /**
     * Fetch credentials from wallet for presentation request
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void presentProof20RecordsPresExIdCredentialsGetTest() throws ApiException {
        //String presExId = null;
        //String count = null;
        //String extraQuery = null;
        //String referent = null;
        //String start = null;
        //List<IndyCredPrecis> response = api.presentProof20RecordsPresExIdCredentialsGet(presExId, count, extraQuery, referent, start);
        // TODO: test validations
    }

    /**
     * Remove an existing presentation exchange record
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void presentProof20RecordsPresExIdDeleteTest() throws ApiException {
        //String presExId = null;
        //Object response = api.presentProof20RecordsPresExIdDelete(presExId);
        // TODO: test validations
    }

    /**
     * Fetch a single presentation exchange record
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void presentProof20RecordsPresExIdGetTest() throws ApiException {
        //String presExId = null;
        //V20PresExRecord response = api.presentProof20RecordsPresExIdGet(presExId);
        // TODO: test validations
    }

    /**
     * Send a problem report for presentation exchange
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void presentProof20RecordsPresExIdProblemReportPostTest() throws ApiException {
        //String presExId = null;
        //V20PresProblemReportRequest body = null;
        //Object response = api.presentProof20RecordsPresExIdProblemReportPost(presExId, body);
        // TODO: test validations
    }

    /**
     * Sends a proof presentation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void presentProof20RecordsPresExIdSendPresentationPostTest() throws ApiException {
        //String presExId = null;
        //V20PresSpecByFormatRequest body = null;
        //V20PresExRecord response = api.presentProof20RecordsPresExIdSendPresentationPost(presExId, body);
        // TODO: test validations
    }

    /**
     * Sends a presentation request in reference to a proposal
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void presentProof20RecordsPresExIdSendRequestPostTest() throws ApiException {
        //String presExId = null;
        //AdminAPIMessageTracing body = null;
        //V20PresExRecord response = api.presentProof20RecordsPresExIdSendRequestPost(presExId, body);
        // TODO: test validations
    }

    /**
     * Verify a received presentation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void presentProof20RecordsPresExIdVerifyPresentationPostTest() throws ApiException {
        //String presExId = null;
        //V20PresExRecord response = api.presentProof20RecordsPresExIdVerifyPresentationPost(presExId);
        // TODO: test validations
    }

    /**
     * Sends a presentation proposal
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void presentProof20SendProposalPostTest() throws ApiException {
        //V20PresProposalRequest body = null;
        //V20PresExRecord response = api.presentProof20SendProposalPost(body);
        // TODO: test validations
    }

    /**
     * Sends a free presentation request not bound to any proposal
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void presentProof20SendRequestPostTest() throws ApiException {
        //V20PresSendRequestRequest body = null;
        //V20PresExRecord response = api.presentProof20SendRequestPost(body);
        // TODO: test validations
    }

}
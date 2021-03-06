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


package com.my_digi_id.acapy_client.api;

import com.my_digi_id.acapy_client.invoker.*;
import com.my_digi_id.acapy_client.invoker.auth.*;
import java.util.UUID;
import com.my_digi_id.acapy_client.model.V10CredentialBoundOfferRequest;
import com.my_digi_id.acapy_client.model.V10CredentialConnFreeOfferRequest;
import com.my_digi_id.acapy_client.model.V10CredentialCreate;
import com.my_digi_id.acapy_client.model.V10CredentialExchange;
import com.my_digi_id.acapy_client.model.V10CredentialExchangeListResult;
import com.my_digi_id.acapy_client.model.V10CredentialFreeOfferRequest;
import com.my_digi_id.acapy_client.model.V10CredentialIssueRequest;
import com.my_digi_id.acapy_client.model.V10CredentialProblemReportRequest;
import com.my_digi_id.acapy_client.model.V10CredentialProposalRequestMand;
import com.my_digi_id.acapy_client.model.V10CredentialProposalRequestOpt;
import com.my_digi_id.acapy_client.model.V10CredentialStoreRequest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssueCredentialV10Api
 */
public class IssueCredentialV10ApiTest {

    private final IssueCredentialV10Api api = new IssueCredentialV10Api();

    /**
     * Create a credential offer, independent of any proposal or connection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueCredentialCreateOfferPostTest() throws ApiException {
        //V10CredentialConnFreeOfferRequest body = null;
        //V10CredentialExchange response = api.issueCredentialCreateOfferPost(body);
        // TODO: test validations
    }

    /**
     * Send holder a credential, automating entire flow
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueCredentialCreatePostTest() throws ApiException {
        //V10CredentialCreate body = null;
        //V10CredentialExchange response = api.issueCredentialCreatePost(body);
        // TODO: test validations
    }

    /**
     * Remove an existing credential exchange record
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueCredentialRecordsCredExIdDeleteTest() throws ApiException {
        //String credExId = null;
        //Object response = api.issueCredentialRecordsCredExIdDelete(credExId);
        // TODO: test validations
    }

    /**
     * Fetch a single credential exchange record
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueCredentialRecordsCredExIdGetTest() throws ApiException {
        //String credExId = null;
        //V10CredentialExchange response = api.issueCredentialRecordsCredExIdGet(credExId);
        // TODO: test validations
    }

    /**
     * Send holder a credential
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueCredentialRecordsCredExIdIssuePostTest() throws ApiException {
        //String credExId = null;
        //V10CredentialIssueRequest body = null;
        //V10CredentialExchange response = api.issueCredentialRecordsCredExIdIssuePost(credExId, body);
        // TODO: test validations
    }

    /**
     * Send a problem report for credential exchange
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueCredentialRecordsCredExIdProblemReportPostTest() throws ApiException {
        //String credExId = null;
        //V10CredentialProblemReportRequest body = null;
        //Object response = api.issueCredentialRecordsCredExIdProblemReportPost(credExId, body);
        // TODO: test validations
    }

    /**
     * Send holder a credential offer in reference to a proposal with preview
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueCredentialRecordsCredExIdSendOfferPostTest() throws ApiException {
        //String credExId = null;
        //V10CredentialBoundOfferRequest body = null;
        //V10CredentialExchange response = api.issueCredentialRecordsCredExIdSendOfferPost(credExId, body);
        // TODO: test validations
    }

    /**
     * Send issuer a credential request
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueCredentialRecordsCredExIdSendRequestPostTest() throws ApiException {
        //String credExId = null;
        //V10CredentialExchange response = api.issueCredentialRecordsCredExIdSendRequestPost(credExId);
        // TODO: test validations
    }

    /**
     * Store a received credential
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueCredentialRecordsCredExIdStorePostTest() throws ApiException {
        //String credExId = null;
        //V10CredentialStoreRequest body = null;
        //V10CredentialExchange response = api.issueCredentialRecordsCredExIdStorePost(credExId, body);
        // TODO: test validations
    }

    /**
     * Fetch all credential exchange records
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueCredentialRecordsGetTest() throws ApiException {
        //UUID connectionId = null;
        //String role = null;
        //String state = null;
        //UUID threadId = null;
        //V10CredentialExchangeListResult response = api.issueCredentialRecordsGet(connectionId, role, state, threadId);
        // TODO: test validations
    }

    /**
     * Send holder a credential offer, independent of any proposal
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueCredentialSendOfferPostTest() throws ApiException {
        //V10CredentialFreeOfferRequest body = null;
        //V10CredentialExchange response = api.issueCredentialSendOfferPost(body);
        // TODO: test validations
    }

    /**
     * Send holder a credential, automating entire flow
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueCredentialSendPostTest() throws ApiException {
        //V10CredentialProposalRequestMand body = null;
        //V10CredentialExchange response = api.issueCredentialSendPost(body);
        // TODO: test validations
    }

    /**
     * Send issuer a credential proposal
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void issueCredentialSendProposalPostTest() throws ApiException {
        //V10CredentialProposalRequestOpt body = null;
        //V10CredentialExchange response = api.issueCredentialSendProposalPost(body);
        // TODO: test validations
    }

}

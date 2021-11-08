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
import com.my_digi_id.acapy_client.model.ClearPendingRevocationsRequest;
import com.my_digi_id.acapy_client.model.CredRevRecordResult;
import java.io.File;
import com.my_digi_id.acapy_client.model.PublishRevocations;
import com.my_digi_id.acapy_client.model.RevRegCreateRequest;
import com.my_digi_id.acapy_client.model.RevRegIssuedResult;
import com.my_digi_id.acapy_client.model.RevRegResult;
import com.my_digi_id.acapy_client.model.RevRegUpdateTailsFileUri;
import com.my_digi_id.acapy_client.model.RevRegsCreated;
import com.my_digi_id.acapy_client.model.RevokeRequest;
import com.my_digi_id.acapy_client.model.TxnOrPublishRevocationsResult;
import com.my_digi_id.acapy_client.model.TxnOrRevRegResult;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RevocationApi
 */
public class RevocationApiTest {

    private final RevocationApi api = new RevocationApi();

    /**
     * Get current active revocation registry by credential definition id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revocationActiveRegistryCredDefIdGetTest() throws ApiException {
        //String credDefId = null;
        //RevRegResult response = api.revocationActiveRegistryCredDefIdGet(credDefId);
        // TODO: test validations
    }

    /**
     * Clear pending revocations
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revocationClearPendingRevocationsPostTest() throws ApiException {
        //ClearPendingRevocationsRequest body = null;
        //PublishRevocations response = api.revocationClearPendingRevocationsPost(body);
        // TODO: test validations
    }

    /**
     * Creates a new revocation registry
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revocationCreateRegistryPostTest() throws ApiException {
        //RevRegCreateRequest body = null;
        //RevRegResult response = api.revocationCreateRegistryPost(body);
        // TODO: test validations
    }

    /**
     * Get credential revocation status
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revocationCredentialRecordGetTest() throws ApiException {
        //String credExId = null;
        //String credRevId = null;
        //String revRegId = null;
        //CredRevRecordResult response = api.revocationCredentialRecordGet(credExId, credRevId, revRegId);
        // TODO: test validations
    }

    /**
     * Publish pending revocations to ledger
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revocationPublishRevocationsPostTest() throws ApiException {
        //String connId = null;
        //Boolean createTransactionForEndorser = null;
        //PublishRevocations body = null;
        //TxnOrPublishRevocationsResult response = api.revocationPublishRevocationsPost(connId, createTransactionForEndorser, body);
        // TODO: test validations
    }

    /**
     * Search for matching revocation registries that current agent created
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revocationRegistriesCreatedGetTest() throws ApiException {
        //String credDefId = null;
        //String state = null;
        //RevRegsCreated response = api.revocationRegistriesCreatedGet(credDefId, state);
        // TODO: test validations
    }

    /**
     * Send revocation registry definition to ledger
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revocationRegistryRevRegIdDefinitionPostTest() throws ApiException {
        //String revRegId = null;
        //String connId = null;
        //Boolean createTransactionForEndorser = null;
        //TxnOrRevRegResult response = api.revocationRegistryRevRegIdDefinitionPost(revRegId, connId, createTransactionForEndorser);
        // TODO: test validations
    }

    /**
     * Send revocation registry entry to ledger
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revocationRegistryRevRegIdEntryPostTest() throws ApiException {
        //String revRegId = null;
        //String connId = null;
        //Boolean createTransactionForEndorser = null;
        //RevRegResult response = api.revocationRegistryRevRegIdEntryPost(revRegId, connId, createTransactionForEndorser);
        // TODO: test validations
    }

    /**
     * Get revocation registry by revocation registry id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revocationRegistryRevRegIdGetTest() throws ApiException {
        //String revRegId = null;
        //RevRegResult response = api.revocationRegistryRevRegIdGet(revRegId);
        // TODO: test validations
    }

    /**
     * Get number of credentials issued against revocation registry
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revocationRegistryRevRegIdIssuedGetTest() throws ApiException {
        //String revRegId = null;
        //RevRegIssuedResult response = api.revocationRegistryRevRegIdIssuedGet(revRegId);
        // TODO: test validations
    }

    /**
     * Update revocation registry with new public URI to its tails file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revocationRegistryRevRegIdPatchTest() throws ApiException {
        //String revRegId = null;
        //RevRegUpdateTailsFileUri body = null;
        //RevRegResult response = api.revocationRegistryRevRegIdPatch(revRegId, body);
        // TODO: test validations
    }

    /**
     * Set revocation registry state manually
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revocationRegistryRevRegIdSetStatePatchTest() throws ApiException {
        //String revRegId = null;
        //String state = null;
        //RevRegResult response = api.revocationRegistryRevRegIdSetStatePatch(revRegId, state);
        // TODO: test validations
    }

    /**
     * Download tails file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revocationRegistryRevRegIdTailsFileGetTest() throws ApiException {
        //String revRegId = null;
        //File response = api.revocationRegistryRevRegIdTailsFileGet(revRegId);
        // TODO: test validations
    }

    /**
     * Upload local tails file to server
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revocationRegistryRevRegIdTailsFilePutTest() throws ApiException {
        //String revRegId = null;
        //Object response = api.revocationRegistryRevRegIdTailsFilePut(revRegId);
        // TODO: test validations
    }

    /**
     * Revoke an issued credential
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revocationRevokePostTest() throws ApiException {
        //RevokeRequest body = null;
        //Object response = api.revocationRevokePost(body);
        // TODO: test validations
    }

}

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
import com.ibm.ssi.acapy_client.model.DIDCreate;
import com.ibm.ssi.acapy_client.model.DIDEndpoint;
import com.ibm.ssi.acapy_client.model.DIDEndpointWithType;
import com.ibm.ssi.acapy_client.model.DIDList;
import com.ibm.ssi.acapy_client.model.DIDResult;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WalletApi
 */
public class WalletApiTest {

    private final WalletApi api = new WalletApi();

    /**
     * Create a local DID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletDidCreatePostTest() throws ApiException {
        //DIDCreate body = null;
        //DIDResult response = api.walletDidCreatePost(body);
        // TODO: test validations
    }

    /**
     * List wallet DIDs
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletDidGetTest() throws ApiException {
        //String did = null;
        //String keyType = null;
        //String method = null;
        //String posture = null;
        //String verkey = null;
        //DIDList response = api.walletDidGet(did, keyType, method, posture, verkey);
        // TODO: test validations
    }

    /**
     * Rotate keypair for a DID not posted to the ledger
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletDidLocalRotateKeypairPatchTest() throws ApiException {
        //String did = null;
        //Object response = api.walletDidLocalRotateKeypairPatch(did);
        // TODO: test validations
    }

    /**
     * Fetch the current public DID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletDidPublicGetTest() throws ApiException {
        //DIDResult response = api.walletDidPublicGet();
        // TODO: test validations
    }

    /**
     * Assign the current public DID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletDidPublicPostTest() throws ApiException {
        //String did = null;
        //DIDResult response = api.walletDidPublicPost(did);
        // TODO: test validations
    }

    /**
     * Query DID endpoint in wallet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletGetDidEndpointGetTest() throws ApiException {
        //String did = null;
        //DIDEndpoint response = api.walletGetDidEndpointGet(did);
        // TODO: test validations
    }

    /**
     * Update endpoint in wallet and on ledger if posted to it
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void walletSetDidEndpointPostTest() throws ApiException {
        //DIDEndpointWithType body = null;
        //Object response = api.walletSetDidEndpointPost(body);
        // TODO: test validations
    }

}

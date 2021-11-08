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
import com.my_digi_id.acapy_client.model.GetDIDEndpointResponse;
import com.my_digi_id.acapy_client.model.GetDIDVerkeyResponse;
import com.my_digi_id.acapy_client.model.GetNymRoleResponse;
import com.my_digi_id.acapy_client.model.RegisterLedgerNymResponse;
import com.my_digi_id.acapy_client.model.TAAAccept;
import com.my_digi_id.acapy_client.model.TAAResult;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LedgerApi
 */
public class LedgerApiTest {

    private final LedgerApi api = new LedgerApi();

    /**
     * Get the endpoint for a DID from the ledger.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ledgerDidEndpointGetTest() throws ApiException {
        //String did = null;
        //String endpointType = null;
        //GetDIDEndpointResponse response = api.ledgerDidEndpointGet(did, endpointType);
        // TODO: test validations
    }

    /**
     * Get the verkey for a DID from the ledger.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ledgerDidVerkeyGetTest() throws ApiException {
        //String did = null;
        //GetDIDVerkeyResponse response = api.ledgerDidVerkeyGet(did);
        // TODO: test validations
    }

    /**
     * Get the role from the NYM registration of a public DID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ledgerGetNymRoleGetTest() throws ApiException {
        //String did = null;
        //GetNymRoleResponse response = api.ledgerGetNymRoleGet(did);
        // TODO: test validations
    }

    /**
     * Send a NYM registration to the ledger.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ledgerRegisterNymPostTest() throws ApiException {
        //String did = null;
        //String verkey = null;
        //String alias = null;
        //String role = null;
        //RegisterLedgerNymResponse response = api.ledgerRegisterNymPost(did, verkey, alias, role);
        // TODO: test validations
    }

    /**
     * Rotate key pair for public DID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ledgerRotatePublicDidKeypairPatchTest() throws ApiException {
        //Object response = api.ledgerRotatePublicDidKeypairPatch();
        // TODO: test validations
    }

    /**
     * Accept the transaction author agreement
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ledgerTaaAcceptPostTest() throws ApiException {
        //TAAAccept body = null;
        //Object response = api.ledgerTaaAcceptPost(body);
        // TODO: test validations
    }

    /**
     * Fetch the current transaction author agreement, if any
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ledgerTaaGetTest() throws ApiException {
        //TAAResult response = api.ledgerTaaGet();
        // TODO: test validations
    }

}

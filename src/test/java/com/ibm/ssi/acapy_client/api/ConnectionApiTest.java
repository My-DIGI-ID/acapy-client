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
import com.ibm.ssi.acapy_client.model.ConnRecord;
import com.ibm.ssi.acapy_client.model.ConnectionList;
import com.ibm.ssi.acapy_client.model.ConnectionMetadata;
import com.ibm.ssi.acapy_client.model.ConnectionMetadataSetRequest;
import com.ibm.ssi.acapy_client.model.ConnectionStaticRequest;
import com.ibm.ssi.acapy_client.model.ConnectionStaticResult;
import com.ibm.ssi.acapy_client.model.CreateInvitationRequest;
import com.ibm.ssi.acapy_client.model.EndpointsResult;
import com.ibm.ssi.acapy_client.model.InvitationResult;
import com.ibm.ssi.acapy_client.model.ReceiveInvitationRequest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConnectionApi
 */
public class ConnectionApiTest {

    private final ConnectionApi api = new ConnectionApi();

    /**
     * Accept a stored connection invitation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void connectionsConnIdAcceptInvitationPostTest() throws ApiException {
        //String connId = null;
        //String mediationId = null;
        //String myEndpoint = null;
        //String myLabel = null;
        //ConnRecord response = api.connectionsConnIdAcceptInvitationPost(connId, mediationId, myEndpoint, myLabel);
        // TODO: test validations
    }

    /**
     * Accept a stored connection request
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void connectionsConnIdAcceptRequestPostTest() throws ApiException {
        //String connId = null;
        //String myEndpoint = null;
        //ConnRecord response = api.connectionsConnIdAcceptRequestPost(connId, myEndpoint);
        // TODO: test validations
    }

    /**
     * Remove an existing connection record
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void connectionsConnIdDeleteTest() throws ApiException {
        //String connId = null;
        //Object response = api.connectionsConnIdDelete(connId);
        // TODO: test validations
    }

    /**
     * Fetch connection remote endpoint
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void connectionsConnIdEndpointsGetTest() throws ApiException {
        //String connId = null;
        //EndpointsResult response = api.connectionsConnIdEndpointsGet(connId);
        // TODO: test validations
    }

    /**
     * Assign another connection as the inbound connection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void connectionsConnIdEstablishInboundRefIdPostTest() throws ApiException {
        //String connId = null;
        //String refId = null;
        //Object response = api.connectionsConnIdEstablishInboundRefIdPost(connId, refId);
        // TODO: test validations
    }

    /**
     * Fetch a single connection record
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void connectionsConnIdGetTest() throws ApiException {
        //String connId = null;
        //ConnRecord response = api.connectionsConnIdGet(connId);
        // TODO: test validations
    }

    /**
     * Fetch connection metadata
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void connectionsConnIdMetadataGetTest() throws ApiException {
        //String connId = null;
        //String key = null;
        //ConnectionMetadata response = api.connectionsConnIdMetadataGet(connId, key);
        // TODO: test validations
    }

    /**
     * Set connection metadata
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void connectionsConnIdMetadataPostTest() throws ApiException {
        //String connId = null;
        //ConnectionMetadataSetRequest body = null;
        //ConnectionMetadata response = api.connectionsConnIdMetadataPost(connId, body);
        // TODO: test validations
    }

    /**
     * Create a new connection invitation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void connectionsCreateInvitationPostTest() throws ApiException {
        //String alias = null;
        //Boolean autoAccept = null;
        //Boolean multiUse = null;
        //Boolean _public = null;
        //CreateInvitationRequest body = null;
        //InvitationResult response = api.connectionsCreateInvitationPost(alias, autoAccept, multiUse, _public, body);
        // TODO: test validations
    }

    /**
     * Create a new static connection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void connectionsCreateStaticPostTest() throws ApiException {
        //ConnectionStaticRequest body = null;
        //ConnectionStaticResult response = api.connectionsCreateStaticPost(body);
        // TODO: test validations
    }

    /**
     * Query agent-to-agent connections
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void connectionsGetTest() throws ApiException {
        //String alias = null;
        //String connectionProtocol = null;
        //String invitationKey = null;
        //String myDid = null;
        //String state = null;
        //String theirDid = null;
        //String theirRole = null;
        //ConnectionList response = api.connectionsGet(alias, connectionProtocol, invitationKey, myDid, state, theirDid, theirRole);
        // TODO: test validations
    }

    /**
     * Receive a new connection invitation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void connectionsReceiveInvitationPostTest() throws ApiException {
        //String alias = null;
        //Boolean autoAccept = null;
        //String mediationId = null;
        //ReceiveInvitationRequest body = null;
        //ConnRecord response = api.connectionsReceiveInvitationPost(alias, autoAccept, mediationId, body);
        // TODO: test validations
    }

}

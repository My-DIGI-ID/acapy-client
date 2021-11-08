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
import com.my_digi_id.acapy_client.model.ConnRecord;
import com.my_digi_id.acapy_client.model.InvitationCreateRequest;
import com.my_digi_id.acapy_client.model.InvitationMessage;
import com.my_digi_id.acapy_client.model.InvitationRecord;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OutOfBandApi
 */
public class OutOfBandApiTest {

    private final OutOfBandApi api = new OutOfBandApi();

    /**
     * Create a new connection invitation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void outOfBandCreateInvitationPostTest() throws ApiException {
        //Boolean autoAccept = null;
        //Boolean multiUse = null;
        //InvitationCreateRequest body = null;
        //InvitationRecord response = api.outOfBandCreateInvitationPost(autoAccept, multiUse, body);
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
    public void outOfBandReceiveInvitationPostTest() throws ApiException {
        //String alias = null;
        //Boolean autoAccept = null;
        //String mediationId = null;
        //Boolean useExistingConnection = null;
        //InvitationMessage body = null;
        //ConnRecord response = api.outOfBandReceiveInvitationPost(alias, autoAccept, mediationId, useExistingConnection, body);
        // TODO: test validations
    }

}

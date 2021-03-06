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
import com.my_digi_id.acapy_client.model.AdminConfig;
import com.my_digi_id.acapy_client.model.AdminModules;
import com.my_digi_id.acapy_client.model.AdminStatus;
import com.my_digi_id.acapy_client.model.AdminStatusLiveliness;
import com.my_digi_id.acapy_client.model.AdminStatusReadiness;
import com.my_digi_id.acapy_client.model.QueryResult;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ServerApi
 */
public class ServerApiTest {

    private final ServerApi api = new ServerApi();

    /**
     * Query supported features
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void featuresGetTest() throws ApiException {
        //String query = null;
        //QueryResult response = api.featuresGet(query);
        // TODO: test validations
    }

    /**
     * Fetch the list of loaded plugins
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pluginsGetTest() throws ApiException {
        //AdminModules response = api.pluginsGet();
        // TODO: test validations
    }

    /**
     * Shut down server
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void shutdownGetTest() throws ApiException {
        //Object response = api.shutdownGet();
        // TODO: test validations
    }

    /**
     * Fetch the server configuration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void statusConfigGetTest() throws ApiException {
        //AdminConfig response = api.statusConfigGet();
        // TODO: test validations
    }

    /**
     * Fetch the server status
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void statusGetTest() throws ApiException {
        //AdminStatus response = api.statusGet();
        // TODO: test validations
    }

    /**
     * Liveliness check
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void statusLiveGetTest() throws ApiException {
        //AdminStatusLiveliness response = api.statusLiveGet();
        // TODO: test validations
    }

    /**
     * Readiness check
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void statusReadyGetTest() throws ApiException {
        //AdminStatusReadiness response = api.statusReadyGet();
        // TODO: test validations
    }

    /**
     * Reset statistics
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void statusResetPostTest() throws ApiException {
        //Object response = api.statusResetPost();
        // TODO: test validations
    }

}

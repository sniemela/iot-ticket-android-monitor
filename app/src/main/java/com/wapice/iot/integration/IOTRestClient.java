package com.wapice.iot.integration;

import com.iotticket.api.v1.IOTAPIClient;

/**
 * Created by Nico on 26.4.2015.
 */
public class IOTRestClient {

    private static IOTAPIClient client;

    private final static String defaultUrl = "https://my.iot-ticket.com/api/v1";

    /**
     * Creates a new IOTAPIClient singleton with the given userName and password.
     *
     * Same singleton instance can be gotten using {@link #getInstance());
     *
     * @param userName
     * @param password
     */
    public static void createInstance(String userName, String password) {
        client = new IOTAPIClient(defaultUrl, userName, password);
    }

    /**
     *
     * @return The current singleton instance of IOTAPIClient
     */
    public static IOTAPIClient getInstance() {
        if (client == null) {
            throw  new IllegalArgumentException("Create the client instance first!");
        }
        return client;
    }
}

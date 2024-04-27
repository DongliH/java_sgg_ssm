package com.wubai.ioc_01;

public class ClientService {
    private static ClientService clientService = new ClientService();
    private ClientService() {}

    public static ClientService createInstance() {

        return clientService;
    }
}
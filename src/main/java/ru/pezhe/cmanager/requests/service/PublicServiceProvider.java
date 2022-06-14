package ru.pezhe.cmanager.requests.service;

import ru.pezhe.cmanager.requests.entity.PublicService;


public class PublicServiceProvider {

    private final PublicService stubService;
    private final static PublicServiceProvider instance = new PublicServiceProvider();

    private PublicServiceProvider() {
        this.stubService = new PublicService("id", "stub_service", "none");
        this.stubService.getSupportedRequestTypes().add("stub_type");
    }

    public static PublicServiceProvider getInstance() {
        return instance;
    }

    public PublicService getByName(String serviceName) {
        return this.stubService;
    }

}

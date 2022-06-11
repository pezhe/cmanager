package ru.pezhe.cmanager.requests.service;

import ru.pezhe.cmanager.requests.entity.PublicService;


public class PublicServiceProvider {

    private final PublicService stubService;

    public PublicServiceProvider() {
        this.stubService = new PublicService("id", "stub_service", "none");
        this.stubService.getSupportedRequestTypes().add("stub_type");
    }

    public PublicService getByName(String serviceName) {
        return this.stubService;
    }

}

package ru.pezhe.cmanager.requests.service;

import ru.pezhe.cmanager.requests.entity.PublicService;
import ru.pezhe.cmanager.requests.service.common.SimpleProvider;


public class PublicServiceProvider implements SimpleProvider {

    private final PublicService stubService;
    private final static PublicServiceProvider instance = new PublicServiceProvider();

    private PublicServiceProvider() {
        this.stubService = new PublicService("id", "stub_service", "none");
        this.stubService.getSupportedRequestTypes().add("stub_type_1");
    }

    public static PublicServiceProvider getInstance() {
        return instance;
    }

    @Override
    public PublicService getByName(String serviceName) {
        return this.stubService;
    }

}

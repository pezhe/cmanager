package ru.pezhe.cmanager.requests.service;

import ru.pezhe.cmanager.requests.entity.RequestType;

public class RequestTypeProvider {

    private final RequestType stubType;
    private final static RequestTypeProvider instance = new RequestTypeProvider();

    private RequestTypeProvider() {
        this.stubType = new RequestType("id", "stub_type", "none");
        this.stubType.getRequiredOptions().add("option_1");
        this.stubType.getRequiredOptions().add("option_2");
        this.stubType.getRequiredOptions().add("option_3");
    }

    public static RequestTypeProvider getInstance() {
        return instance;
    }

    public RequestType getByName(String typeName) {
        return this.stubType;
    }

}

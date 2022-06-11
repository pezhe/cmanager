package ru.pezhe.cmanager.requests.service;

import ru.pezhe.cmanager.requests.entity.RequestType;

public class RequestTypeProvider {

    private final RequestType stubType;

    public RequestTypeProvider() {
        this.stubType = new RequestType("id", "stub_type", "none");
        this.stubType.getRequiredOptions().add("option_1");
        this.stubType.getRequiredOptions().add("option_2");
        this.stubType.getRequiredOptions().add("option_3");
    }

    public RequestType getByName(String typeName) {
        return this.stubType;
    }

}

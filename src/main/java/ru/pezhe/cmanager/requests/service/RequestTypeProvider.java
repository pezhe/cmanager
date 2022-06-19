package ru.pezhe.cmanager.requests.service;

import ru.pezhe.cmanager.requests.entity.RequestType;
import ru.pezhe.cmanager.requests.service.common.SimpleProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class RequestTypeProvider implements SimpleProvider {

    private final List<RequestType> types = new ArrayList<>();
    private final static RequestTypeProvider instance = new RequestTypeProvider();

    private RequestTypeProvider() {
        RequestType stubType = new RequestType("id_1", "stub_type_1", "none");
        stubType.getRequiredOptions().add("option_1");
        stubType.getRequiredOptions().add("option_2");
        stubType.getRequiredOptions().add("option_3");
        this.types.add(stubType);
        stubType = new RequestType("id_2", "stub_type_2", "none");
        stubType.getRequiredOptions().add("option_4");
        stubType.getRequiredOptions().add("option_5");
        stubType.getRequiredOptions().add("option_6");
        this.types.add(stubType);
    }

    public static RequestTypeProvider getInstance() {
        return instance;
    }

    @Override
    public RequestType getByName(String typeName) {
        return types
                .stream()
                .filter(t -> t.getName().equals(typeName))
                .findAny()
                .orElseThrow(NoSuchElementException::new);
    }

}

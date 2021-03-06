package ru.pezhe.cmanager.requests.service;

import ru.pezhe.cmanager.requests.entity.RequestType;
import ru.pezhe.cmanager.requests.service.common.ComplexProvider;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RequestTypeExtendedProvider extends ComplexProvider {

    public RequestTypeExtendedProvider(RequestTypeProvider provider) {
        super(provider);
    }

    @Override
    public RequestType getByName(String name) {
        return (RequestType)provider.getByName(name);
    }

    public List<RequestType> getTypeList(String... name) {
        return Arrays.stream(name)
                .map(n -> (RequestType)provider.getByName(n))
                .collect(Collectors.toList());
    }

}

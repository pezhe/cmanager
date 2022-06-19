package ru.pezhe.cmanager.requests.service.common;

public abstract class ComplexProvider implements SimpleProvider {

    protected final SimpleProvider provider;

    public ComplexProvider(SimpleProvider simpleProvider) {
        this.provider = simpleProvider;
    }

}

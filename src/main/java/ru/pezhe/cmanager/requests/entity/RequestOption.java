package ru.pezhe.cmanager.requests.entity;

import java.util.ArrayList;
import java.util.List;

public class RequestOption {

    private final String id;
    private String name;
    private final List<String> values = new ArrayList<>();

    public RequestOption(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getValues() {
        return values;
    }

    public void addValue(String value) {
        this.values.add(value);
    }

    @Override
    public String toString() {
        return "RequestOption{" +
                "name='" + name + '\'' +
                ", values=" + values +
                '}';
    }
}

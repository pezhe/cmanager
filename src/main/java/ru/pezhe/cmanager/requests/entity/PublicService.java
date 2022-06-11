package ru.pezhe.cmanager.requests.entity;

import java.util.ArrayList;
import java.util.List;

public class PublicService {

    private final String id;
    private String name;
    private String description;
    private final List<String> supportedRequestTypes = new ArrayList<>();


    public PublicService(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getSupportedRequestTypes() {
        return supportedRequestTypes;
    }

    @Override
    public String toString() {
        return "PublicService{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

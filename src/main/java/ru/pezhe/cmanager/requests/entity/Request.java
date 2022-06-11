package ru.pezhe.cmanager.requests.entity;

import ru.pezhe.cmanager.requests.entity.enums.RequestStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Request {

    private final String id;
    private String requestorId;
    private String apartmentId;
    private LocalDateTime createdAt;
    private PublicService service;
    private RequestType type;
    private String description;
    private String resolution;
    private RequestStatus status;
    private final List<RequestOption> options = new ArrayList<>();

    public Request(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getRequestorId() {
        return requestorId;
    }

    public void setRequestorId(String requestorId) {
        this.requestorId = requestorId;
    }

    public String getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(String apartmentId) {
        this.apartmentId = apartmentId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public PublicService getService() {
        return service;
    }

    public void setService(PublicService service) {
        this.service = service;
    }

    public RequestType getType() {
        return type;
    }

    public void setType(RequestType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public RequestStatus getStatus() {
        return status;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }

    public List<RequestOption> getOptions() {
        return options;
    }

    public boolean addOption(RequestOption option) {
        return this.options.add(option);
    }

    @Override
    public String toString() {
        return "Request{" +
                "id='" + id + '\'' +
                ", requestorId='" + requestorId + '\'' +
                ", apartmentId='" + apartmentId + '\'' +
                ", createdAt=" + createdAt +
                ", service=" + service +
                ", type=" + type +
                ", description='" + description + '\'' +
                ", resolution='" + resolution + '\'' +
                ", status=" + status +
                ", options=" + options +
                '}';
    }
}

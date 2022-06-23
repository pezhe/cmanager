package ru.pezhe.cmanager.requests.entity;

import ru.pezhe.cmanager.requests.entity.enums.RequestStatus;
import ru.pezhe.cmanager.requests.service.common.Listener;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Request {

    private final String id;
    private String requestorId;
    private String apartmentId;
    private final LocalDateTime createdAt;
    private PublicService service;
    private RequestType type;
    private String description;
    private String resolution;
    private RequestStatus status;
    private final List<RequestOption> options;

    private final List<Listener> listeners;

    private Request(String id, String requestorId, String apartmentId, LocalDateTime createdAt, PublicService service,
                   RequestType type, String description, RequestStatus status, List<RequestOption> options, List<Listener> listeners) {
        this.id = id;
        this.requestorId = requestorId;
        this.apartmentId = apartmentId;
        this.createdAt = createdAt;
        this.service = service;
        this.type = type;
        this.description = description;
        this.options = options;
        this.listeners = listeners;
        setStatus(status);
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
        notifyListeners();
    }

    public List<RequestOption> getOptions() {
        return options;
    }

    public boolean addOption(RequestOption option) {
        return this.options.add(option);
    }

    private void notifyListeners(){
        for (Listener listener : listeners) {
            listener.update(this);
        }
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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private String requestorId;
        private String apartmentId;
        private PublicService service;
        private RequestType type;
        private String description;
        private final List<RequestOption> options = new ArrayList<>();
        private final List<Listener> listeners = new ArrayList<>();

        private Builder() {}

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder requestorId(String requestorId) {
            this.requestorId = requestorId;
            return this;
        }

        public Builder apartmentId(String apartmentId) {
            this.apartmentId = apartmentId;
            return this;
        }

        public Builder service(PublicService service) {
            this.service = service;
            return this;
        }

        public Builder type(RequestType type) {
            this.type = type;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder option(RequestOption option) {
            this.options.add(option);
            return this;
        }

        public Builder listener(Listener listener) {
            this.listeners.add(listener);
            return this;
        }

        public Request build() {
            return new Request(id, requestorId, apartmentId, LocalDateTime.now(), service, type, description,
                    RequestStatus.OPEN, options, listeners);
        }

    }

}
package ru.pezhe.cmanager.requests.service;

import ru.pezhe.cmanager.requests.entity.Request;
import ru.pezhe.cmanager.requests.service.common.Listener;

public class DefaultRequestListener implements Listener {

    private final ServiceMemberNotifier notifier = ServiceMemberNotifier.getInstance();

    @Override
    public void update(Object obj) {
        if(obj instanceof Request) {
            Request request = (Request) obj;
            String message = String.format("Request id=%s update: status=%s", request.getId(), request.getStatus());
            notifier.notifyAllMembers(request.getService().getName(), message);
        }

    }

}

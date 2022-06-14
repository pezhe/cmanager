package ru.pezhe.cmanager.requests.service;

import java.util.UUID;

public class IdProvider {

    public static String getNewId() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

}

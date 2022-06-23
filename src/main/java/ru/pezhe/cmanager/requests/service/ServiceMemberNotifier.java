package ru.pezhe.cmanager.requests.service;

public class ServiceMemberNotifier {

    private final static ServiceMemberNotifier instance = new ServiceMemberNotifier();

    public static ServiceMemberNotifier getInstance() {
        return instance;
    }

    public void notifyAllMembers(String serviceName, String message) {
        System.out.printf("Notify all members of %s: %s%n", serviceName, message);
    }

}

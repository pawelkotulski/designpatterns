package com.kot.observer.domain;

public class NotificationPayload {

    private String payload;

    public NotificationPayload(String payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "NotificationPayload{" +
                "payload='" + payload + '\'' +
                '}';
    }
}

package com.kot.observer.domain;

public interface Subscriber {
    void notify(NotificationPayload notificationPayload);
}

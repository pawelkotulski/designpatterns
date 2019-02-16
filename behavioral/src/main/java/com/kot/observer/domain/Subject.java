package com.kot.observer.domain;

public interface Subject {
    void subscribe(Subscriber subscriber);
    void unSubscribe(Subscriber subscriber);
    void notifySubscribers(NotificationPayload notificationPayload);
}

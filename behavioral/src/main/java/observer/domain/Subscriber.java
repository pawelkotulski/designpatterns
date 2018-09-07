package observer.domain;

public interface Subscriber {
    void receiveNotification(NotificationPayload notificationPayload);
}

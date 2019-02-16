package com.kot.observer.auctionObserver;

import com.kot.observer.domain.NotificationPayload;
import com.kot.observer.domain.Subscriber;

public class AuctionSubscriber implements Subscriber{

    private final String id;

    public AuctionSubscriber(String id) {
        this.id = id;
    }

    @Override
    public void notify(NotificationPayload notificationPayload) {
        System.out.println(this + " receive new bid: " + notificationPayload);
    }

    @Override
    public String toString() {
        return "AuctionSubscriber{" +
                "id='" + id + '\'' +
                '}';
    }
}

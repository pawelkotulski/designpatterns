package com.kot.observer.auctionObserver;

import com.kot.observer.domain.NotificationPayload;
import com.kot.observer.domain.Subject;
import com.kot.observer.domain.Subscriber;
import org.javamoney.moneta.Money;

import javax.money.MonetaryAmount;
import java.util.HashSet;
import java.util.Set;

class AuctionSubject implements Subject {

    private Set<Subscriber> subscribers = new HashSet<>();

    private MonetaryAmount currentBid = Money.of(12, "EUR");

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unSubscribe(Subscriber subscriber) {
        System.out.println("Unsubscribe " + subscriber);
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(NotificationPayload notificationPayload) {
        subscribers.forEach(s -> s.notify(notificationPayload));
    }

    public void bid(MonetaryAmount monetaryAmount) {
        currentBid = monetaryAmount;
        notifySubscribers(new NotificationPayload("current bd is : " + currentBid.toString()));
    }
}

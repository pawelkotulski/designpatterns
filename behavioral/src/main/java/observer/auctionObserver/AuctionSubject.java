package observer.auctionObserver;

import observer.domain.NotificationPayload;
import observer.domain.Subject;
import observer.domain.Subscriber;
import org.javamoney.moneta.Money;

import javax.money.MonetaryAmount;
import java.util.HashSet;
import java.util.Set;

class AuctionSubject implements Subject {

    private Set<Subscriber> subscribers = new HashSet<>();

    private MonetaryAmount currentBid = Money.of(0, "PLN");

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unSubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(NotificationPayload notificationPayload) {
        subscribers.forEach(s -> s.receiveNotification(notificationPayload));
    }

    public void bid(MonetaryAmount monetaryAmount) {
        currentBid = monetaryAmount;
        notifySubscribers(new NotificationPayload("current bd is : " + currentBid.toString()));
    }
}

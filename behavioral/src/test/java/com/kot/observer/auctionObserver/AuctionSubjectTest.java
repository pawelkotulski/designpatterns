package com.kot.observer.auctionObserver;

import com.kot.observer.domain.Subscriber;
import org.javamoney.moneta.Money;
import org.junit.jupiter.api.Test;

class AuctionSubjectTest {

    @Test
    void subscribe() {
    }

    @Test
    void unSubscribe() {
    }

    @Test
    void notifySubscribers() {
    }

    @Test
    void bidWithPrint() {
        //given
        AuctionSubject auction = new AuctionSubject();
        Subscriber s1 = new AuctionSubscriber("firstSubscriber");
        Subscriber s2 = new AuctionSubscriber("secondSubscriber");
        auction.subscribe(s1);
        auction.subscribe(s2);

        //when
        auction.bid(Money.of(12, "PLN"));
        auction.unSubscribe(s1);

        auction.bid(Money.of(15, "PLN"));
    }
}
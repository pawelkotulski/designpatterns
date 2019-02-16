package com.kot.strategy.model;

public class Context {

    private Strategy strategy;

    protected String executeStrategy(String text) {
        return strategy.modify(text);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}

package com.kot.strategy.taxStrategy.strategies;

import com.kot.strategy.model.Strategy;

public class EuropeTaxStrategy implements Strategy {
    @Override
    public String modify(String text) {
        return String.valueOf(calculateTax(text));
    }

    private double calculateTax(String text) {
        return Integer.valueOf(text) * 0.5;
    }
}

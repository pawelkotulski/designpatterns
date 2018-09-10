package strategy.taxStrategy.strategies;

import strategy.model.Strategy;

public class EuropeTaxStrategy implements Strategy {
    @Override
    public String modify(String text) {
        return String.valueOf(calculateTax(text));
    }

    private double calculateTax(String text) {
        return Integer.valueOf(text) * 0.2;
    }
}

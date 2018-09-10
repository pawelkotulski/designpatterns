package strategy.taxStrategy.strategies;

import strategy.model.Strategy;

public class MaltaTaxStrategy implements Strategy {
    @Override
    public String modify(String text) {
        return "0";
    }
}

package strategy.textStrategy;

import strategy.model.Strategy;

public class UpperCaseStrategy implements Strategy{
    @Override
    public String modify(String text) {
        return text.toUpperCase();
    }
}

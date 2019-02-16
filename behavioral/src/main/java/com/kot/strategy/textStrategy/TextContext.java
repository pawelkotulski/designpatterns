package com.kot.strategy.textStrategy;

import com.kot.strategy.model.Strategy;

import java.util.HashMap;
import java.util.Map;

public class TextContext {

    private final Map<TextModification, Strategy> strategies = new HashMap<>();

    {
        strategies.put(TextModification.CAMEL, new CammelCaseStrategy());
        strategies.put(TextModification.UPPER, new UpperCaseStrategy());
        strategies.put(TextModification.LOWER, new LowerCaseStrategy());
    }

    public String modify(String text, TextModification modification) {
        Strategy strategy = getStrategy(modification);
        return strategy.modify(text);
    }

    private Strategy getStrategy(TextModification modification) {
        return strategies.getOrDefault(modification, strategies.get(TextModification.LOWER));
    }
}

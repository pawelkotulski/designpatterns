package com.kot.strategy.taxStrategy.strategies;

import com.kot.strategy.model.Strategy;

public class MaltaTaxStrategy implements Strategy {
    @Override
    public String modify(String text) {
        return "0";
    }
}

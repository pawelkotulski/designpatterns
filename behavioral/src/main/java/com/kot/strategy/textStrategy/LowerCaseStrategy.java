package com.kot.strategy.textStrategy;

import com.kot.strategy.model.Strategy;

public class LowerCaseStrategy implements Strategy{

    @Override
    public String modify(String text) {
        return text.toLowerCase();
    }
}

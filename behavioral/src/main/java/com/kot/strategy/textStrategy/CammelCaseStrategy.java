package com.kot.strategy.textStrategy;

import com.kot.strategy.model.Strategy;

public class CammelCaseStrategy implements Strategy{
    @Override
    public String modify(String text) {
        return createCammelCase(text);
    }

    private String createCammelCase(String text) {
        return text;
    }
}

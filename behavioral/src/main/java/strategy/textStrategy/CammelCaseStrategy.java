package strategy.textStrategy;

import strategy.model.Strategy;

public class CammelCaseStrategy implements Strategy{
    @Override
    public String modify(String text) {
        return createCammelCase(text);
    }

    private String createCammelCase(String text) {
        return text;
    }
}

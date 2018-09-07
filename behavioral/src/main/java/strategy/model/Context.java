package strategy.model;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    private String executeStrategy(String text) {
        return strategy.modify(text);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}

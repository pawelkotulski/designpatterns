package strategy.taxStrategy;

import strategy.model.Context;
import strategy.model.Strategy;
import strategy.taxStrategy.domain.Country;
import strategy.taxStrategy.domain.Product;
import strategy.taxStrategy.strategies.EuropeTaxStrategy;
import strategy.taxStrategy.strategies.MaltaTaxStrategy;

public class TaxContext extends Context {

    Strategy europeStrategy = new EuropeTaxStrategy();
    Strategy maltaStrategy = new MaltaTaxStrategy();

    public String calculateTax(Product product, Country country) {

        switch (country){
            case EU :
                setStrategy(europeStrategy);
                break;
            case MALTA:
                setStrategy(maltaStrategy);
                break;
        }

        return executeStrategy(product.getPrice());
    }
}

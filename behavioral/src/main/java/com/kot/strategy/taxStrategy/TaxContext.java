package com.kot.strategy.taxStrategy;

import com.kot.strategy.model.Context;
import com.kot.strategy.model.Strategy;
import com.kot.strategy.taxStrategy.domain.Country;
import com.kot.strategy.taxStrategy.domain.Product;
import com.kot.strategy.taxStrategy.strategies.EuropeTaxStrategy;
import com.kot.strategy.taxStrategy.strategies.MaltaTaxStrategy;

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

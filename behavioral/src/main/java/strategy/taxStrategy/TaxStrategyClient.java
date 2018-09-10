package strategy.taxStrategy;

import strategy.taxStrategy.domain.Country;
import strategy.taxStrategy.domain.Product;

public class TaxStrategyClient {

    public static void main(String [] args) {

        Product car = new Product("100");

        TaxContext taxContext = new TaxContext();

        System.out.println("europe car tax: " + taxContext.calculateTax(car, Country.EU));
        System.out.println("malta car tax: " + taxContext.calculateTax(car, Country.MALTA));
    }
}

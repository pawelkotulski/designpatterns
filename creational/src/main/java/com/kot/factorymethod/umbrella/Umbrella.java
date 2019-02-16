package com.kot.factorymethod.umbrella;

import com.kot.factorymethod.buildingblocks.Product;

import javax.money.MonetaryAmount;

public class Umbrella implements Product {
    @Override
    public String getName() {
        return "Umbrella";
    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public MonetaryAmount getPrice() {
        return null;
    }
}

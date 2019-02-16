package com.kot.factorymethod.glow;

import com.kot.factorymethod.buildingblocks.Product;

import javax.money.MonetaryAmount;

public class Glow implements Product {
    @Override
    public String getName() {
        return "Glow";
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

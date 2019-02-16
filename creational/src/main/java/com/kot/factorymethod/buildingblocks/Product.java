package com.kot.factorymethod.buildingblocks;

import javax.money.MonetaryAmount;

public interface Product {
    String getName();
    int getWeight();
    MonetaryAmount getPrice();
}

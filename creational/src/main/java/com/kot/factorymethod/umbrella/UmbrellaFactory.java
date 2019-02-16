package com.kot.factorymethod.umbrella;

import com.kot.factorymethod.buildingblocks.Creator;
import com.kot.factorymethod.buildingblocks.Product;

public class UmbrellaFactory implements Creator {
    @Override
    public Product createProduct() {
        return new Umbrella();
    }
}

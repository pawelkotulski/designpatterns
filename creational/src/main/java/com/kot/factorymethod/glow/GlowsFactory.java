package com.kot.factorymethod.glow;

import com.kot.factorymethod.buildingblocks.Creator;
import com.kot.factorymethod.buildingblocks.Product;

public class GlowsFactory implements Creator {
    @Override
    public Product createProduct() {
        return new Glow();
    }
}

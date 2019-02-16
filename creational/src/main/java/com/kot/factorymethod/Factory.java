package com.kot.factorymethod;

import com.kot.factorymethod.buildingblocks.Product;
import com.kot.factorymethod.glow.GlowsFactory;
import com.kot.factorymethod.umbrella.UmbrellaFactory;

public class Factory {

    private final UmbrellaFactory umbrellaFactory = new UmbrellaFactory();

    private final GlowsFactory glowsFactory = new GlowsFactory();

    public Product makeProduct(ProductType productType){
        switch (productType ) {
            case UMBRELLA:
                return umbrellaFactory.createProduct();
            case GLOW:
                return glowsFactory.createProduct();
            default:
                throw new IllegalArgumentException("cannot build " + productType + " no factory for this type of product");
        }
    }
}

package com.kot.factorymethod;

import com.kot.factorymethod.buildingblocks.Product;
import org.junit.jupiter.api.Test;

import static com.kot.factorymethod.ProductType.GLOW;
import static com.kot.factorymethod.ProductType.UMBRELLA;
import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {

    @Test
    void makeProduct() {
        //given
        Factory factory = new Factory();

        //when
        Product umbrella = factory.makeProduct(UMBRELLA);
        Product glow = factory.makeProduct(GLOW);

        //then
        assertEquals("umbrella", umbrella.getName());
        assertEquals("glow", glow.getName());
    }
}
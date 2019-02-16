package com.kot.abstractfactory.buildingblocks;

import com.kot.abstractfactory.buildingblocks.products.Button;
import com.kot.abstractfactory.linux.LinuxFactory;
import com.kot.abstractfactory.macOs.MacOsFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {

    @Test
    public void testFactories() {
        //given
        AbstractFactory linuxFactory = new LinuxFactory();

        //when
        Button button = linuxFactory.createButton();
    }

    @Test
    public void testFactoriesMac() {
        //given
        AbstractFactory linuxFactory = new MacOsFactory();

        //when
        Button button = linuxFactory.createButton();
    }

}
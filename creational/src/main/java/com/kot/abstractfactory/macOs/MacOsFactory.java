package com.kot.abstractfactory.macOs;

import com.kot.abstractfactory.buildingblocks.AbstractFactory;
import com.kot.abstractfactory.buildingblocks.products.Button;
import com.kot.abstractfactory.buildingblocks.products.Slider;
import com.kot.abstractfactory.buildingblocks.products.Window;
import com.kot.abstractfactory.macOs.product.MacOsButton;
import com.kot.abstractfactory.macOs.product.MacOsSlider;
import com.kot.abstractfactory.macOs.product.MacOsWindow;

public class MacOsFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Slider createSlider() {
        return new MacOsSlider();
    }

    @Override
    public Window createWindow() {
        return new MacOsWindow();
    }
}

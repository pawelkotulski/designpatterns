package com.kot.abstractfactory.linux;

import com.kot.abstractfactory.buildingblocks.AbstractFactory;
import com.kot.abstractfactory.buildingblocks.products.Button;
import com.kot.abstractfactory.buildingblocks.products.Slider;
import com.kot.abstractfactory.buildingblocks.products.Window;
import com.kot.abstractfactory.linux.product.LinuxButton;
import com.kot.abstractfactory.linux.product.LinuxSlider;
import com.kot.abstractfactory.linux.product.LinuxWindow;

public class LinuxFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Slider createSlider() {
        return new LinuxSlider();
    }

    @Override
    public Window createWindow() {
        return new LinuxWindow();
    }
}

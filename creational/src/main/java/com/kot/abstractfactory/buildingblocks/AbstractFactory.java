package com.kot.abstractfactory.buildingblocks;

import com.kot.abstractfactory.buildingblocks.products.Button;
import com.kot.abstractfactory.buildingblocks.products.Slider;
import com.kot.abstractfactory.buildingblocks.products.Window;

public interface AbstractFactory {
    Button createButton();
    Slider createSlider();
    Window createWindow();
}

package com.kot.visitor;

import com.kot.visitor.buildingblocks.Element;
import com.kot.visitor.buildingblocks.Visitor;

public class Blind implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String up() {
        return null;
    }
}

package com.kot.visitor.buildingblocks;

public interface Element {
    void accept(Visitor visitor);
}

package com.kot.visitor;

import com.kot.visitor.buildingblocks.Visitor;

public class TurnOnVisitor implements Visitor {
    @Override
    public void visit(Blind blind) {
        System.out.println("Blind UP" + blind.up());
    }

    @Override
    public void visit(GarrageDoor garrageDoor) {
        System.out.println("GARRAGE UP" + garrageDoor.up());
    }

    @Override
    public void visit(Lamp lamp) {
        System.out.println("LAMP ON" + lamp.on());
    }
}

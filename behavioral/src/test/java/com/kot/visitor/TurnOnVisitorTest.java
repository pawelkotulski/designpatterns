package com.kot.visitor;

import com.kot.visitor.buildingblocks.Element;
import com.kot.visitor.buildingblocks.Visitor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TurnOnVisitorTest {

    @Test
    void visit() {
        //given
        Visitor visitor = new TurnOnVisitor();
        List<Element> devices = new ArrayList<>();
        devices.add(new Blind());
        devices.add(new GarrageDoor());
        devices.add(new Lamp());

        //when
        devices.forEach(element -> element.accept(visitor));
    }
}
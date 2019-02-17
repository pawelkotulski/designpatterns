package com.kot.visitor.buildingblocks;

import com.kot.visitor.Blind;
import com.kot.visitor.GarrageDoor;
import com.kot.visitor.Lamp;

public interface Visitor {
    void visit(Blind blind);
    void visit(GarrageDoor garrageDoor);
    void visit(Lamp lamp);
}

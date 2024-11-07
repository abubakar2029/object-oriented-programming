package com.abubakar.properties.inheritance;

public class Box {
    double l, w, h;

    // this is not needed here because there is no conflict between constructor params and properties
    Box() {
        l = -1;
        w = -1;
        h = -1;
        System.out.println("In parent constructor");
    }

    // for cube with equal sides
    Box(double side) {
        l = side;
        w = side;
        h = side;
    }

    // for an old box
    Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

}

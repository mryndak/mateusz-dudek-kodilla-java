package com.kodilla.testing.shape;

public class Circle implements Shape {

    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return Math.PI * r * r;
    }

}

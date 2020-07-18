package DesignPatterns.Adapter;

import javax.swing.*;
import java.awt.*;

public class Circle implements Shape {

    private double pi = Math.PI;
    private int radius;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public void draw() {
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getCircumference() {
        return 2 * pi * radius;
    }

    @Override
    public double getField() {
        return pi * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        int x = 100;
        int y = 100;

        Circle circle = new Circle();
        circle.setRadius(10);

    }
}
package DesignPatterns.Adapter;

import java.awt.*;

public class Triangle implements Shape {

    @Override
    public void draw(Graphics2D graphics2D, int vertical, int horizontal, int r) {

    }

    @Override
    public double getCircumference() {
        return 0;
    }

    @Override
    public double getField() {
        return 0;
    }
}

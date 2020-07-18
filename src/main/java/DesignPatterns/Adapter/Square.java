package DesignPatterns.Adapter;

import java.awt.*;

public class Square implements Shape{

    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void draw(Graphics2D graphics2D, int vertical, int horizontal, int r) {

    }

    @Override
    public double getCircumference() {
        return 4 * side;
    }

    @Override
    public double getField() {
        return Math.pow(side, 2);
    }
}

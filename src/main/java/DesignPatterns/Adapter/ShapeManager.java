package DesignPatterns.Adapter;

import java.util.ArrayList;
import java.util.List;

public class ShapeManager {

    List<Shape> listOfShapes = new ArrayList<>();

    public void addShape(Shape shape) {
        listOfShapes.add(shape);
    }

    public void drawAllShapes() {

    //    listOfShapes.stream().forEach(s -> s.draw());

    }

    public void printAllCircumferences() {
        System.out.println();
    }


}

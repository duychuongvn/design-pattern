package vn.chuonghd.journaldev.structuralpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huynhduychuong on 3/20/2016.
 */
public class Drawing implements Shape {

    private List<Shape> shapes = new ArrayList<Shape>();

    public void add(Shape shape) {
        this.shapes.add(shape);
    }

    public void remove(Shape shape) {
        this.shapes.remove(shape);
    }

    public void draw(String color) {

        for (Shape shape : shapes) {
            shape.draw(color);
        }
    }
}

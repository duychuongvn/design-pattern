package vn.chuonghd.journaldev.structuralpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by huynhduychuong on 3/26/2016.
 */
public class ShapeFactory {

    public static enum ShapeType {OVAL_FILL, OVAL_NOFILL, LINE}

    private static final Map<ShapeType, Shape> shapes = new HashMap<ShapeType, Shape>();

    public static Shape getShape(ShapeType shapeType) {
        Shape shape = shapes.get(shapeType);
        if (shape == null) {
            if (shapeType == ShapeType.OVAL_FILL) {
                shape = new Oval(true);
            } else if (shapeType == ShapeType.OVAL_NOFILL) {
                shape = new Oval(false);
            } else {
                shape = new Line();
            }
            shapes.put(shapeType, shape);
        }
        return shape;
    }
}

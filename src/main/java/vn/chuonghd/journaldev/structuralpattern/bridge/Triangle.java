package vn.chuonghd.journaldev.structuralpattern.bridge;

/**
 * Created by huynhduychuong on 3/27/2016.
 */
public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {

        System.out.print("Triangle filled with color: ");
        color.applyColor();
    }
}

package vn.chuonghd.journaldev.structuralpattern.composite;

/**
 * Created by huynhduychuong on 3/20/2016.
 */
public class CompositeDemo {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        Shape circle1 = new Circle();
        Shape square1 = new Square();

        drawing.add(circle1);
        drawing.add(square1);
        drawing.draw("red");
    }

}

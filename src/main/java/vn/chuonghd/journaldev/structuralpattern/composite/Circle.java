package vn.chuonghd.journaldev.structuralpattern.composite;

/**
 * Created by huynhduychuong on 3/20/2016.
 */
public class Circle implements Shape {
    public void draw(String color) {

        System.out.println("Draw Circle with color: " + color);
    }
}

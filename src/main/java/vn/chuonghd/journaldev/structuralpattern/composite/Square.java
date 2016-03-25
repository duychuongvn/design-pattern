package vn.chuonghd.journaldev.structuralpattern.composite;

import java.util.Arrays;

/**
 * Created by huynhduychuong on 3/20/2016.
 */
public class Square implements Shape {
    public void draw(String color) {
        System.out.println("Draw Square with color: " + color);
    }
}

package vn.chuonghd.journaldev.structuralpattern.flyweight;

import java.awt.*;

/**
 * Created by huynhduychuong on 3/26/2016.
 */
public class Line implements Shape {

    public Line() {
        System.out.println("Creating line object...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics line, int x, int y, int width, int height, Color color) {

        line.setColor(color);
        line.drawLine(x, y, width, height);
    }
}

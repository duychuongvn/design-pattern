package vn.chuonghd.journaldev.structuralpattern.flyweight;

import java.awt.*;

/**
 * Created by huynhduychuong on 3/26/2016.
 */
public class Oval implements Shape {

    private boolean fill;

    public Oval(boolean fill) {
        this.fill = fill;
        System.out.println("Creating Oval object with fill = " + fill);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics oval, int x, int y, int width, int height, Color color) {

        oval.setColor(color);
        oval.drawOval(x, y, width, height);
        if (fill) {
            oval.fillOval(x, y, width, height);
        }
    }
}

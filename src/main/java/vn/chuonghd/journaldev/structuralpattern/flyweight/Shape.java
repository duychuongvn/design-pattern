package vn.chuonghd.journaldev.structuralpattern.flyweight;

import java.awt.*;

/**
 * Created by huynhduychuong on 3/26/2016.
 */
public interface Shape {
    void draw(Graphics graphics, int x, int y, int width, int height, Color color);
}

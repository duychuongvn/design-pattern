package vn.chuonghd.journaldev.structuralpattern.flyweight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by huynhduychuong on 3/26/2016.
 */
public class DrawingClient extends JFrame {

    private final int WIDTH;
    private final int HEIGHT;

    private static final ShapeFactory.ShapeType[] shapeTypes = {ShapeFactory.ShapeType.LINE, ShapeFactory.ShapeType.OVAL_FILL, ShapeFactory.ShapeType.OVAL_NOFILL};

    private static final Color[] colors = {Color.RED, Color.BLUE, Color.YELLOW};

    public DrawingClient(int width, int height) {
        this.HEIGHT = width;
        this.WIDTH = height;
        Container container = getContentPane();
        JButton startButton = new JButton("Draw");
        final JPanel panel = new JPanel();
        container.add(panel, BorderLayout.CENTER);
        container.add(startButton, BorderLayout.SOUTH);
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Graphics graphics = panel.getGraphics();
                for (int i = 0; i < 20; i++) {
                    Shape shape = ShapeFactory.getShape(getRandomeShapeType());
                    shape.draw(graphics, getRandomX(), getRandomY(), getRandomWidth(), getRandomHeight(), getRandomeColor());
                }
            }

        });
    }

    private Color getRandomeColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private int getRandomHeight() {
        return (int) (Math.random() * HEIGHT / 10);
    }

    private int getRandomWidth() {
        return (int) (Math.random() * WIDTH / 10);
    }


    private ShapeFactory.ShapeType getRandomeShapeType() {
        return shapeTypes[(int) (Math.random() * shapeTypes.length)];
    }

    private int getRandomX() {

        return (int) (Math.random() * WIDTH);
    }

    private int getRandomY() {
        return (int) (Math.random() * HEIGHT);
    }
}

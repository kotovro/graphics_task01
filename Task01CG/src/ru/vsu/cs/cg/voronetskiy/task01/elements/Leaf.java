package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class Leaf extends BaseElement {
    private Color color;
    private double ratio;
    public Leaf(int x, int y, int size, double ratio, Color color) {
        this.positionX = x;
        this.positionY = y;
        this.size = size;
        this.color = color;
        this.ratio = ratio;
    }

    @Override
    public void drawSelf(Graphics2D g2d) {
        g2d.setColor(this.color);
        g2d.fillOval(positionX, positionY, (int)(size / ratio), size);
        g2d.setColor(Color.gray);
    }
}

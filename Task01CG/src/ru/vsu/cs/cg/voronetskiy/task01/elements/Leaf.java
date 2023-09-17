package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;
import java.util.Random;

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
    public void drawSelf(Graphics2D g2d, int frameNumber) {
        g2d.setColor(this.color);
        Random random = new Random();
        int shift = (int)((size / ratio / 2) * (frameNumber % 2) * (Math.pow(-1, random.nextInt(0, 2))));
        g2d.fillOval(positionX + shift, positionY, (int)(size / ratio), size);
        g2d.setColor(Color.gray);

    }
}

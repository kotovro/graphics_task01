package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;
import java.util.Random;

public class Leaf extends BaseElement {
    private Color color;
    private double ratio;
    private double angle;
    public Leaf(int x, int y, int size, double ratio, double angle, int animationDelay, Color color, BaseElement parent) {
        this.positionX = x;
        this.positionY = y;
        this.size = size;
        this.color = color;
        this.ratio = ratio;
        this.parent = parent;
        this.angle = angle;
        this.animationDelay = animationDelay * 2;
    }

    @Override
    public void drawSelf(Graphics2D g2d, int frameNumber) {
        getScale();
        int scaledSize = (int)(size * scaleY);
        int scaledX = (int)(positionX * scaleX);
        int scaledY = (int)(positionY * scaleY);
        g2d.setColor(this.color);
        int frame = (frameNumber / animationDelay) % 4;
        double[] angles = {Math.PI / 6, 0, -Math.PI / 6, 0};
        double angleShift = angles[frame];
        g2d.rotate(this.angle + angleShift, scaledX + ((int)(scaledSize / ratio) / 2), scaledY + (int)(scaledSize / 2));
        g2d.fillOval(scaledX, scaledY, (int)(scaledSize / ratio), scaledSize);
        g2d.rotate(-this.angle - angleShift, scaledX + ((int)(scaledSize / ratio) / 2), scaledY + (int)(scaledSize / 2));
        g2d.setColor(Color.gray);

    }
}

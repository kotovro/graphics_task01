package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class Spica extends BaseElement {
    private double angle;
    public Spica(int x, int y, double angle, int animationDelay, BaseElement parent) {
        this.positionX = x;
        this.positionY = y;
        this.parent = parent;
        this.angle = angle;
        this.size = parent.size / 2;
        this.animationDelay = animationDelay;
    }

    @Override
    public void drawSelf(Graphics2D g2d, int frameNumber) {
        getScale();
        int frame = (frameNumber / animationDelay) % 360;
        double angleShift = frame * 2 * Math.PI / 360;
        int scaledX = (int) (scaleX * positionX);
        int scaledY = (int) (scaleY * positionY);
        int scaledX1 = (int) ((positionX + size * Math.cos(angle + angleShift)) * scaleX);
        int scaledY1 = (int) ((positionY + size * Math.sin(angle + angleShift)) * scaleY);
        g2d.drawLine(scaledX, scaledY, scaledX1, scaledY1);
    }
}

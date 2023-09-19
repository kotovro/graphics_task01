package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Caret extends BaseElement {
    private double angle;
    private Color colorUp;
    private Color colorDown;

    public Caret(int x, int y, int size, double angle,  Color color1, Color color2, BaseElement parent) {
        this.positionX = x;
        this.positionY = y;
        this.size = size;
        this.parent = parent;
        this.angle = angle;
        this.colorUp = color1;
        this.colorDown = color2;
    }

    @Override
    public void drawSelf(Graphics2D g2d, int frameNumber) {
        getScale();
        int frame = frameNumber  % 100;
        double angleShift = frame * 2 * Math.PI / 100;
        int scaledSize = (int) (size * scaleY);
        int width = size * 2 / 3;
        int scaledCenterX1 = (int) ((positionX + parent.size / 2 * Math.cos(angle + angleShift)) * scaleX);
        int scaledWidth = (int) (width * scaleX);
        int scaledY = (int) ((positionY + parent.size /2  * Math.sin(angle + angleShift)) * scaleY);
        g2d.setColor(Color.lightGray);
        GeneralPath path = new GeneralPath();
        path.moveTo(scaledCenterX1 + scaledWidth / 4, scaledY + scaledSize / 3);
        path.quadTo(scaledCenterX1 + scaledWidth / 2, scaledY + scaledSize / 2, scaledCenterX1 + scaledWidth / 4, scaledY + scaledSize * 2 / 3);
        g2d.draw(path);
        g2d.setColor(colorUp);
        g2d.fillArc(scaledCenterX1 - scaledWidth / 2, scaledY, scaledWidth, scaledSize * 2 / 3, 0, 180);
        g2d.setColor(colorDown);
        g2d.fillArc(scaledCenterX1 - scaledWidth / 2, scaledY + scaledSize / 3, scaledWidth, scaledSize * 2 / 3, 0, -180);
    }
}

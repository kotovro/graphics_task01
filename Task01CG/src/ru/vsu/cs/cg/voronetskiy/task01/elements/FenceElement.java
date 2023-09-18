package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class FenceElement extends BaseElement {

    private Color color;
    public FenceElement(int x, int y, int size, Color color, BaseElement parent) {
        this.positionX = x;
        this.positionY = y;
        this.size = size;
        this.color = color;
        this.parent = parent;
    }

    @Override
    public void drawSelf(Graphics2D g2d, int frameNumber) {
        getScale();
        int scaledSize = (int)(size * scaleY);
        int scaledX = (int)(positionX * scaleX);
        int scaledY = (int)(positionY * scaleY);
        GeneralPath path = new GeneralPath();
        int width = (int) (size / 6 * scaleX);
        path.moveTo(scaledX + width / 2, scaledY);
        path.lineTo(scaledX, scaledY + scaledSize / 6);
        path.lineTo(scaledX, scaledY + scaledSize);
        path.lineTo(scaledX + width, scaledY + scaledSize);
        path.lineTo(scaledX + width, scaledY + scaledSize / 6);
        path.lineTo(scaledX + width / 2, scaledY);
        path.closePath();
        g2d.setColor(color);
        g2d.fill(path);
    }
}

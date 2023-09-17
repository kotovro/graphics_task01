package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class FenceElement extends BaseElement {

    private Color color;
    public FenceElement(int x, int y, int size, Color color) {
        this.positionX = x;
        this.positionY = y;
        this.size = size;
        this.color = color;
    }

    @Override
    public void drawSelf(Graphics2D g2d) {
        GeneralPath path = new GeneralPath();
        int width = size / 6;
        path.moveTo(positionX + width / 2, positionY);
        path.lineTo(positionX, positionY + size / 6);
        path.lineTo(positionX, positionY + size);
        path.lineTo(positionX + width, positionY + size);
        path.lineTo(positionX + width, positionY + size / 6);
        path.lineTo(positionX + width / 2, positionY);
        path.closePath();
        g2d.setColor(color);
        g2d.fill(path);
    }
}

package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Support extends BaseElement {
    public Support(int x, int y, int size, BaseElement parent) {
        this.positionX = x;
        this.positionY = y;
        this.size = size;
        this.parent = parent;
    }

    @Override
    public void drawSelf(Graphics2D g2d, int frameNumber) {
        //g2d.setStroke(new BasicStroke(10));
        getScale();
        int scaledSize = (int)(size * scaleY);
        int scaledWidth = (int)(size / 2 * scaleX);
        int scaledX = (int)(positionX * scaleX);
        int scaledY = (int)(positionY * scaleY);
        GeneralPath path = new GeneralPath();
        int thickness = scaledSize / 30;
        path.moveTo(scaledX + scaledWidth / 2, scaledY);
        path.lineTo(scaledX + scaledWidth, scaledY + scaledSize);
        path.lineTo(scaledX + scaledWidth - thickness, scaledY + scaledSize);
        path.lineTo(scaledX + scaledWidth / 2, scaledY + thickness);
        path.lineTo(scaledX + thickness, scaledY + scaledSize);
        path.lineTo(scaledX, scaledY + scaledSize);
        path.moveTo(scaledX + scaledWidth / 2, scaledY);
        g2d.setColor(Color.gray);
        g2d.fill(path);

    }
}

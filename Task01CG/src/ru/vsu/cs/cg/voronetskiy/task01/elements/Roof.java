package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class Roof extends BaseElement {
    public Roof(int x, int y, int height, BaseElement parent) {
        this.positionX = x;
        this.positionY = y;
        this.size = height;
        this.parent = parent;
    }

    @Override
    public void drawSelf(Graphics2D g2d, int frameNumber) {
        getScale();
        int scaledSize = (int) Math.ceil(size * scaleY);
        int scaledX = (int)(positionX * scaleX);
        int scaledY = (int)Math.ceil((positionY * scaleY));
        int roofWidth = (int)(size * 3 * 1.4 * scaleX);
            int roofPositionX = (int)(roofWidth / 2.8 - roofWidth / 2.0) + scaledX;
        g2d.setColor(Color.red);
        g2d.fillPolygon(new int[]{roofPositionX,  roofPositionX + roofWidth / 2, roofPositionX + roofWidth}, new int[]{scaledY + scaledSize, scaledY, scaledY + scaledSize}, 3);
    }
}

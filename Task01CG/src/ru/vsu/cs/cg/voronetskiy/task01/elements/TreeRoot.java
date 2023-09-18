package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class TreeRoot extends BaseElement {

    public TreeRoot(int x, int y, int size, BaseElement parent) {
        this.positionX = x;
        this.positionY = y;
        this.size = size;
        this.parent = parent;
    }

    @Override
    public void drawSelf(Graphics2D g2d, int frameNumber) {
        getScale();
        int scaledSize = (int)(size * scaleY);
        int scaledWidth = (int)(size / 8 * scaleX);
        int scaledX = (int)(positionX * scaleX);
        int scaledY = (int)(positionY * scaleY);
        g2d.setColor(new Color(128, 64, 64));
        g2d.fillRect(scaledX - scaledWidth / 2, scaledY - scaledSize, scaledWidth, scaledSize);
    }
}

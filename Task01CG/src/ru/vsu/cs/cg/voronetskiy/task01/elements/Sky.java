package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class Sky extends BaseElement {
    private int width;
    public Sky(int x, int y, int width, int height, BaseElement parent) {
        this.positionX = x;
        this.positionY = y;
        this.width = width;
        this.size = height;
        this.parent = parent;
    }

    @Override
    public void drawSelf(Graphics2D g2d, int frameNumber) {
        getScale();
        int scaledSize = (int)(size * scaleY);
        int scaledX = (int)(positionX * scaleX);
        int scaledY = (int)(positionY * scaleY);
        int scaledWidth = (int)(width * scaleX);
        g2d.setColor(Color.cyan);
        g2d.fillRect(scaledX, scaledY, scaledWidth, scaledSize);
    }
}

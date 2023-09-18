package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class Window extends BaseElement {
    public Window(int x, int y, int height, BaseElement parent) {
        this.positionX = x;
        this.positionY = y;
        this.size = height;
        this.parent = parent;
    }

    @Override
    public void drawSelf(Graphics2D g2d, int frameNumber) {
        getScale();
        int width = (int) (size * scaleX);
        int scaledSize = (int) (size * scaleY);
        int scaledX = (int)(positionX * scaleX);
        int scaledY = (int)(positionY * scaleY);
        g2d.setColor(Color.blue);
        g2d.fillRoundRect(scaledX, scaledY, width, scaledSize, 10, 20);
    }
}

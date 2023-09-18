package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class Wall extends BaseElement {

    public Wall(int x, int y, int height, BaseElement parent) {
        this.positionX = x;
        this.positionY = y;
        this.size = height;
        this.parent = parent;
        int width = size * 3 / 4;
        int windowWidth = (int)(0.6 * width);
        int windowX = positionX + width / 2 - windowWidth / 2;
        int windowY = positionY + width / 2 - windowWidth / 2;
        this.parts.add(new Window(windowX, windowY, windowWidth, this));
        int labelWidth = (int)(windowWidth * 1.4);
        this.parts.add(new Label(windowX - (labelWidth - windowWidth) / 2,  windowY + windowWidth + (labelWidth - windowWidth) / 2, labelWidth, "Аттракцион", this));
    }

    @Override
    public void drawSelf(Graphics2D g2d, int frameNumber) {
        getScale();
        int scaledSize = (int)(size * scaleY);
        int scaledX = (int)(positionX * scaleX);
        int scaledY = (int)(positionY * scaleY);
        int scaledWidth = (int) (size * 3 / 4 * scaleX);
        g2d.setColor(Color.gray);
        g2d.fillRect(scaledX, scaledY, scaledWidth, scaledSize);
        super.drawSelf(g2d, frameNumber);
    }
}
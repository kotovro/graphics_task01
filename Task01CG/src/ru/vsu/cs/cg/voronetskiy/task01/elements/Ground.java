package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Ground extends BaseElement{
    private int width;
    public Ground(int x, int y, int width, int height, BaseElement parent) {
        this.positionY = y;
        this.positionX = x;
        this.size = height;
        this.width = width;
        this.parent = parent;
        this.parts.add(new Forest(x, y, width, height, this));
        int fenceHeight = height / 6;
        this.parts.add(new Fence(x, y + height - fenceHeight, width, fenceHeight, this));
        this.parts.add(new House(x, y, width, height, this));

    }

    @Override
    public void drawSelf(Graphics2D g2d, int frameNumber) {
        getScale();
        int scaledSize = (int)(size * scaleY);
        int scaledWidth = (int)(width * scaleX);
        int scaledX = (int)(positionX * scaleX);
        int scaledY = (int)(positionY * scaleY);
        g2d.setColor(Color.green);
        g2d.fillRect(scaledX, scaledY, scaledWidth, scaledSize);
        super.drawSelf(g2d, frameNumber);
    }
}

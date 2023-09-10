package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class Sky extends BaseElement {
    private int width;
    public Sky(int x, int y, int width, int height) {
        this.positionX = x;
        this.positionY = y;
        this.width = width;
        this.size = height;

    }

    @Override
    public void drawSelf(Graphics2D g2d) {
        g2d.setColor(Color.cyan);
        g2d.fillRect(positionX, positionY, width, size);
    }
}

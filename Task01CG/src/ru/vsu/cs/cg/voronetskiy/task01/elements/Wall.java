package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class Wall extends BaseElement {
    public Wall(int x, int y, int height) {
        this.positionX = x;
        this.positionY = y;
        this.size = height;
    }

    @Override
    public void drawSelf(Graphics2D g2d) {
        g2d.setColor(Color.gray);
        g2d.fillRect(positionX, positionY, size, (int)(size * 1.5));
    }
}
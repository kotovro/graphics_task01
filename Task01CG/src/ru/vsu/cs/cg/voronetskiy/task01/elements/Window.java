package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class Window extends BaseElement {
    public Window(int x, int y, int height) {
        this.positionX = x;
        this.positionY = y;
        this.size = height;
    }

    @Override
    public void drawSelf(Graphics2D g2d, int frameNumber) {
        g2d.setColor(Color.blue);
        g2d.fillRoundRect(positionX, positionY, size, size, 10, 20);
    }
}

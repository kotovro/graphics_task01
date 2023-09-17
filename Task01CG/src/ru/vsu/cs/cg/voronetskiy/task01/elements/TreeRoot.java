package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class TreeRoot extends BaseElement {
    public TreeRoot(int x, int y, int size) {
        this.positionX = x;
        this.positionY = y;
        this.size = size;
    }

    @Override
    public void drawSelf(Graphics2D g2d, int frameNumber) {
        g2d.setColor(new Color(128, 64, 64));
        g2d.fillRect(positionX, positionY, size / 8, size);
    }
}

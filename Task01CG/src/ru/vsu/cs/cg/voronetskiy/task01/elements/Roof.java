package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class Roof extends BaseElement {
    public Roof(int x, int y, int height) {
        this.positionX = x;
        this.positionY = y;
        this.size = height;
    }

    @Override
    public void drawSelf(Graphics2D g2d, int frameNumber) {
        int roofWidth = (int)(size * 3 * 1.4);
            int roofPositionX = (int)(size * 3 / 2 - roofWidth / 2) + positionX;
        g2d.setColor(Color.red);
        g2d.fillPolygon(new int[]{roofPositionX,  roofPositionX + roofWidth / 2, roofPositionX + roofWidth}, new int[]{positionY + size, positionY, positionY + size}, 3);
    }
}

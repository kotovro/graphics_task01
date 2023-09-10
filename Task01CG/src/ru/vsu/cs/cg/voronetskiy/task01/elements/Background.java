package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class Background extends BaseElement {
    //private ;
    public Background(int x, int y, int width) {
        this.positionX = x;
        this.positionY = y;
        this.size = width;

    }

    @Override
    public void drawSelf(Graphics2D g2d) {
        g2d.setColor(Color.CYAN);
        g2d.fillRect(positionX, positionY, size, size * 2 / 3);
        g2d.setColor(Color.green);
        g2d.fillRect(positionX + size, positionY + size * 2 / 3, size, size * 2 / 3);

    }
}

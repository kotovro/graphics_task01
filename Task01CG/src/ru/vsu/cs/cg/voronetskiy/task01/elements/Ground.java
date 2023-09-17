package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class Ground extends BaseElement{
    private int width;
    public Ground(int x, int y, int width, int height) {
        this.positionY = y;
        this.positionX = x;
        this.size = height;
        this.width = width;
        this.parts.add(new Forest(x, y, width, height));
        this.parts.add(new House(x, y, width, height));
    }

    @Override
    public void drawSelf(Graphics2D g2d) {
        g2d.setColor(Color.green);
        g2d.fillRect(positionX, positionY, width, size);
        super.drawSelf(g2d);
    }
}

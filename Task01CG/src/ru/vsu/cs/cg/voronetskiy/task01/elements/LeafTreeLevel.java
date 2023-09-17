package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class LeafTreeLevel extends BaseElement {


    private double ratio;
    public LeafTreeLevel(int x, int y, int size, double ratio) {
        this.positionX = x;
        this.positionY = y;
        this.size = size;
        this.ratio = ratio;
    }
    @Override
    public void drawSelf(Graphics2D g2d) {
        // select color from some range and add leves
        g2d.setColor(Color.green);
        g2d.fillOval(positionX, positionY, (int)(size / ratio), size);
        g2d.setColor(Color.gray);
        g2d.drawOval(positionX, positionY, (int)(size / ratio), size);

    }
}



package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class OtherTreeLevel extends BaseElement {

    public OtherTreeLevel(int x, int y, int size) {
        this.positionX = x;
        this.positionY = y;
        this.size = size;
    }
    @Override
    public void drawSelf(Graphics2D g2d) {
        int[] arrOfX = new int[] {positionX, positionX + size / 10, positionX + size / 5};
        int[] arrOfY = new int[] {positionY + size, positionY, positionY + size};

        g2d.setColor(Color.green);
        g2d.drawPolygon(arrOfX, arrOfY, 3);
        g2d.fillPolygon(arrOfX, arrOfY, 3);
    }
}

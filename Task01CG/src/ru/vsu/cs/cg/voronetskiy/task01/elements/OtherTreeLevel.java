package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class OtherTreeLevel extends BaseElement {

    private double ratio;
    public OtherTreeLevel(int x, int y, int size, double ratio) {
        this.positionX = x;
        this.positionY = y;
        this.size = size;
        this.ratio = ratio;
    }
    @Override
    public void drawSelf(Graphics2D g2d) {
        int[] arrOfX = new int[] {positionX, (int) (positionX + size / 2 / ratio), (int) (positionX + size / ratio)};
        int[] arrOfY = new int[] {positionY + size, positionY, positionY + size};

        g2d.setColor(Color.green);
        g2d.drawPolygon(arrOfX, arrOfY, 3);
        g2d.fillPolygon(arrOfX, arrOfY, 3);
    }
}

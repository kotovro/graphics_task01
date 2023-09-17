package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.Random;

public class OtherTreeLevel extends BaseElement {

    private double ratio;
    private Color color;
    public OtherTreeLevel(int x, int y, int size, double ratio, Color color) {
        this.positionX = x;
        this.positionY = y;
        this.size = size;
        this.ratio = ratio;
        this.color = color;
    }
    @Override
    public void drawSelf(Graphics2D g2d, int frameNumber) {
        g2d.setColor(color);
        GeneralPath path = new GeneralPath();
        int levelWidth = (int)(size / ratio);
        int shift = (int)((levelWidth / 8) * (frameNumber % 2) * Math.pow(-1, ((frameNumber + 1) % 4) / 2) );
//        path.moveTo(positionX, positionY + size);
        path.moveTo(positionX + size / 2 / ratio, positionY + size - size / 5);
        path.quadTo((int) (positionX + size / 2 / ratio), positionY + size, positionX, positionY + size - shift / 2);
        path.quadTo((int) (positionX + size / 2 / ratio), positionY + size, (int) (positionX + size / 2 / ratio) + shift, positionY + Math.abs(shift));
//        path.moveTo(positionX + size / ratio, positionY + size);
        path.quadTo((int) (positionX + size / 2 / ratio), positionY + size, positionX + size / ratio, positionY + size + shift / 2);
//        path.moveTo(positionX, positionY + size);
//        path.lineTo(positionX + size / ratio, positionY + size);
        path.quadTo((int) (positionX + size / 2 / ratio), positionY + size, positionX + size / 2 / ratio, positionY + size - size / 5);
        path.closePath();
        //g2d.draw(path);
        //g2d.setColor(Color.green);
        g2d.fill(path);
    }
}

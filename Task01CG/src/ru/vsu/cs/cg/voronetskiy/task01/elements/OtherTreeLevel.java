package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.Random;

public class OtherTreeLevel extends BaseElement {

    private double ratio;
    private Color color;
    public OtherTreeLevel(int x, int y, int size, double ratio, Color color, BaseElement parent) {
        this.positionX = x;
        this.positionY = y;
        this.size = size;
        this.ratio = ratio;
        this.color = color;
        this.parent = parent;
    }
    @Override
    public void drawSelf(Graphics2D g2d, int frameNumber) {
        getScale();
        int scaledSize = (int)(size * scaleY);
        int scaledX = (int)(positionX * scaleX);
        int scaledY = (int)(positionY * scaleY);
        double scaledRatio = ratio * scaleY / scaleX;
        g2d.setColor(color);
        GeneralPath path = new GeneralPath();
        int levelWidth = (int)(scaledSize / scaledRatio);
        int shift = (int)((levelWidth / 8) * (frameNumber % 2) * Math.pow(-1, ((frameNumber + 1) % 4) / 2) );
        path.moveTo(scaledX + levelWidth / 2, scaledY + scaledSize - scaledSize / 5);
        path.quadTo(scaledX + levelWidth / 2, scaledY + scaledSize, scaledX, scaledY + scaledSize - shift / 2);
        path.quadTo((int) (scaledX + levelWidth / 2), scaledY + scaledSize, scaledX + levelWidth /2 + shift, scaledY + Math.abs(shift));
        path.quadTo(scaledX + levelWidth / 2, scaledY + scaledSize, scaledX + levelWidth, scaledY + scaledSize + shift / 2);
        path.quadTo((int) (scaledX + levelWidth /2), scaledY + scaledSize, scaledX + levelWidth / 2, scaledY + scaledSize - scaledSize / 5);
        path.closePath();
        //g2d.draw(path);
        //g2d.setColor(Color.green);
        g2d.fill(path);
    }
}

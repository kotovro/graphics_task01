package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class Wheel extends BaseElement{
    private int thickness;

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public Wheel(int x, int y, int size, int thickness, BaseElement parent) {
        this.positionX = x;
        this.positionY = y;
        this.size = size;
        this.parent = parent;
        this.thickness = thickness;
        for (int i = 0; i < 6; i++) {
            this.parts.add(new Spica(positionX + size / 2, positionY + size / 2, size / 2, Math.PI / 3 * i, this));
        }
    }

    @Override
    public void drawSelf(Graphics2D g2d, int frameNumber) {
        getScale();
        g2d.setColor(Color.black);
        int width = (int)(scaleX * size);
        int height = (int)(scaleY * size);
        int scaledX = (int) (positionX * scaleX);
        int scaledY = (int) (positionY * scaleY);
        g2d.setColor(Color.gray);
        Stroke oldStroke = g2d.getStroke();
        g2d.setStroke(new BasicStroke(thickness));
        g2d.drawOval(scaledX, scaledY, width, height);
        super.drawSelf(g2d, frameNumber);
        g2d.setStroke(oldStroke);

    }
}

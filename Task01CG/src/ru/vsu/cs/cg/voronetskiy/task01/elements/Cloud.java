package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class Cloud extends BaseElement {
    private int parentWidth;
    public Cloud(int x, int y, int parentWidth, BaseElement parent) {
        this.positionX = x;
        this.positionY = y;
        this.parent = parent;
        this.parentWidth = parentWidth;
        this.size = parent.size / 5;
    }

    @Override
    public void drawSelf(Graphics2D g2d, int frameNumber) {
        getScale();
        int frame = frameNumber  % 72;
        //double angleShift = frame * 2 * Math.PI / 72;
        double scaledSize = (int) (size * scaleY) ;
        double shift = parentWidth / 100 * scaleX;
        int scaledX = (int) (scaleX * positionX);
        int scaledY = (int) (scaleY * positionY);
    }
}

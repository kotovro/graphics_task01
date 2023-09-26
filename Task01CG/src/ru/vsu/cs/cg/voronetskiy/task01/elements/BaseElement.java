package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;
import java.util.LinkedList;

public class BaseElement implements Comparable<BaseElement> {

    protected int positionX;
    protected int positionY;
    protected int size;

    protected LinkedList<BaseElement> parts = new LinkedList<>();
    protected BaseElement parent;

    public double getScaleX() {
        return scaleX;
    }

    public void setScaleX(double scaleX) {
        this.scaleX = scaleX;
    }

    public double getScaleY() {
        return scaleY;
    }

    public void setScaleY(double scaleY) {
        this.scaleY = scaleY;
    }

    protected double scaleX;
    protected double scaleY;
    protected int animationDelay;


    public void drawSelf(Graphics2D g2d){
        drawSelf(g2d, 0);
    }
    public void drawSelf(Graphics2D g2d, int frameNumber){
        getScale();
        for (BaseElement element: parts) {
            element.drawSelf(g2d, frameNumber);
        }
    }
    public void getScale() {
        if (parent != null) {
            this.scaleX = parent.getScaleX();
            this.scaleY = parent.getScaleY();
        }
    }


    @Override
    public int compareTo(BaseElement o) {
        if (this.positionY + this.size > o.positionY + o.size) {
            return 1;
        } else if (this.positionY + this.size < o.positionY + o.size) {
            return -1;
        }
        return 0;
    }

}

package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;
import java.util.LinkedList;

public class BaseElement implements Comparable<BaseElement> {

    protected int positionX;
    protected int positionY;
    protected int size;

    protected LinkedList<BaseElement> parts = new LinkedList<>();

    public void drawSelf(Graphics2D g2d){
        for (BaseElement element: parts) {
            element.drawSelf(g2d);
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

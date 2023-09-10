package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;
import java.util.LinkedList;

public class BaseElement {

    protected int positionX;
    protected int positionY;
    protected int size;

    protected LinkedList<BaseElement> parts = new LinkedList<>();

    public void drawSelf(Graphics2D g2d){
        for (BaseElement element: parts) {
            element.drawSelf(g2d);
        }
    };

}

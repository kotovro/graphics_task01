package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class Tree extends BaseElement {
    protected int levels;
    protected int colorNum;

    public Tree(){}
    public Tree(int x, int y, int size, int animationDelay, BaseElement parent) {
        this(x,y,size, parent, 1, 0, animationDelay);
    }

    public Tree(int x, int y, int size, BaseElement parent, int levels, int animationDelay) {
        this(x,y,size, parent, levels, 0, animationDelay);
    }

    public Tree(int x, int y, int size, BaseElement parent, int levels, int color, int animationDelay) {
        this.positionX = x;
        this.positionY = y;
        this.size = size;
        this.levels = levels;
        this.colorNum = color;
        this.parent = parent;
        this.animationDelay = animationDelay;
        createRoot();
        createCrone();
    }

    protected void createCrone() {}
    protected void createRoot() {
        int rootHeight = size / 3;
        int treeWidth = size / 3;
        parts.add(new TreeRoot(positionX + treeWidth / 2, positionY + size, rootHeight, this));
    }

}

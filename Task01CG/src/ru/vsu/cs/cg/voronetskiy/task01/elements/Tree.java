package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class Tree extends BaseElement {
    protected int levels;
    protected int colorNum;

    public Tree(){}
    public Tree(int x, int y, int size, BaseElement parent) {
        this(x,y,size, parent, 1, 0);
    }

    public Tree(int x, int y, int size, BaseElement parent, int levels) {
        this(x,y,size, parent, levels, 0);
    }

    public Tree(int x, int y, int size, BaseElement parent, int levels, int color) {
        this.positionX = x;
        this.positionY = y;
        this.size = size;
        this.levels = levels;
        this.colorNum = color;
        this.parent = parent;
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

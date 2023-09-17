package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class Tree extends BaseElement {
    protected int levels;
    protected int colorNum;

    public Tree(){}
    public Tree(int x, int y, int size) {
        this(x,y,size,1, 0);
    }

    public Tree(int x, int y, int size, int levels) {
        this(x,y,size,levels, 0);
    }

    public Tree(int x, int y, int size, int levels, int color) {
        this.positionX = x;
        this.positionY = y;
        this.size = size;
        this.levels = levels;
        this.colorNum = color;
        createRoot();
        createCrone();
    }

    protected void createCrone() {}
    protected void createRoot() {
        int rootHeight = size / 3;
        int croneHeight = size * 5 / 6;
        int treeWidth = size / 3;
        int rootWidth = rootHeight / 8;
        parts.add(new TreeRoot(positionX + treeWidth / 2 - rootWidth / 2, positionY + size - rootHeight, rootHeight));
    }

}

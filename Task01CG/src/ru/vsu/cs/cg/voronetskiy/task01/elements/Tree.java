package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class Tree extends BaseElement {
    protected int levels;

    public Tree(){}
    public Tree(int x, int y, int size, int levels) {
        this.positionX = x;
        this.positionY = y;
        this.size = size;
        this.levels = levels;
        createRoot();
        createCrone();
    }

    protected void createCrone() {}
    protected void createRoot() {
        int rootHeight = size / 6;
        int croneHeight = size * 5 / 6;
        int treeWidth = size / 3;
        int rootWidth = rootHeight / 4;
        parts.add(new TreeRoot(positionX + treeWidth / 2 - rootWidth / 2, positionY + croneHeight, rootHeight));
    }

}

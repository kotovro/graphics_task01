package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;
import java.util.Random;

public class OtherTree extends BaseElement {
    // дерево из треугольников(хвойное)
    // высота дерева в 6 раза > ширины,
    // то есть ширина это size / 6
    // в дереве - от 1 до 5 уровней(треугольников)
    // и один уровень-корень
    // корень высотой в 1/6 дерева
    // шириной в 1/6 ширины дерева

    private int levels;
    public OtherTree(int x, int y, int size, int lvl) {
        this.positionX = x;
        this.positionY = y;
        this.size = size;
        this.levels = lvl;
        createParts();
    }
    private void createParts() {
        int rootHeight = size / 6;
        int croneHeight = size * 5 / 6;
        int treeWidth = size / 6;
        int rootWidth = rootHeight / 4;
        parts.add(new TreeRoot(positionX + treeWidth / 2 - rootWidth / 2, positionY + croneHeight, rootHeight));
        for (int i = 0; i < levels; i++) {
            parts.add(new OtherTreeLevel(positionX + (levels - i - 1) * size / 72, positionY - (levels - i - 1) * size / 36, size * (5 / levels + i) / 6));
        }
    }

}

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
        int treeWidth = size / 3;
        int rootWidth = rootHeight / 4;
        parts.add(new TreeRoot(positionX + treeWidth / 2 - rootWidth / 2, positionY + croneHeight, rootHeight));
        double[] fib = new double[] {0, 1.0/8, 1.0/5, 1.0/3, 1.0/2, 1.0/1.4};
        for (int i = 0; i < levels; i++) {
            int levelWidth = treeWidth;// / (levels - i);
            int levelHeight = croneHeight - (int)(croneHeight * fib[levels - i - 1]);
            double ratio = (double) levelHeight / levelWidth;

            parts.add(new OtherTreeLevel(positionX + treeWidth / 2 - levelWidth / 2, positionY, levelHeight, ratio));

        }
    }

}

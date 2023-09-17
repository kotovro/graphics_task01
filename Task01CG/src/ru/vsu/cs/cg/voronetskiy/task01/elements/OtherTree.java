package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class OtherTree extends Tree {

    private static Color[] availableColors =  {
            new Color(0, 40, 0),
            new Color(0, 70, 0),
            new Color(0, 100, 0),
            new Color(50, 128, 50),
            new Color(70, 156, 70),
    };

    public OtherTree(int x, int y, int size, int levels, int color) {
        super(x, y, size, levels, color);
    }

    @Override
    protected void createCrone() {
        int croneHeight = size * 5 / 6;
        int treeWidth = size / 3;
        double[] fib = new double[] {0, 1.0/8, 1.0/5, 1.0/3, 1.0/2, 1.0/1.4};
        for (int i = 0; i < levels; i++) {
            int levelWidth = treeWidth;// / (levels - i);
            int levelHeight = croneHeight - (int)(croneHeight * fib[levels - i - 1]);
            double ratio = (double) levelHeight / levelWidth;
            parts.add(new OtherTreeLevel(positionX + treeWidth / 2 - levelWidth / 2, positionY, levelHeight, ratio, availableColors[colorNum]));
        }
    }

}

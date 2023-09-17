package ru.vsu.cs.cg.voronetskiy.task01.elements;
public class OtherTree extends Tree {

    public OtherTree(int x, int y, int size, int levels) {
        super(x, y, size, levels);
    }
    // make their levels with arcs

    @Override
    protected void createCrone() {
        int croneHeight = size * 5 / 6;
        int treeWidth = size / 3;
        double[] fib = new double[] {0, 1.0/8, 1.0/5, 1.0/3, 1.0/2, 1.0/1.4};
        for (int i = 0; i < levels; i++) {
            int levelWidth = treeWidth;// / (levels - i);
            int levelHeight = croneHeight - (int)(croneHeight * fib[levels - i - 1]);
            double ratio = (double) levelHeight / levelWidth;
            parts.add(new OtherTreeLevel(positionX + treeWidth / 2 - levelWidth / 2, positionY, levelHeight, ratio));
        }
    }

}

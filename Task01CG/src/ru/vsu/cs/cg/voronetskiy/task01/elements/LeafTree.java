package ru.vsu.cs.cg.voronetskiy.task01.elements;

public class LeafTree extends Tree {
    public LeafTree(int x, int y, int size, BaseElement parent) {
        super(x, y, size, parent);
    }

    @Override
    protected void createCrone() {
        int croneHeight = size * 5 / 6;
        int treeWidth = size / 3;
        for (int i = 0; i < levels; i++) {
            int levelWidth = treeWidth;
            int baseLevelHeight = croneHeight / levels;
            int intersection = (int) (0.2 * baseLevelHeight);
            int levelHeight = baseLevelHeight + (i == 0 ? 0 : intersection);
            double ratio = (double) (levelHeight) / levelWidth;

            parts.add(new LeafTreeLevel(positionX + treeWidth / 2 - levelWidth / 2,
                    positionY + baseLevelHeight * i - (i == 0 ? 0 : intersection),
                    levelHeight, ratio, this));
        }
    }
}

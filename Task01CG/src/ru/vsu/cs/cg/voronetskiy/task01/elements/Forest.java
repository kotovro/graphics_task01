package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;
import java.time.chrono.ThaiBuddhistChronology;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;

public class Forest extends BaseElement {

    private int height;
    private int width;
    public Forest(int x, int y, int width, int height, BaseElement parent) {
        this.positionX = x;
        this.positionY = y;
        this.height = height;
        this.width = width;
        this.parent = parent;
        int maxTreeHeight = height * 3 / 4;
        Random random = new Random();

        int amountOther = random.nextInt(10, 40);
        for (int i = 0; i < amountOther; i++) {
            int treeSize = random.nextInt(80, maxTreeHeight);
//            int levels = random.nextInt(1, 7);
            int posX = random.nextInt(positionX, positionX + width - treeSize / 3);
            int posY = random.nextInt(positionY - treeSize, positionY + height - treeSize);
            this.parts.add(new LeafTree(posX, posY, treeSize, this));
        }
        amountOther = random.nextInt(10, 40);
        for (int i = 0; i < amountOther; i++) {
            int treeSize = random.nextInt(50, maxTreeHeight);
            int levels = random.nextInt(1, 7);
            int posX = random.nextInt(positionX, positionX + width - treeSize / 3);
            int posY = random.nextInt(positionY - treeSize, positionY + height - treeSize);
            int color = random.nextInt(0, 5);
            this.parts.add(new OtherTree(posX, posY, treeSize, levels, color, this));
        }
        this.parts.add(new Carusel(width / 3, (int)(height * 0.3), (int)(height), this));
        Collections.sort(this.parts);
    }
}
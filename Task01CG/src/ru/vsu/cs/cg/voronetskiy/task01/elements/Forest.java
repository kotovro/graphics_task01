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
    public Forest(int x, int y, int height, int width) {
        this.positionX = x;
        this.positionY = y;
        this.height = height;
        this.width = width;
        Random random = new Random();

        int amountOther = random.nextInt(1, 40);
        for (int i = 0; i < amountOther; i++) {
            int treeSize = random.nextInt(50, 300);
            int levels = random.nextInt(1, 7);
            int posX = random.nextInt(positionX, positionX + width);
            int posY = random.nextInt(positionY, positionY + height);
            this.parts.add(new LeafTree(posX, posY, treeSize, levels));
        }
        amountOther = random.nextInt(1, 20);
        for (int i = 0; i < amountOther; i++) {
            int treeSize = random.nextInt(50, 300);
            int levels = random.nextInt(1, 7);
            int posX = random.nextInt(positionX, positionX + width);
            int posY = random.nextInt(positionY, positionY + height);
            this.parts.add(new OtherTree(posX, posY, treeSize, levels));
        }
        Collections.sort(this.parts);
    }
}
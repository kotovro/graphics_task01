package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class LeafTreeLevel extends BaseElement {


    private double ratio;
    private Ellipse2D ellipse;
    private final int LEAVES_AMOUNT = 350;
    private static Color[] availableColors = {
            new Color(217, 217, 0),
            new Color(230, 0, 0),
            new Color(255, 128, 0),
            new Color(0, 128, 0),
            new Color(255, 200, 128),
            new Color(181, 255, 113),
    };

    public LeafTreeLevel(int x, int y, int size, double ratio, BaseElement parent) {
        this.positionX = x;
        this.positionY = y;
        this.size = size;
        this.ratio = ratio;
        this.parent = parent;
        int leafSize = size / 10;
        this.ellipse = new Ellipse2D.Double(positionX, positionY, size / ratio, size);
        Random random = new Random();
        while (parts.size() < LEAVES_AMOUNT) {
            int lx = random.nextInt(positionX, (int)(positionX + size / ratio));
            int ly = random.nextInt(positionY, positionY + size);
            tryAddLeaf(lx, ly, leafSize);
        }
    }

    private void tryAddLeaf(int lx, int ly, int leafSize) {
        if (ellipse.contains(lx, ly)) {
            Random random = new Random();
            int color = random.nextInt(0, 6);
            parts.add(new Leaf(lx, ly, leafSize, ratio, availableColors[color], this));
        }
    }
//    @Override
//    public void drawSelf(Graphics2D g2d) {
//        // select color from some range and add leves
//
//
////        g2d.fillOval(positionX, positionY, (int)(size / ratio), size);
////        g2d.setColor(Color.gray);
////        g2d.drawOval(positionX, positionY, (int)(size / ratio), size);
//
//    }

}



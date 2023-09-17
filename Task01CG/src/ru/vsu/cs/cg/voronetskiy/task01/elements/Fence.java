package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;
import java.util.Random;

public class Fence extends BaseElement {
    private int width;
    private Color[] availableColors = {
            new Color(128, 0, 0),
            new Color(0, 0, 255),
            new Color(74, 68, 193),
            new Color(114, 136, 141),
            new Color(172, 0, 255),
            new Color(52, 114, 107),
    };

    public Fence(int x, int y, int width, int height) {
        this.positionX = x;
        this.positionY = y;
        this.width = width;
        this.size = height;
        int fenceElementWidth = height / 6;
        int fenceElementCount = (int)(Math.ceil(width / (1.5 * fenceElementWidth)));
        Random random = new Random();
        for (int i = 0; i < fenceElementCount; i++) {
            parts.add(new FenceElement(positionX + (int)(1.5 * fenceElementWidth * i), positionY, height, availableColors[random.nextInt(0, 6)]));
        }

    }

    @Override
    public void drawSelf(Graphics2D g2d, int animationNumber) {
        g2d.setColor(Color.lightGray);
        g2d.fillRect(positionX, positionY + size / 3, width, size / 6);
        g2d.fillRect(positionX, positionY + size * 2 / 3 , width, size / 6);
        super.drawSelf(g2d, animationNumber);
    }
}

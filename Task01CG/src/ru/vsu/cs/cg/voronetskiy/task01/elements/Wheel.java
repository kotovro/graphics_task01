package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;
import java.util.Random;

public class Wheel extends BaseElement {
    private int thickness;
    private Color[] availableColors = {
            new Color(128, 0, 0),
            new Color(0, 0, 255),
            new Color(74, 68, 193),
            new Color(114, 136, 141),
            new Color(172, 0, 255),
            new Color(52, 114, 107),
    };

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public Wheel(int x, int y, int size, int caretSize, int thickness, int animationDelay, BaseElement parent) {
        this.positionX = x;
        this.positionY = y;
        this.size = size;
        this.parent = parent;
        this.thickness = thickness;
        this.animationDelay = animationDelay;
        for (int i = 0; i < 6; i++) {
            this.parts.add(new Spica(positionX + size / 2, positionY + size / 2, Math.PI / 3 * i, animationDelay,this));
        }
        Random random = new Random();
        for (int i = 0; i < 12; i++) {
            int color1 = random.nextInt(0, 6);
            int color2 = random.nextInt(0, 6);
            this.parts.add(new Caret(positionX + size / 2, positionY + size / 2, caretSize, Math.PI / 6 * i,
                    availableColors[color1], availableColors[color2], animationDelay, this));
        }
    }

    @Override
    public void drawSelf(Graphics2D g2d, int frameNumber) {
        getScale();
        g2d.setColor(Color.black);
        int width = (int)(scaleX * size);
        int height = (int)(scaleY * size);
        int scaledX = (int) (positionX * scaleX);
        int scaledY = (int) (positionY * scaleY);
        g2d.setColor(Color.gray);
        Stroke oldStroke = g2d.getStroke();
        g2d.setStroke(new BasicStroke(thickness));
        g2d.drawOval(scaledX, scaledY, width, height);
        super.drawSelf(g2d, frameNumber);
        g2d.setStroke(oldStroke);

    }
}

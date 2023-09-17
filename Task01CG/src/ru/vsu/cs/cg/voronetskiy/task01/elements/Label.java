package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Label extends BaseElement {
    private String text = new String();
    public Label(int x, int y, int size, String text) {
        this.positionY = y;
        this.positionX = x;
        this.size = size;
        this.text = text;
    }

    @Override
    public void drawSelf(Graphics2D g2d, int frameNumber) {
        g2d.setColor(Color.white);
        int height = (int)(size * 0.4);
        g2d.drawRoundRect(positionX, positionY, size, height, 10, 20);
        g2d.setColor(Color.black);
        g2d.setFont(new Font("Times", Font.BOLD, 12));
        FontMetrics fm = g2d.getFontMetrics();
        Rectangle2D r = fm.getStringBounds(text, g2d);
        g2d.drawString(text, positionX + (int)(size / 2 - r.getWidth() / 2), positionY + (int)(height / 2 - r.getHeight() / 2 + fm.getAscent()));
    }
}

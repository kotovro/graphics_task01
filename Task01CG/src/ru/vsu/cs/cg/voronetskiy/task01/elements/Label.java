package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Label extends BaseElement {
    private String text = new String();
    public Label(int x, int y, int size, String text, BaseElement parent) {
        this.positionY = y;
        this.positionX = x;
        this.size = size;
        this.text = text;
        this.parent = parent;
    }

    @Override
    public void drawSelf(Graphics2D g2d, int frameNumber) {
        getScale();
        int scaledSize = (int)(size * scaleX);
        int scaledX = (int)(positionX * scaleX);
        int scaledY = (int)(positionY * scaleY);
        g2d.setColor(Color.white);
        int height = (int)(size * 0.4 * scaleY);
        g2d.drawRoundRect(scaledX, scaledY, scaledSize, height, 10, 20);
        g2d.setColor(Color.black);
        g2d.setFont(new Font("Times", Font.BOLD, 12));
        FontMetrics fm = g2d.getFontMetrics();
        Rectangle2D r = fm.getStringBounds(text, g2d);
        double textWidth = r.getWidth();
        double fontScale = scaledSize * 0.9 / textWidth;
        int fontSize = (int) (12 * fontScale);
        g2d.setFont(new Font("Times", Font.BOLD, fontSize));
        fm = g2d.getFontMetrics();
        r = fm.getStringBounds(text, g2d);
        g2d.drawString(text, scaledX + (int)(scaledSize / 2 - r.getWidth() / 2), scaledY + (int)(height / 2 - r.getHeight() / 2 + fm.getAscent()));
    }
}

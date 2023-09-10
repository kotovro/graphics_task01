package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class Label extends BaseElement {
    private String text = new String();
    public Label(int x, int y, int size, String text) {
        this.positionY = y;
        this.positionX = x;
        this.size = size;
        this.text = text;
    }

    @Override
    public void drawSelf(Graphics2D g2d) {
        g2d.setColor(Color.white);
        g2d.drawRoundRect(positionX, positionY, size, (int)(size * 0.4), 10, 20);
        g2d.setColor(Color.black);
        g2d.setFont(new Font("Times", Font.PLAIN, 12));
        g2d.drawString(text, positionX, positionY);
    }
}

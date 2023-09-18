package ru.vsu.cs.cg.voronetskiy.task01;

import ru.vsu.cs.cg.voronetskiy.task01.elements.Picture;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel extends JPanel {

    private Graphics2D g2d;
    private int animationFrameNumber = 0;
    private int width = 800;
    private int height = 600;

    private Picture picture  = new Picture(0, 0, width , height);
    public DrawPanel() {
    }
    public void animate() {

    }
    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        picture.setScaleX((double)this.getWidth() / width);
        picture.setScaleY((double)this.getHeight() / height);

        picture.drawSelf(g, animationFrameNumber);
        animationFrameNumber++;
    }


}

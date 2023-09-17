package ru.vsu.cs.cg.voronetskiy.task01;

import ru.vsu.cs.cg.voronetskiy.task01.elements.Picture;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private Picture picture  = new Picture(0, 0, 800 , 600);
    public DrawPanel() {
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        picture.drawSelf(g);
    }

}

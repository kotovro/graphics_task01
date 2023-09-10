package ru.vsu.cs.cg.voronetskiy.task01;

import ru.vsu.cs.cg.voronetskiy.task01.elements.OtherTree;
import ru.vsu.cs.cg.voronetskiy.task01.elements.Picture;
import ru.vsu.cs.cg.voronetskiy.task01.elements.Swing;
import ru.vsu.cs.cg.voronetskiy.task01.elements.Tree;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

public class DrawPanel extends JPanel {
    public DrawPanel() {
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

//        g.setColor(new Color(100, 255, 10));
//        g.drawLine(10, 10, 200, 100);
//        g.setColor(Color.ORANGE);
//        g.fillRect(50, 10, 30, 100);
//        g.drawRect(50, 10, 30, 100);
//        g.drawOval(50, 10, 30, 100);
//        g.drawArc(50, 10, 100, 100, 30, 90);
//        // in case with drawing a string, we pass the x and y of the right bottom angle
//        //of the frame where the text is situated
//        g.setColor(Color.GREEN);
//        g.drawString("Some text", 50, 10);
//        GeneralPath path = new GeneralPath();
//        path.moveTo(10, 10);
//        path.lineTo(10, 100);
//        path.curveTo(10, 10, 25, 30, 100, 100);
//        g.setColor(Color.BLUE);
//        g.draw(path);
//        for (int i = 0; i < 10; i++) {
//            g.setStroke(new BasicStroke(i * 0.5f));
//            g.drawLine(100, i*20+30, 200, i * 20 + 35);
//        }
        //g.scale(2, 1);
//        g.translate(getWidth(), 0 );
//        String[] fNames = new String[] {"Times", "Arial", "Consolas"};
//        for (int j = 0; j < fNames.length; j++) {
//            for (int i = 0; i < 10; i++) {
//                int x = 10 + 80 * j;
//                int y = 50 + i * 40;
//                g.rotate(Math.PI/6, x, y);
//                g.setFont(new Font(fNames[j], Font.PLAIN, 10 + i * 2));
//                g.drawString("Hello", 10 + 80 * j, 50 + i * 40);
//                g.rotate(-Math.PI/6, x, y);
//            }
//        }
        //LinkedList<Elemnets> elms = ;
//        for ()
//        Tree tree = new Tree("pine", 3);
//        tree.drawTree((Graphics2D) gr);

        //g.drawLine(10, 20, 30, 50);
        //Swing swing = new Swing(100, 100, 70, 100);
        //swing.drawSwing(g);

        //OtherTree tree = new OtherTree(100, 200, 300, 2);
        Picture picture  = new Picture();
        picture.drawSelf(g);
        //tree.drawSelf(g);

//        g.setColor(Color.black);
//        for (int i = 0; i < 6; i++) {
//            g.drawRect(100 + i * 120, 200, 100, 300);
//            g.drawRect(100 + i * 120, 200, 50, 300);
//        }
    }

}

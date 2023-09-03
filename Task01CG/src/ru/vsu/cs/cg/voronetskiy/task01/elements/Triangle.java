package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class Triangle {
    public static void drawTriangle(Graphics2D gr, int[] arrOfX, int[] arrOfY) {
        gr.drawPolygon(arrOfX, arrOfY, 3);
    }
}

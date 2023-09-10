package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.awt.*;

public class Swing {

    private int xLeftUpCoord;
    private int yLeftUpCoord;
    private int height;
    private int width;
    //TODO come up with a batter name for the constructor or whatever is this method
    public Swing(int xLeftUpCoord, int yLeftUpCoord, int height, int width) {
        this.xLeftUpCoord = xLeftUpCoord;
        this.yLeftUpCoord = yLeftUpCoord;
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getXLeftUpCoord() {
        return xLeftUpCoord;
    }

    public void setXLeftUpCoord(int xLeftUpCoord) {
        this.xLeftUpCoord = xLeftUpCoord;
    }

    public int getYLeftUpCoord() {
        return yLeftUpCoord;
    }

    public void setYLeftUpCoord(int yLeftUpCoord) {
        this.yLeftUpCoord = yLeftUpCoord;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
//    private int[] getDimensionsForPendulum() {
//        int[] dimensions = new int[4];
//        dimensions[0] = this.xLeftUpCoord + (int)(width * 0.6);;
//        dimensions[1] = this.yLeftUpCoord;
//        dimensions[2] = (int)(width * 0.6);
//        dimensions[3] = (int)(height * 0.6);
//        return dimensions;
//    }
    public void drawSwing(Graphics2D g) {
        drawPoles(g, this.xLeftUpCoord, this.yLeftUpCoord, this.width, this.height);
        //int[] dimensionsPendulum = getDimensionsForPendulum();
//        drawPoles(g, dimensionsPendulum[0] + (int)(dimensionsPendulum[2] * 0.3),
//                dimensionsPendulum[1] + (int)(dimensionsPendulum[3] * 0.7),
//                dimensionsPendulum[2], dimensionsPendulum[3]);
        drawPoles(g, this.xLeftUpCoord, this.yLeftUpCoord, this.width / 4, (int)(0.3 * this.height * 2));

    }
    private void drawPoles(Graphics2D g, int xCoord, int yCoord, int width, int height) {
        g.drawLine(xCoord + width / 2, yCoord + height, xCoord, yCoord);
        g.drawLine(xCoord - width / 2, yCoord + height, xCoord, yCoord);


//one of the way to depict poles is rounded rectangle
//    g.rotate(Math.PI/3, 10, 20);
//    g.drawRoundRect(10, 20, 20, 50, 15, 20);
//    g.rotate(-Math.PI/3, 10, 20);
    }
}

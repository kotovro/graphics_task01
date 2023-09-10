package ru.vsu.cs.cg.voronetskiy.task01.elements;

import org.w3c.dom.Text;

import java.awt.*;

public class House extends BaseElement {
    public House (int x, int y, int width, int height) {
        this.positionX = x;
        this.positionY = y;
        int houseHeight = (int)(height / 1.5);
        int wallHeight = houseHeight / 2;
        int houseWidth = houseHeight;
        int windowWidth = (int)(wallHeight * 0.6);
        this.parts.add(new Roof(this.positionX + width * 4 / 5,  this.positionY + height * 1 / 3, houseHeight / 6));
        this.parts.add(new Wall(this.positionX + width * 4 / 5, this.positionY +  height * 1 / 3, wallHeight));
        this.parts.add(new Window(positionX + width * 4 / 5 + wallHeight / 2 - windowWidth / 2, this.positionY +  height * 1 / 3 + wallHeight / 2 - windowWidth / 3 * 2,
                windowWidth));
        this.parts.add(new Label(positionX + width * 4 / 5 + wallHeight / 2 - windowWidth / 2,
                this.positionY +  height * 1 / 3 + wallHeight / 2 + windowWidth / 2, windowWidth,
                "Аттракцион"));
    }

}

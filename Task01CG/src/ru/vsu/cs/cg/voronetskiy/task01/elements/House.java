package ru.vsu.cs.cg.voronetskiy.task01.elements;

public class House extends BaseElement {
    public House (int x, int y, int width, int height, BaseElement parent) {
        this.positionX = x;
        this.positionY = y;
        this.size = height;
        this.parent = parent;
        int houseHeight = size * 4 / 9;
        int roofHeight = houseHeight / 5;
        int wallHeight = houseHeight - roofHeight;
        this.parts.add(new Roof(this.positionX + width * 4 / 5,  this.positionY + height - houseHeight, roofHeight, this));
        this.parts.add(new Wall(this.positionX + width * 4 / 5, this.positionY +  height - houseHeight + roofHeight, wallHeight, this));
    }

}

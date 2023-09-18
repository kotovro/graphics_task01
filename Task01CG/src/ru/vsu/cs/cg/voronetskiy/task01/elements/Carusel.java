package ru.vsu.cs.cg.voronetskiy.task01.elements;

public class Carusel extends BaseElement {
    public Carusel(int x, int y, int size, BaseElement parent) {
        this.positionX = x;
        this.positionY = y;
        this.size = size;
        this.parent = parent;
        this.parts.add(new Support(positionX + size / 3, positionY + size / 3, size * 2 / 3, this));
    }


}

package ru.vsu.cs.cg.voronetskiy.task01.elements;

public class Carusel extends BaseElement {
    public Carusel(int x, int y, int size, int animationDelay, BaseElement parent) {
        this.positionX = x;
        this.positionY = y;
        this.size = size;
        this.parent = parent;
        this.animationDelay = animationDelay;
        int caretSize = size / 6;
        int wheelSize = size - caretSize;
        int supportSize = size - wheelSize / 2;
        int thickness = size / 40;
        this.parts.add(new Support(positionX + size / 2 - supportSize / 2, positionY + wheelSize / 2, supportSize, thickness, this));
        this.parts.add(new Wheel(positionX + caretSize / 2, positionY, wheelSize, caretSize, thickness, animationDelay, this));

    }


}

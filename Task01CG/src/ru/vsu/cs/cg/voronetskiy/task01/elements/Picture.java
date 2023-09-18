package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.util.Random;

public class Picture extends BaseElement {
    public Picture(int x, int y, int width, int height) {
        this.parts.add(new Sky(x, y, width, height / 3, this));
        this.parts.add(new Ground(x, y + height / 3, width, height * 2 / 3, this));
        this.scaleX = 1;
        this.scaleY = 1;

    }

}

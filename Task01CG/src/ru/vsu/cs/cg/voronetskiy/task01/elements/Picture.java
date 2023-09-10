package ru.vsu.cs.cg.voronetskiy.task01.elements;

import java.util.Random;

public class Picture extends BaseElement {
    public Picture(int x, int y, int height, int width) {
        this.parts.add(new Forest(x, y, height, width));
        }
    }

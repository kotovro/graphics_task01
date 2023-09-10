package ru.vsu.cs.cg.voronetskiy.task01.elements;

public class Picture extends BaseElement {
    public Picture() {
        for (int i = 0; i < 6; i++) {
            this.parts.add(new OtherTree(100 + i * 120, 200, 300, i + 1));
        }
    }
}

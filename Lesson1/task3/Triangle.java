package javaRepeat.Lesson1.task3;

public class Triangle implements Figure {
    private final int base;
    private final int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public int calculateFigureArea() {
        return (base * height)/2;
    }
}

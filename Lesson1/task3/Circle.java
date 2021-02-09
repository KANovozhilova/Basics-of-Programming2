package javaRepeat.Lesson1.task3;

public class Circle implements Figure {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int calculateFigureArea() {
        return (int) (radius * Math.PI);
    }
}

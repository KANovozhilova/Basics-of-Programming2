package javaRepeat.Lesson1.task3;

public class Square implements Figure {
    private final int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int calculateFigureArea() {
        return (int) Math.pow(sideLength, 2);
    }
}
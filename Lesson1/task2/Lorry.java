package javaRepeat.Lesson1.task2;

// добавила implements для интерфейсов
public class Lorry extends Car implements Moveable, Stopable {

    // не было реализации метода open
    @Override
    public void open() {
        System.out.println("Car is open");
    }

    @Override
    public void move() {
        super.start();
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {
        System.out.println("Car is stop");
    }
}

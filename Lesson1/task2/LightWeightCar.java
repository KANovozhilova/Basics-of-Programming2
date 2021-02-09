package javaRepeat.Lesson1.task2;

// добавила Stopable
public class LightWeightCar extends Car implements Moveable, Stopable {
    @Override
    public void open() {
        System.out.println("Car is open");
    }

    @Override
    public void move() {
        super.start();
        System.out.println("Car is moving");
    }

    // добавила метод stop
    @Override
    public void stop() {
        System.out.println("Car is stop");
    }
}

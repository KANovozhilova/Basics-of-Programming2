package javaRepeat.Lesson1.task2;

// добавила public
public abstract class Car {
    private Engine engine; // заменила public на private
    private String color;
    private String name;


    // заменила на public
    public void start() {
        System.out.println("Car starting");
    }

    public abstract void open(); // добавила public для метода

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

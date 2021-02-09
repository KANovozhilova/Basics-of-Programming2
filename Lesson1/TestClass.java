package javaRepeat.Lesson1;

import javaRepeat.Lesson1.task1.Person;
import javaRepeat.Lesson1.task1.PersonBuilder;
import javaRepeat.Lesson1.task3.Circle;
import javaRepeat.Lesson1.task3.Figure;
import javaRepeat.Lesson1.task3.Square;
import javaRepeat.Lesson1.task3.Triangle;

public class TestClass {
    public static void main(String[] args) {
        // Task 1
        Person person = new PersonBuilder()
                .addFirstName("John")
                .addMiddleName("Jimmy")
                .addLastName("Johnson")
                .addCountry("USA")
                .addAddress(".........")
                .addPhone("111-111-111")
                .addAge(27)
                .addGender("male")
                .build();
        System.out.println(person.toString());

        // Task 2
    // для легковых и грузовых машин можно создать билдер или фабрику;
    // также нужно реализовать класс Engine.

        // Task 3
        Figure circle = new Circle(6);
        Figure square = new Square(2);
        Figure triangle = new Triangle(3, 5);
        System.out.println(circle.calculateFigureArea());
        System.out.println(square.calculateFigureArea());
        System.out.println(triangle.calculateFigureArea());
    }
}

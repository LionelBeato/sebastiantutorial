package works.lionel;

import works.lionel.model.Car;

// what is a class?
// a class is a blueprint for your objects
// ultimately, a class is a collection of data
// this works.lionel.Main class is our entrypoint
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        // i want to make an instance of my car
        String myString = "This is my string";
        Car myCar = new Car(1L, "Chevy", "Camaro");

        System.out.println(myCar);

    }
}

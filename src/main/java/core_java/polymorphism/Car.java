package core_java.polymorphism;

public class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("The car is moving");
    }

    public void parentMove() {
        super.move();
    }

    static void main(String[] args) {
        Vehicle car = new Car();
        car.move();
        new Car().parentMove();
    }
}

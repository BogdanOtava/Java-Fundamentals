package OOP.AbstractClasses;

/*
'Abstract Classes' in Java are declared with the 'abstract' keyword. It can have abstract and non-abstract methods.

These classes cannot be instantiated, they need to be extented and their methods implemented.

'Abstract Methods' do not have a body in the abstract class.
*/

abstract class Vehicle {

    private String engine;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public abstract void drive();
}

class Car extends Vehicle {

    @Override
    public void drive() {
    }
}

class Truck extends Vehicle {

    @Override
    public void drive() {
    }

    public static void main(String[] args) {

        Car firstCar = new Car();
        firstCar.setEngine("Electric");

        Truck firstTruck = new Truck();
        firstTruck.setEngine("Thermal");
    }
}

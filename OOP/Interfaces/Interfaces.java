package OOP.Interfaces;

/*
"Interfaces" are completely abstract classes that are used to group related methods with empty bodies.
Inheriting an interface is done with the keyword 'implements', instead of extends.

Interfaces cannot be used to create objects, so it will not have constructor as well.
When implemented, all its methods must be overridden.

Interface methods are by default 'abstract' and 'public'.
Interface attributes are by default 'public', 'static' and 'final'.
*/

interface Car {

    // Interface methods that don't have bodies:
    public void turnEngineOn();

    public void turnEngineOff();
}

// Implementing the 'Car' interface:
class Ford implements Car {
    public void turnEngineOn() {
        System.out.println("Engine ON!");
    }

    public void turnEngineOff() {
        System.out.println("Engine OFF!");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Ford newCar = new Ford();
        newCar.turnEngineOn();
        newCar.turnEngineOff();
    }
}

// Everything in Java is associated with classes and objects along with its attributes and methods.
// The 'Class' is the blueprint of the 'object'.
// 'Attributes' are just variables within a 'class'.
// 'Methods' are declared within a 'class' and they are used to perform certain actions.

class Methods {
    String animal;
    int value;
    int month;

    void run() {
        System.out.println("Running...");
        System.out.println("My " + animal + " is " + value + " years old.");
    }

    int calculateMonthsToBirthday() {
        int monthsLeft = 12 - month;
        return monthsLeft;
    }
}

public class Objects {
    public static void main(String[] args) {

        Methods name = new Methods();
        name.animal = "Cat";
        name.value = 9;
        name.month = 8;

        name.run();

        int months = name.calculateMonthsToBirthday();
        System.out.println("Months until birthday: " + months);
    }
}

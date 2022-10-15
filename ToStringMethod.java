// The 'toString()' method is used to get a String object representing the value of the Number oject.

class Employee {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return ("ID: " + id + " - " + "Name: " + name);
    }
}

public class ToStringMethod {
    public static void main(String[] args) {

        Employee employeeOne = new Employee(101, "Harper Smith");
        Employee employeeTwo = new Employee(102, "Evelyn Miller");

        System.out.println(employeeOne);
        System.out.println(employeeTwo);
    }
}

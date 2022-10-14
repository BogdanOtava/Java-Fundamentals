// 'Final' keyword is a non-access modifier applicable only to a variable, a method, or a class. Once declared, it cannot be overwritten.
// 'Static' keyword is mainly used for memory management. It's only applicable to methods and variables.

class Student {

    public static final int CONSTANT = 8;

    public String name;
    public static String studentClass;
    public static int count = 0;

    public Student() {
        count++;
    }

    public void studentName() {
        System.out.println(name);
    }

    public static void classInfo() {
        System.out.println("Java");
    }
}

public class StaticAndFinal {
    public static void main(String[] args) {

        Student.studentClass = "Web Development Fundamentals";
        System.out.println(Student.studentClass);

        Student.classInfo();

        System.out.println("Before: " + Student.count);

        Student studentOne = new Student();
        Student studentTwo = new Student();

        System.out.println("After: " + Student.count);

        studentOne.name = "Steven";
        studentTwo.name = "Daniel";

        studentOne.studentName();
        studentTwo.studentName();
    }
}

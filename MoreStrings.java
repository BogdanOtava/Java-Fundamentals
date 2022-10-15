// StringBuilder is used to create a mutable succession of characters.

public class MoreStrings {
    public static void main(String[] args) {

        String name = "Tom";

        StringBuilder exampleOne = new StringBuilder("Hello! ");
        exampleOne.append("My name ").append("is ").append(name).append(".");

        System.out.println(exampleOne);

        StringBuilder exampleTwo = new StringBuilder();

        exampleTwo.append("Hello! ");
        exampleTwo.append("My name is ");
        exampleTwo.append("Mike.");

        String text = exampleTwo.toString();
        System.out.println(text);
    }
}

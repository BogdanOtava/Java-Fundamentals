/*
Question: Build a method that takes a 'String' as parameter and returns it reversed.
*/

public class ReverseString {

    static void reversedString(String aString) {
        String reversedString = "";

        for (int i = 0; i < aString.length(); i++) {
            reversedString = aString.charAt(i) + reversedString;
        }
        System.out.println(reversedString);
    }

    public static void main(String[] args) {

        reversedString("Hello World");
    }
}

/*
Question: Count the number of words in a random string.
*/

public class CoundWordsInString {
    public static void main(String[] args) {

        String aString = "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.";
        int countWords = aString.split(" ").length;

        System.out.println(countWords);
    }
}

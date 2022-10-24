package HashMaps;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {

        // Create a new HashMap:
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        // Add elements to HashMap:
        examScores.put("English", 95);
        examScores.put("Maths", 55);
        examScores.put("History", 80);
        examScores.put("Spanish", 60);
        examScores.put("Computer Science", 75);

        // Add element if it isn't already:
        examScores.putIfAbsent("English", 100);

        // Change the value of a key:
        examScores.replace("Maths", 55, 60);

        // Print out the HashMap:
        System.out.println(examScores.toString());

        // Print out the value of a key:
        System.out.println(examScores.get("English"));

        // See total number of elements:
        System.out.println(examScores.size());

        // Remove element:
        examScores.remove("Spanish");
        System.out.println(examScores.toString());

        // Loop through a HashMap:
        examScores.forEach((subject, scores) -> {
            System.out.println(subject + " - " + scores);
        });

        // Clear HashMap:
        examScores.clear();
        System.out.println(examScores.toString());
    }
}

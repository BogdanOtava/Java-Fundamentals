package LinkedHashMaps;

import java.util.LinkedHashMap;

public class LinkedHashMaps {
    public static void main(String[] args) {

        // Create a new LinkedHashMap:
        LinkedHashMap<String, Integer> examScores = new LinkedHashMap<String, Integer>();

        // Add elements to LinkedHashMap:
        examScores.put("English", 90);
        examScores.put("Maths", 60);
        examScores.put("Computer Science", 75);

        // Print out all the elements:
        System.out.println(examScores);

        // Print a specific element:
        System.out.println(examScores.get("English"));

        // Check size:
        System.out.println(examScores.size());

        // Check if empty:
        System.out.println(examScores.isEmpty());

        // Check for a key:
        System.out.println(examScores.containsKey("Maths"));

        // Check for value:
        System.out.println(examScores.containsValue(90));

        // Delete element:
        examScores.remove("Maths");
        System.out.println(examScores);
    }
}

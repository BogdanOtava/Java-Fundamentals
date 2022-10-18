/*
Question: Build two methods: one that converts minutes to seconds, and the other one hours to seconds.
*/

public class TimeConverter {

    static int convertMinutesToSeconds(int minutes) {
        return minutes * 60;
    }

    static int convertHoursToSeconds(int hours) {
        return hours * 3600;
    }

    public static void main(String[] args) {

        int aNumber = 5;

        System.out.println(convertMinutesToSeconds(aNumber));
        System.out.println(convertHoursToSeconds(aNumber));
    }
}

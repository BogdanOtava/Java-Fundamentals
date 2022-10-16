package Variables;

/*
StringBuilder class is used to create mutable strings.
*/

public class StringsBuilder {
    public static void main(String[] args) {

        String language = "Java";
        int year = 1995;
        String company = "Oracle";
        byte devices = 3;

        StringBuilder javaLanguage = new StringBuilder();
        javaLanguage.append(language + " is one one of the most popular programming languages.");
        javaLanguage.append(" It was created in " + year + " and it it owned by " + company + ".");
        javaLanguage.append(" More than " + devices + " billion devices run Java.");

        System.out.println(javaLanguage);
    }
}

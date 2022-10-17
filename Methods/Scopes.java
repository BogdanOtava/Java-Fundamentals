package Methods;

/*
'Scope' means that variables are accessible only inside the code block they are created.

Inside a method, a variable can be used anywhere after it was declared, but not after the curly braces '{}' end.
*/

public class Scopes {
    public static void main(String[] args) {

        // 'sayHello' cannot be used above code line 13.
        String sayHello = "Hello World!";

        System.out.println(sayHello);
    }
}

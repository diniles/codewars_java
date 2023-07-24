package greetMe;

public class GreetMe {
    public static String greet(String name) {
        String capitalized = name.substring(0, 1).toUpperCase() + name.substring(1);
        return "Hello " + capitalized + "!";
    }
}

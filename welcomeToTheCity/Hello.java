package welcomeToTheCity;

public class Hello {
    public String sayHello(String[] name, String city, String state) {
        //code here
        return String.format("Hello, %s %s! Welcome to %s, %s!", name[0], name[1], city, state);
    }
}

package welcomeToTheCity;

public class Hello {
    public String sayHello(String[] name, String city, String state) {
        //code here
        StringBuilder welcome = new StringBuilder("Hello, ");
        for (String s : name) {
            welcome.append(s).append(" ");
        }
        welcome.deleteCharAt(welcome.length() - 1).append("! Welcome to ").append(city).append(", ").append(state).append("!");
        return welcome.toString();
    }
}

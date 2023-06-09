/*
https://www.codewars.com/kata/56b1f01c247c01db92000076/train/java

Given a string, you have to return a string in which each character (case-sensitive) is repeated once.

Examples (Input -> Output):
* "String"      -> "SSttrriinngg"
* "Hello World" -> "HHeelllloo  WWoorrlldd"
* "1234!_ "     -> "11223344!!__  "
*/

public class DoubleChar {
    public static String doubleChar(String s) {
/*
Best practices
return s.replaceAll(".", "$0$0");

*/
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            string.append(s.charAt(i));
            string.append(s.charAt(i));

/*
Best practices
            string.append(s.charAt(i)).append(s.charAt(i));
*/

        }
        return string.toString();
    }

    public static void main(String[] args) {
        System.out.println(doubleChar("String"));
        System.out.println(doubleChar("Hello World"));
        System.out.println(doubleChar("1234!_ "));
    }
}

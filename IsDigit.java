/*
https://www.codewars.com/kata/57126304cdbf63c6770012bd/train/java
Given a string s, write a method (function) that will return true if its a valid single integer or floating number or
false if its not.

Valid examples, should return true:

isDigit("3")
isDigit("  3  ")
isDigit("-3.23")
should return false:

isDigit("3-4")
isDigit("  3   5")
isDigit("3 5")
isDigit("zero")
*/

public class IsDigit {
    public static boolean isDigit(String s) {
        //return true or false
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isDigit("3"));
        System.out.println(isDigit("  3  "));
        System.out.println(isDigit("-3.23"));
        System.out.println(isDigit("3-4"));
        System.out.println(isDigit("  3   5"));
        System.out.println(isDigit("3 5"));
        System.out.println(isDigit("zero"));
    }
}

/*
https://www.codewars.com/kata/58b8c94b7df3f116eb00005b/train/java
Task
Given a string str, reverse it and omit all non-alphabetic characters.

Example
For str = "krishan", the output should be "nahsirk".

For str = "ultr53o?n", the output should be "nortlu".

Input/Output
[input] string str
A string consists of lowercase latin letters, digits and symbols.

[output] a string
*/

public class ReverseLetter {
    public static String reverseLetter(final String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.isLetter(str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseLetter("ultr53o?n"));
    }
}


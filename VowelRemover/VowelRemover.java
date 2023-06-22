/*
https://www.codewars.com/kata/5547929140907378f9000039/train/java
Create a function called shortcut to remove the lowercase vowels (a, e, i, o, u ) in a given string.

Examples
"hello"     -->  "hll"
"codewars"  -->  "cdwrs"
"goodbye"   -->  "gdby"
"HELLO"     -->  "HELLO"
*/

package VowelRemover;

public class VowelRemover {
    public static String shortcut(String input) {
        return input.replaceAll("[aeiou]", "");
    }
}

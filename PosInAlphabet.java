/*
https://www.codewars.com/kata/5808e2006b65bff35500008f/train/java
When provided with a letter, return its position in the alphabet.

Input :: "a"

Ouput :: "Position of alphabet: 1"
*/

public class PosInAlphabet {
//    public static String position(char alphabet) {
//        int asciiCode = (int) alphabet - 96;
//        return "Position of alphabet: " + Integer.toString(asciiCode);
//    }

//    best practice

    public static String position(char alphabet) {
        return "Position of alphabet: " + ((int) alphabet - 96);
    }

    public static void main(String[] args) {
        System.out.println(position('a'));
    }
}

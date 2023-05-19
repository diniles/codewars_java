/*
https://www.codewars.com/kata/57a0885cbb9944e24c00008e/train/java
Write function RemoveExclamationMarks which removes all exclamation marks from a given string.
*/

package removeExclamationMarks;

public class RemoveExclamationMarks {
    static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }
}

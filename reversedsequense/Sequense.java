/*
https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java
Build a function that returns an array of integers from n to 1 where n>0.

Example : n=5 --> [5,4,3,2,1]
*/

package reversedsequense;

public class Sequense {
    public static int[] reverse(int n) {
        int[] array = new int[n];
        for (int i = n; i > 0; i--) {
            array[n - i] = i;
        }
        return array;
    }
}

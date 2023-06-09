/*
https://www.codewars.com/kata/5949481f86420f59480000e7/train/java
Given a list of integers, determine whether the sum of its elements is odd or even.

Give your answer as a string matching "odd" or "even".

If the input array is empty consider it as: [0] (array with a zero).

Examples:
Input: [0]
Output: "even"

Input: [0, 1, 4]
Output: "odd"

Input: [0, -1, -5]
Output: "even"
*/

package OddOrEven;

import static java.util.Arrays.stream;

public class OddOrEven {
    public static String oddOrEven(int[] array) {
//        int sum = 0;
//        for (int el : array) {
//            sum += el;
//        }
//        return sum % 2 == 0 ? "even" : "odd";
//        best practice
        return stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}

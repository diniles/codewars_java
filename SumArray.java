/*
https://www.codewars.com/kata/53dc54212259ed3d4f00071c/train/java
Write a function that takes an array of numbers and returns the sum of the numbers. The numbers can be negative or
non-integer. If the array does not contain any numbers then you should return 0.

Examples
Input: [1, 5.2, 4, 0, -1]
Output: 9.2

Input: []
Output: 0

Input: [-2.398]
Output: -2.398

Assumptions
You can assume that you are only given numbers.
You cannot assume the size of the array.
You can assume that you do get an array and if the array is empty, return 0.
Tests expect accuracy of 1e-4.
*/

public class SumArray {

    public static double sum(double[] numbers) {
        if (numbers.length == 0) return 0.0;
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

/* Best practices
import java.util.Arrays;

    public class SumArray {

        public static double sum(double[] numbers) {
            return Arrays.stream(numbers).sum();
        }
}
*/


    public static void main(String[] args) {
        double[] a1 = {1, 5.2, 4, 0, -1};
        double[] a2 = {};
        double[] a3 = {-2.398};
        System.out.println(sum(a1));
        System.out.println(sum(a2));
        System.out.println(sum(a3));
    }
}
/*
https://www.codewars.com/kata/556196a6091a7e7f58000018/train/java
Given a sequence of numbers, find the largest pair sum in the sequence.

For example

[10, 14, 2, 23, 19] -->  42 (= 23 + 19)
[99, 2, 2, 23, 19]  --> 122 (= 99 + 23)
Input sequence contains minimum two elements and every element is an integer.


*/

package largestPair;

import java.util.Arrays;

public class LargestPairSum {
    public static int largestPairSum(int[] numbers) {
        // your code here
        Arrays.sort(numbers);
        int last = numbers.length - 1;
        return numbers[last] + numbers[last - 1];
    }
}

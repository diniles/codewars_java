/*
https://www.codewars.com/kata/55d277882e139d0b6000005d/train/java
Find Mean
Find the mean (average) of a list of numbers in an array.

Information
To find the mean (average) of a set of numbers add all of the numbers together and divide by the number of values in the
list.

For an example list of 1, 3, 5, 7

1. Add all of the numbers

1+3+5+7 = 16
2. Divide by the number of values in the list. In this example there are 4 numbers in the list.

16/4 = 4
3. The mean (or average) of this list is 4
*/

//for best practice

import java.util.stream.IntStream;

public class FindAverage {
//    public static int findAverage(int[] nums) {
//        int sum = 0;
//        for (int num : nums) {
//            sum += num;
//        }
//        return sum / nums.length;
//    }

    //best practice
    public static int findAverage(int[] nums) {
        return IntStream.of(nums).sum() / nums.length;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        System.out.println(findAverage(arr));
    }
}

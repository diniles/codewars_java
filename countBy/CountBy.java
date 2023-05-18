/*
https://www.codewars.com/kata/5513795bd3fafb56c200049e/train/java
Create a function with two arguments that will return an array of the first n multiples of x.

Assume both the given number and the number of times to count will be positive numbers greater than 0.

Return the results as an array or list ( depending on language ).

Examples
countBy(1,10)  // should return  {1,2,3,4,5,6,7,8,9,10}
countBy(2,5)  // should return {2,4,6,8,10}
*/

package countBy;
// for best practice 1

//import java.util.stream.IntStream;

public class CountBy {
    public static int[] countBy(int x, int n) {
//        int[] array = new int[n];
//        int counter = x;
//        for (int i = 0; i < n; i++) {
//            array[i] = x;
//            x += counter;
//        }
//        return array;

//        best practice 1
//        return IntStream.rangeClosed(1, n)
//                .map(i -> i * x)
//                .toArray();

//        best practice 2
        int[] el = new int[n];
        for (int i = 0; i < n; i++) el[i] = x * (i + 1);
        return el;
    }
}

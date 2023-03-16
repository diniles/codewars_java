/*
https://www.codewars.com/kata/57a083a57cb1f31db7000028/train/java
Complete the function that takes a non-negative integer n as input, and returns a list of all the powers of 2 with the
exponent ranging from 0 to n ( inclusive ).

Examples
n = 0  ==> [1]        # [2^0]
n = 1  ==> [1, 2]     # [2^0, 2^1]
n = 2  ==> [1, 2, 4]  # [2^0, 2^1, 2^2]
*/

import java.util.ArrayList;
import java.util.Arrays;

public class PowersOfTwo {
    public static long[] powersOfTwo(int n) {
        ArrayList<Long> powers = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            powers.add((long) Math.pow(2, i));
        }
        long[] result = new long[powers.size()];
        for (int i = 0; i < powers.size(); i++) {
            result[i]= powers.get(i);
        }
        return result;
    }

/*
best solutions
static long[] powersOfTwo(int n) {
    return rangeClosed(0, n).map(i -> (long) Math.pow(2, i)).toArray();
  }


long ret[] = new long[n + 1];
    for (int i = 0; i <= n; i++) ret[i] = 1L << i;
    return ret;
*/


    public static void main(String[] args) {
        System.out.println(Arrays.toString(powersOfTwo(0)));
        System.out.println(Arrays.toString(powersOfTwo(1)));
        System.out.println(Arrays.toString(powersOfTwo(4)));

    }
}
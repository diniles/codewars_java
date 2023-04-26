/*
https://www.codewars.com/kata/5a34b80155519e1a00000009/train/java
Return a new array consisting of elements which are multiple of their own index
in input array (length > 1).

Some cases:
[22, -6, 32, 82, 9, 25] =>  [-6, 32, 25]

[68, -1, 1, -7, 10, 10] => [-1, 10]

[-56,-85,72,-26,-14,76,-27,72,35,-21,-67,87,0,21,59,27,-92,68] => [-85, 72, 0, 68]
*/

import java.util.ArrayList;
import java.util.Arrays;
// for best practice
import java.util.stream.*;

public class MultipleOfIndex {
/*    public static int[] multipleOfIndex(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) list.add(array[i]);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
    */

//    best practice

    public static int[] multipleOfIndex(int[] a) {
        return IntStream.range(1, a.length).filter(i -> a[i] % i == 0).map(i -> a[i]).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(multipleOfIndex(new int[]{22, -6, 32, 82, 9, 25})));
        System.out.println(Arrays.toString(multipleOfIndex(new int[]{68, -1, 1, -7, 10, 10})));
        System.out.println(Arrays.toString(multipleOfIndex(new int[]{-56, -85, 72, -26, -14, 76, -27, 72, 35, -21, -67, 87, 0, 21, 59, 27, -92, 68})));
    }
}

/*
https://www.codewars.com/kata/5769b3802ae6f8e4890009d2/train/java
Take an array and remove every second element from the array. Always keep the first element and start removing with the
next element.

Example:
["Keep", "Remove", "Keep", "Remove", "Keep", ...] --> ["Keep", "Keep", "Keep", ...]

None of the arrays will be empty, so you don't have to worry about that!
*/

import java.util.Arrays;
import java.util.ArrayList;
//for best practice
import java.util.List;

public class RemoveEveryOther {
/*    public static Object[] removeEveryOther(Object[] arr) {
        ArrayList<Object> list = new ArrayList<>();
        for (int i = 0, j = 0; i < arr.length; i += 2, j++) {
            list.add(arr[i]);
        }
        Object[] result = new Object[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }*/

    //    best practice
    public static Object[] removeEveryOther(Object[] arr) {
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                list.add(arr[i]);
            }
        }
        return list.toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeEveryOther(new Object[]{"Hello", "Goodbye", "Hello Again"})));
        System.out.println(Arrays.toString(removeEveryOther(new Object[]{1, 2})));
        System.out.println(Arrays.toString(removeEveryOther(new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));
        System.out.println(Arrays.toString(removeEveryOther(new Object[]{"Goodbye"})));
    }
}

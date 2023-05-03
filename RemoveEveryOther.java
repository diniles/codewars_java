/*
https://www.codewars.com/kata/5769b3802ae6f8e4890009d2/train/java
Take an array and remove every second element from the array. Always keep the first element and start removing with the
next element.

Example:
["Keep", "Remove", "Keep", "Remove", "Keep", ...] --> ["Keep", "Keep", "Keep", ...]

None of the arrays will be empty, so you don't have to worry about that!
*/

public class RemoveEveryOther {
    public static Object[] removeEveryOther(Object[] arr) {
        // happy coding
        Object[] result = new Object[arr.length];
        for (int i = 1, j = 0; i < result.length; i += 2, j++) {
            result[j] = arr[i];
        }
        return result;
    }
}

/*
https://www.codewars.com/kata/59cfc000aeb2844d16000075/train/java
Given a string, capitalize the letters that occupy even indexes and odd indexes separately, and return as shown below.
Index 0 will be considered even.

For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.

The input will be a lowercase string with no spaces.
*/

import java.util.Arrays;

public class AltCapitalize {
    public static String[] capitalize(String s) {
        String[] arr = s.split("");
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i].toUpperCase();
            } else {
                arr[i] = arr[i].toLowerCase();
            }
            s1 += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i].toLowerCase();
            } else {
                arr[i] = arr[i].toUpperCase();
            }
            s2 += arr[i];
        }

        return new String[]{s1, s2};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(capitalize("abcdef")));
        System.out.println(Arrays.toString(capitalize("codewars")));
        System.out.println(Arrays.toString(capitalize("abracadabra")));
        System.out.println(Arrays.toString(capitalize("codewarriors")));
    }
}

/*
https://www.codewars.com/kata/546e2562b03326a88e000020/train/java
Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)

Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)

Note: The function accepts an integer and returns an integer.
*/

package SquareDigit;
//for best practice

import java.util.stream.Collectors;

public class SquareDigit {
    public int squareDigits(int n) {
//        String s = Integer.toString(n);
//        String[] input = s.split("");
//        String result = "";
//
//        for (int i = 0; i < input.length; i++) {
//            int tmp = Integer.parseInt(input[i]);
//            result += Integer.toString(tmp * tmp);
//        }
//        return Integer.parseInt(result);
//        best practice
        return Integer.parseInt(String.valueOf(n)
                .chars()
                .map(i -> Integer.parseInt(String.valueOf((char) i)))
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("")));
    }
}


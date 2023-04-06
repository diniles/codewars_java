/*
https://www.codewars.com/kata/5ce9c1000bab0b001134f5af/train/java
Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.

For example: month 2 (February), is part of the first quarter; month 6 (June), is part of the second quarter; and month
11 (November), is part of the fourth quarter.

Constraint:

1 <= month <= 12
*/

public class QuarterOf {
    public static int quarterOf(int month) {
        return switch (month) {
            case 1, 2, 3 -> 1;
            case 4, 5, 6 -> 2;
            case 7, 8, 9 -> 3;
            case 10, 11, 12 -> 4;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        System.out.println(quarterOf(3));
        System.out.println(quarterOf(8));
        System.out.println(quarterOf(11));
    }
}

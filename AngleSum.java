/*
https://www.codewars.com/kata/5a03b3f6a1c9040084001765/train/java
Find the total sum of internal angles (in degrees) in an n-sided simple polygon
N will be greater than 2.
*/

public class AngleSum {
    public static int sumOfAngles(int n) {
        return (n - 2) * 180;
    }

    public static void main(String[] args) {
        System.out.println(sumOfAngles(3));
        System.out.println(sumOfAngles(4));
    }
}

/*
https://www.codewars.com/kata/57a5c31ce298a7e6b7000334/train/java
Complete the function which converts a binary number (given as a string) to a decimal number.
*/

public class BinToDecimal {
    public static int binToDecimal(String inp) {
        return Integer.parseInt(inp, 2);
    }

    public static void main(String[] args) {
        System.out.println(binToDecimal("1"));
        System.out.println(binToDecimal("0"));
        System.out.println(binToDecimal("1001001"));
    }
}

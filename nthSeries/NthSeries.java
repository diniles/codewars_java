/*
https://www.codewars.com/kata/555eded1ad94b00403000071/train/java
Your task is to write a function which returns the sum of following series upto nth term(parameter).

Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
Rules:
You need to round the answer to 2 decimal places and return it as String.

If the given value is 0 then it should return 0.00

You will only be given Natural Numbers as arguments.

Examples:(Input --> Output)
1 --> 1 --> "1.00"
2 --> 1 + 1/4 --> "1.25"
5 --> 1 + 1/4 + 1/7 + 1/10 + 1/13 --> "1.57"
*/

package nthSeries;

public class NthSeries {
    public static String seriesSum(int n) {

//        best practice
        double sum = 0.0;
        for (int i = 0; i < n; i++)
            sum += 1.0 / (1 + 3 * i);

        return String.format("%.2f", sum);

//        String result = "";
//        double sum = 1;
//        if (n == 0) {
//            result = "0.00";
//        } else if (n == 1) {
//            result = "1.00";
//        } else {
//            for (int i = 4; i < n * 3; i = i + 3) {
//                sum += (double) 1 / i;
//            }
//            result += String.format("%.2f", sum);
//        }
//        return result;
    }
}

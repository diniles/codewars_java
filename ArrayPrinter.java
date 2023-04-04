/*
https://www.codewars.com/kata/56e2f59fb2ed128081001328/train/java
Printing Array elements with Comma delimiters
Input: Array of elements

["h","o","l","a"]

Output: String with comma delimited elements of the array in th same order.

"h,o,l,a"
*/


public class ArrayPrinter {

    public static String printArray(Object array[]) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\"");
        for (int i = 0; i < array.length; i++) {
            stringBuffer.append(array[i]);
            if (i < array.length - 1) stringBuffer.append(",");
        }
        stringBuffer.append("\"");
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{2, 4, 5, 2};
        System.out.println(printArray(array));
    }

}

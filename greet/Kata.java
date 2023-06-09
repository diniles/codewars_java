/*
https://www.codewars.com/kata/55a70521798b14d4750000a4/train/java
Make a function that will return a greeting statement that uses an input; your program should return,
"Hello, <name> how are you doing today?".

[Make sure you type the exact thing I wrote or the program may not execute properly]
*/

package greet;

public class Kata {
    public static String greet(String name) {
//        return "Hello, " + name + " how are you doing today?";

//        best practice
        return String.format("Hello, %s how are you doing today?", name);
    }
}

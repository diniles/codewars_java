/*
https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java
Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H

patrick feeney => P.F
*/

package abbreviateTwoWords;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String result = name.charAt(0) + "." + name.charAt(name.indexOf(' ') + 1);
        return result.toUpperCase();
    }
}

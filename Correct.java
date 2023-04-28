/*
https://www.codewars.com/kata/577bd026df78c19bca0002c0/train/java
Character recognition software is widely used to digitise printed texts. Thus the texts can be edited, searched and
stored on a computer.

When documents (especially pretty old ones written with a typewriter), are digitised character recognition softwares
often make mistakes.

Your task is correct the errors in the digitised text. You only have to handle the following mistakes:

S is misinterpreted as 5
O is misinterpreted as 0
I is misinterpreted as 1
The test cases contain numbers only by mistake.
*/

public class Correct {
    public static String correct(String string) {
        return string = string.replaceAll("5", "S").replaceAll("0", "O").replaceAll("1", "I");
    }

    public static void main(String[] args) {
        System.out.println(correct("1F-RUDYARD K1PL1NG"));
        System.out.println(correct("R0BERT MERLE - THE DAY 0F THE D0LPH1N"));
        System.out.println(correct("R1CHARD P. FEYNMAN - THE FEYNMAN LECTURE5 0N PHY51C5"));
        System.out.println(correct("R1CHARD P. FEYNMAN - 5TAT15T1CAL MECHAN1C5"));
        System.out.println(correct("5TEPHEN HAWK1NG - A BR1EF H15T0RY 0F T1ME"));
    }
}

/*
https://www.codewars.com/kata/57f24e6a18e9fad8eb000296/train/java
Who remembers back to their time in the schoolyard, when girls would take a flower and tear its petals, saying each of
the following phrases each time a petal was torn:

"I love you"
"a little"
"a lot"
"passionately"
"madly"
"not at all"
If there are more than 6 petals, you start over with "I love you" for 7 petals, "a little" for 8 petals and so on.
*/

public class HowMuchILoveYou {

    public static String howMuchILoveYou(int nb_petals) {
        int lastPetail = 0;
        if (nb_petals >= 6) {
            lastPetail = nb_petals % 6;
        } else {
            lastPetail = nb_petals;
        }
        String phrase = "";
        switch (lastPetail) {
            case 0 -> phrase = "not at all";
            case 1 -> phrase = "I love you";
            case 2 -> phrase = "a little";
            case 3 -> phrase = "a lot";
            case 4 -> phrase = "passionately";
            case 5 -> phrase = "madly";

        }
        return phrase;
    }

    public static void main(String[] args) {
        System.out.println(howMuchILoveYou(1));
        System.out.println(howMuchILoveYou(2));
        System.out.println(howMuchILoveYou(6));
    }
}

/*
https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b/train/java
I have a cat and a dog.

I got them at the same time as kitten/puppy. That was humanYears years ago.

Return their respective ages now as [humanYears,catYears,dogYears]

NOTES:

humanYears >= 1
humanYears are whole numbers only
Cat Years
15 cat years for first year
+9 cat years for second year
+4 cat years for each year after that
Dog Years
15 dog years for first year
+9 dog years for second year
+5 dog years for each year after that
*/

package humanYearsCatYearsDogYears;

public class HumanYearsCatYearsDogYears {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        //best practice
        int catYears = 0, dogYears = 0;
        switch (humanYears) {
            default:
                catYears = 4 * (humanYears - 2);
                dogYears = 5 * (humanYears - 2);
            case 2:
                catYears += 9;
                dogYears += 9;
            case 1:
                catYears += 15;
                dogYears += 15;
        }
        return new int[]{humanYears, catYears, dogYears};

//        int[] years = new int[3];
//        years[0] = humanYears;
//        switch (humanYears) {
//            case 0 -> {
//            }
//            case 1 -> {
//                years[1] = 15;
//                years[2] = 15;
//            }
//            case 2 -> {
//                years[1] = 24;
//                years[2] = 24;
//            }
//            default -> {
//                years[1] = 24 + (humanYears - 2) * 4;
//                years[2] = 24 + (humanYears - 2) * 5;
//            }
//        }
//        return years;
    }
}
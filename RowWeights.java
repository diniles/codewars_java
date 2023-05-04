/*
https://www.codewars.com/kata/5abd66a5ccfd1130b30000a9/train/java
Scenario
Several people are standing in a row divided into two teams.
The first person goes into team 1, the second goes into team 2, the third goes into team 1, and so on.

Task
Given an array of positive integers (the weights of the people), return a new array/tuple of two integers, where the
first one is the total weight of team 1, and the second one is the total weight of team 2.

Notes
Array size is at least 1.
All numbers will be positive.
Input >> Output Examples
rowWeights([13, 27, 49])  ==>  return (62, 27)
Explanation:
The first element 62 is the total weight of team 1, and the second element 27 is the total weight of team 2.
*/

import java.util.Arrays;

public class RowWeights {
    public static int[] rowWeights(final int[] weights) {
        int firstTeam = 0;
        int secondTeam = 0;
        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                firstTeam += weights[i];
            } else {
                secondTeam += weights[i];
            }
        }
        int[] teamsWeight = new int[]{firstTeam, secondTeam};
        return teamsWeight;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rowWeights(new int[]{80})));
        System.out.println(Arrays.toString(rowWeights(new int[]{100, 50})));
        System.out.println(Arrays.toString(rowWeights(new int[]{50, 60, 70, 80})));
    }
}

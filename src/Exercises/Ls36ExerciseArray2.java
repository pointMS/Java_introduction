package Exercises;

import java.util.Arrays;

/**
 * FirstNewVersion
 * 12.06.2020
 */
public class Ls36ExerciseArray2 {
    public static void main(String[] args) {

        int[] a1 = {1, 2, 3}; // [1, 3, 3]
        int[] a2 = {1, 2, 3, 2, 5, 2}; // [1, 3, 3, 5, 5, 2]
        int[] a3 = {3, 4}; // [3, 4]
        int[] a4 = {1, 2, 3, 2, 5, 2, 1}; // [3, 4]

        System.out.println(Arrays.toString(notAlone(a1, 2)));
        System.out.println(Arrays.toString(notAlone(a2, 2)));
        System.out.println(Arrays.toString(notAlone(a3, 3)));
        System.out.println(Arrays.toString(notAlone(a4, 2)));
    }

    private static int[] notAlone(int[] array, int digit) {
        //Arrays2-22 We'll say that an element in an array is "alone" if there are
        // values before and after it, and those values are different from it.
        // Return a version of the given array where every instance
        // of the given value which is alone
        // is replaced by whichever value to its left or right is larger.
        if (array.length < 3) {
            return array;
        }
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] == digit && array[i + 1] != digit && array[i - 1] != digit) {
                int bibNumber = array[i - 1];
                if (array[i + 1] > array[i - 1]) {
                    bibNumber = array[i + 1];
                }
                array[i] = bibNumber;
            }
        }
        return array;
    }

}

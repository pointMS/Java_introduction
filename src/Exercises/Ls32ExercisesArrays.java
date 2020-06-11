package Exercises;

import java.util.Arrays;

public class Ls32ExercisesArrays {
    public static void main(String[] args) {
//        int[] a1 = {2, 4, 1, 2};
//        int[] a2 = {4, 1, 4, 2};
//        int[] a3 = {4, 4, 1, 2, 3};
//        System.out.println(Arrays.toString(post4(a1)));
//        System.out.println(Arrays.toString(post4(a2)));
//        System.out.println(Arrays.toString(post4(a3)));

        int[] b1 = {1, 10, 10, 2};
        int[] b2 = {10, 2, 10};
        int[] b3 = {1, 99, 10};

        System.out.println(Arrays.toString(without10(b1)));
        System.out.println(Arrays.toString(without10(b2)));
        System.out.println(Arrays.toString(without10(b3)));


    }

    //Array2-11 Return a version of the given array where all the 10's have been removed.
    // The remaining elements should shift left towards the start of the array as needed,
    // and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}.
    // You may modify and return the given array or make a new array.
    public static int[] without10(int[] array1) {
        int[] output = new int[array1.length];
        int count = 0;
        for (int i = 0; i < output.length; i++) {
            if (array1[i] != 10) {
                output[count] = array1[i];
                count++;
            }
        }
        return output;
    }


    //Arrays2-10 Given a non-empty array of ints, return a new array containing the elements from the original array
// that come after the last 4 in the original array. The original array will contain at least one 4.
// Note that it is valid in java to create an array of length 0.
    public static int[] post4(int[] array) {
        int[] output;

        //1. найти последнюю 4
        //2. Длина заданного массива минус место, на котором стоит последняя 4
        //3. инициализировать output значениями, идущими после 4.

        int four = 4;
        int last4 = 0; // место (индекс), где стоит последняя 4

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == four) {
                last4 = i;
                break;
            }
        }
        output = new int[array.length - 1 - last4];
        System.out.println(output.length);

        for (int i = 0; i < output.length; i++) {
            output[i] = array[array.length - output.length + i];

        }
        return output;
    }
}

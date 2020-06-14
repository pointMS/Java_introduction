package Sorting;

import java.util.Arrays;

/**
 * FirstNewVersion
 * 12.06.2020
 */

// сортировка слиянием
public class MergeSort {
    public static void main(String[] args) {
        //mergeTest();
        int[] a1 = {25, 14, 2, 18, 36};
        int[] a2 = {1, 2, 3, 4, 5};

    }

    public static void mergeAnother(int[] a1, int[] a2) {
        int[] result;
        // add appach - monday

    }

    public static void mergeTest() {
        //слияние двух массивов
        int[] a1 = {25, 14, 2, 18, 36};
        int[] a2 = {1, 2, 3, 4, 5};
        int[] c = new int[a1.length + a2.length];

        for (int i = 0; i < a1.length; i++) {
            c[i] = a1[i];
        }
        System.out.println("a1 = " + a1.length);
        System.out.println("c = " + c.length);

        for (int i = 0; i < a2.length; i++) {
            c[i + a1.length] = a2[i];
        }
        System.out.println(Arrays.toString(c));
    }
}


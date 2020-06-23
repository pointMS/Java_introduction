package Exercises;

import java.util.Arrays;

/**
 * FirstNewVersion 23.06.2020
 */
public class Ls44Array3_04TryTwo {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 1, 4};
        int[] a2 = {1, 3, 1, 4, 4, 3, 1};
        int[] a3 = {3, 2, 2, 4};
        System.out.println(Arrays.toString(fix34(a1))); // [1, 3, 4, 1]
        System.out.println(Arrays.toString(fix34(a2))); // [1, 3, 4, 1, 1, 3, 4]
        System.out.println(Arrays.toString(fix34(a3))); // [3, 4, 2, 2]
    }

    private static int[] fix34(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 3) {
                for (int j = 0; j < array.length; j++) {
                    if (array[j] == 4 && array[j - 1] != 3) {//4 должна быть без 3
                        int temp = array[i + 1];
                        array[i + 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        return array;
    }
}

package Sorting;

import java.util.Arrays;

public class CocktailSorting {
    public static void main(String[] args) {
        int[] myLittleArray = {100, 24, 56, 24, 87, 45, 15, 98, 1};

        System.out.println(Arrays.toString(cocktailSort(myLittleArray)));
    }

    private static int[] cocktailSort(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            for (int i = start; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    array[i] = array[i] ^ array[i + 1];
                    array[i + 1] = array[i + 1] ^ array[i];
                    array[i] = array[i] ^ array[i + 1];
                }
            }
            end--;

            for (int i = end; i > start; i--) {

                    if (array[i] < array[i - 1]) {
                        array[i] = array[i] ^ array[i - 1];
                        array[i - 1] = array[i - 1] ^ array[i];
                        array[i] = array[i] ^ array[i - 1];
                    }
            }
            start++;
        }
        return array;
    }

}

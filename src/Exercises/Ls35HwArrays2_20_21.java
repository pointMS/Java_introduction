package Exercises;

import java.util.Arrays;

/**
 * FirstNewVersion
 * 11.06.2020
 */
public class Ls35HwArrays2_20 {
    public static void main(String[] args) {
//        int[] a1 = {1, 4, 5, 6, 2}; // true
//        int[] a2 = {1, 2, 3}; // true
//        int[] a3 = {1, 2, 4}; // false
//        System.out.println(tripleUp(a1));
//        System.out.println(tripleUp(a2));
//        System.out.println(tripleUp(a3));

        int[] b1 = {2, 10, 3, 4, 20, 5}; //[2, 10, 10, 10, 20, 20]
        int[] b2 = {10, 1, 20, 2}; //[10, 10, 20, 20]
        int[] b3 = {10, 1, 9, 20}; //[10, 10, 10, 20]
        System.out.println(Arrays.toString(tenRun(b1)));
        System.out.println(Arrays.toString(tenRun(b2)));
        System.out.println(Arrays.toString(tenRun(b3)));

    }


    public static boolean tripleUp(int[] array) {
        //Arrays2-20 Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.
        //Дан массив, верните true, если в нем есть три увеличивающиеся подряд числа, например, 4,5,6 или 23,24,25
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] + 1 == array[i + 1] && array[i] + 2 == array[i + 2]) {
                return true;
            }
        }
        return false;
    }

    public static int[] tenRun(int[] input) {
        //Arrays2-21 For each multiple of 10 in the given array, change all the values following it to be that multiple of 10,
        // until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
        //Для каждого элемента кратного 10 в данном массиве измените все значения, следующие за ним, на кратные 10,
        // пока не встретите еще одно кратное 10. Так что {2, 10, 3, 4, 20, 5} дает {2, 10, 10, 10, 20, 20}.
        //int[] output = new int[input.length];

        for (int i = 1; i < input.length-1; i++) {
            if (input[i] < 10) {
                input[i] = 10;
            }
            if (input[i] == 20) {
                input[i + 1] = 20;
            }
        }
        return input;
    }
}



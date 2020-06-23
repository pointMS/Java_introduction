package Exercises;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * FirstNewVersion 23.06.2020
 */
public class Ls44Arrays3_06 {
    public static void main(String[] args) {
        //Arrays3-06
        // Мы скажем, что «зеркальная» секция в массиве - это группа смежных элементов,
        // так что где-то в массиве эта же группа появляется в обратном порядке.
        // Например, самая большая зеркальная секция в {1, 2, 3, 8, 9, 3, 2, 1} имеет длину 3 (часть {1, 2, 3}).
        // Возвращает размер наибольшего зеркального раздела, найденного в данном массиве.

        int[] a1 = {1, 2, 3, 8, 9, 3, 2, 1}; // 3
        int[] a2 = {1, 2, 1, 4}; //3 (2?)
        int[] a3 = {7, 1, 2, 9, 7, 2, 1}; // 2

        System.out.println(maxMirror(a1));
        System.out.println(maxMirror(a2));
        System.out.println(maxMirror(a3));
//
//        System.out.println("a1: " + Arrays.toString(a1));
//        System.out.println("reverse a1: " + Arrays.toString(reverse(a1)));
//        System.out.println("a2: " + Arrays.toString(a2));
//        System.out.println("reverse a2: " + Arrays.toString(reverse(a2)));
//        System.out.println("a3: " + Arrays.toString(a3));
//        System.out.println("reverse a3: " + Arrays.toString(reverse(a3)));

    }

    public static int maxMirror(int[] nums) {
        int max = 0;

        for(int start = 0; start < nums.length; start++) {
            for(int begin = nums.length - 1; begin >= 0; begin--) {
                int size = 0;
                int i = start;
                int j = begin;

                while(i < nums.length && j >= 0 && nums[i] == nums[j]) {
                    size++;
                    i++;
                    j--;
                }

                max = Math.max(max, size);
            }
        }

        return max;
    }

    public static int maxMirrorExample(int[] nums) {
        final int len = nums.length;
        int result = 0;
        if (len == 0) return result;
        for (int i = 0; i < len; i++) {
            int counter = 0;
            for (int j = (len - 1); j > i; j--) {
                if (nums[i + counter] != nums[j]) {
                    break;
                }
                counter++;
            }
            result = Math.max(result, counter);
        }
        if (result == 1) result = 0;
        return result;
    }

    public static int maxMirrorTry(int[] array) {
        int result = 0;
        int count = 0;
        int[] array2 = reverse(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array2[i]) {
                break;
            }
            if (count > 0 && array[i] != array2[i]) {
                break;
            }
            if (count > result) {
                result = count;
            }
            count++;
        }
        return result;
    }

    public static int[] reverse(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[input.length - i - 1] = input[i];

        }
        return output;
    }
}

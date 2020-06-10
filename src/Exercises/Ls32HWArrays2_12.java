package Exercises;

import java.util.Arrays;

public class Ls32HWArrays2_12 {
    public static void main(String[] args) {

        int[] a1 = new int[]{1, 6}; // ["1", "2", "Fizz", "4", "Buzz"]
        int[] a2 = new int[]{1, 8}; //["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
        int[] a3 = new int[]{1, 18}; //["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]

        System.out.println(Arrays.toString(fizzBuzz(a1)));
        System.out.println(Arrays.toString(fizzBuzz(a2)));
        System.out.println(Arrays.toString(fizzBuzz(a3)));

//        int[] b1 = new int[]{10, 3, 5, 6};
//        int[] b2 = new int[]{7, 2, 10, 9};
//        int[] b3 = new int[]{2, 10, 7, 2};
//
//        System.out.println(bigDiff(b1));
//        System.out.println(bigDiff(b2));
//        System.out.println(bigDiff(b3));

    }

    public static String[] fizzBuzz(int[] array) {
        //This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given
        // as a first problem for job interviews. (See also: FizzBuzz Code.)
        // Consider the series of numbers beginning at start and running up to but not including end,
        // so for example start=1 and end=5 gives the series 1, 2, 3, 4.
        // Return a new String[] array containing the string form of these numbers, except for multiples of 3,
        // use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz".
        // In Java, String.valueOf(xxx) will make the String form of an int or other type.
        // This version is a little more complicated than the usual version since you have to allocate and
        // index into an array instead of just printing, and we vary the start/end instead of just always doing 1..100.

        //Вернуть новый стринг длинной, не включающей последнее значение, где перечислены цифры между заданными значениями.
        //но  %3 заменить на Fizz, %5 = Buzz, %3&%5- %15 = FizzBuzz

        int first = array[0];
        int last = array[1];
        int length = last - first;

        System.out.println("length output = " + length);
        String[] output = new String[length];

        for (int i = first; i < last; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output[i - first] = "FizzBuzz";
            } else if (i % 5 == 0) {
                output[i - first] = "Buzz";
            } else if (i % 3 == 0) {
                output[i - first] = "Fizz";
            } else
                output[i - first] = String.valueOf(i);
        }
        return output;
    }

    public static int bigDiff(int[] array) {
        //Array02-13 Given an array length 1 or more of ints, return the difference
        // between the largest and smallest values in the array.
        // Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

        // оба решения частично нагуглены, во втором новое для меня - такая инициализация min & max

        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }

//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < array.length - 1; i++) {
//            max = Math.max(max, array[i]);
//        }
//        for (int i = 0; i < array.length - 1; i++) {
//            min = Math.min(min, array[i]);
//        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        return max - min;
    }
}

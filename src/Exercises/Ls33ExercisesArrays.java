package Exercises;

import java.sql.DataTruncation;

/*10.06.2020*/
public class Ls33ExercisesArrays {
    public static void main(String[] args) {
//        int[] a1 = {1, 2, 2}; //5
//        int[] a2 = {1, 2, 2, 6, 99, 99, 7, 25}; //30
//        int[] a3 = {1, 1, 6, 7, 2}; //4
//        System.out.println(sum67(a1));
//        System.out.println(sum67(a2));
//        System.out.println(sum67(a3));

//        int[] b1 = {2, 3, 2, 2, 4, 2}; //true
//        int[] b2 = {2, 3, 2, 2, 4, 2, 2}; //false
//        int[] b3 = {1, 2, 3, 4}; // false
//        System.out.println(sum28(b1));
//        System.out.println(sum28(b2));
//        System.out.println(sum28(b3));

//        int[] k1 = {1, 4, 1, 4};
//        int[] k2 = {1, 4, 2, 4};
//        int[] k3 = {1, 1};
//        System.out.println(only14(k1)); //true
//        System.out.println(only14(k2)); //false
//        System.out.println(only14(k3)); //true

        int[] l1 = {1, 2, 1, 3};
        int[] l2 = {1, 2, 1, 3};
        int[] l3 = {1, 2, 1, 3, 4};
        System.out.println(isEverywhere(l1, 1)); // true
        System.out.println(isEverywhere(l2, 2)); // false
        System.out.println(isEverywhere(l3, 1)); //false


    }


    public static boolean isEverywhere(int[] array, int n) {
        //Arrays02-17 We'll say that a value is "everywhere" in an array
        // if for every pair of adjacent elements in the array,
        // at least one of the pair is that value.
        // Return true if the given value is everywhere in the array.
//проверяем пары элементов, есть ли в них переданное значение

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != n && array[i + 1] != n) return false;
        }
        return true;
    }


    public static boolean only14(int[] array) {
        //Arrays02-16 Given an array of ints, return true if
        // every element is a 1 or a 4.

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 1 && array[i] != 4) return false;
        }
        return true;
    }

    public static boolean sum28(int[] array) {
        //Arrays02-15Given an array of ints,
        // return true if the sum of all the 2's in the array is exactly 8.
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                sum += array[i];
            }
        }
        return sum == 8;
    }

    public static int sum67(int[] array) {
        //Array02-14 Return the sum of the numbers in the array,
        // except ignore sections of numbers starting with
        // a 6 and extending to the next 7 (every 6 will be
        // followed by at least one 7). Return 0 for no numbers.
        int sum = 0;
        boolean sixMode = false; //переменная решает, считать или нет, false - считаем
        for (int i = 0; i < array.length; i++) {
            if (sixMode) {
                if (array[i] == 7) {
                    sixMode = false;
                }
            } else if (array[i] == 6) { //если доходим до 6, перестаем считать и как только появляется 7 начинаем считать снова
                sixMode = true;
            } else {
                sum += array[i];
            }
        }
        return sum;
    }
}


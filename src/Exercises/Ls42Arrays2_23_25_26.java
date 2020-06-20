package Exercises;

import java.util.Arrays;

/**
 * FirstNewVersion
 * 20.06.2020
 */
public class Ls42Arrays2_23_25_26 {
    public static void main(String[] args) {
        //Arrays2-23
        int[] a1 = {0, 5, 0, 3};
        int[] a2 = {0, 4, 0, 3};
        int[] a3 = {0, 1, 0};
        int[] a4 = {1, 0, 4, 0, 5};
        System.out.println(Arrays.toString(zeroMaxNew(a1))); // 5,5,3,3
        System.out.println(Arrays.toString(zeroMaxNew(a2))); // 3,4,3,3
        System.out.println(Arrays.toString(zeroMaxNew(a3))); // 1,1,0
        System.out.println(Arrays.toString(zeroMaxNew(a4))); // 1,5,4,5,5

        //Arrays2-25
//        int[] b1 = {1, 2, 2};
//        int[] b2 = {1, 2, 1, 2};
//        int[] b3 = {2, 1, 2};
//        System.out.println(has22(b1)); //true
//        System.out.println(has22(b2)); //false
//        System.out.println(has22(b3)); //false

        //Arrays2-26
//        int[] c1 = {1, 4, 1};
//        int[] c2 = {1, 4, 1, 4};
//        int[] c3 = {1, 1};
//        System.out.println(more14(c1)); //true
//        System.out.println(more14(c2)); //false
//        System.out.println(more14(c3)); //true

        //Arrays2-27
//        System.out.println(Arrays.toString(fizzArray2(4)));//["0", "1", "2", "3"]
//        System.out.println(Arrays.toString(fizzArray2(10)));
//        System.out.println(Arrays.toString(fizzArray2(2)));

    }

    private static String[] fizzArray2(int n) {
        //Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1.
        // N may be 0, in which case just return a length 0 array. Note: String.valueOf(xxx) will make the String form of most types.
        // The syntax to make a new string array is: new String[desired_length] (See also: FizzBuzz Code)
        String[] output = new String[n];
        for (int i = 0; i < output.length; i++) {
            output[i] = String.valueOf(i);
        }

        return output;
    }

    private static boolean more14(int[] array) {
        //Given an array of ints, return true if the number of 1's is greater than the number of 4's
        //Дан целочисленный массив, вернуть true, если в нем кол-во единиц больше количества четверок. Если равно - false
        int count1 = 0;
        int count4 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count1 = count1 + 1;
            } else if (array[i] == 4) {
                count4 = count4 + 1;
            }
        }
//        System.out.println("count1 = " + count1);
//        System.out.println("count4 = " + count4);
        return count1 > count4;
    }

    private static boolean has22(int[] array) {
        //Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
        //Дан целочисленный массив, вернуть true, если в нем идут две двойки подряд
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 2 && array[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }

    private static int[] zeroMaxNew(int[] array) {
        //Arrays2-23
        //Вернуть версию данного массива,
        // где каждое нулевое значение в массиве заменяется наибольшим нечетным значением справа от нуля в массиве.
        // Если справа от нуля нет нечетного значения, оставьте ноль как ноль.

        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] % 2 == 1 && array[i - 1] == 0) {
                array[i - 1] = array[i];
            }
            if (array[i] % 2 == 0 && array[i - 1] == 0) {
                array[i - 1] = array[i + 1];
            }
        }
        return array;
    }

}

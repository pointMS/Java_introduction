package Exercises;

import java.util.Arrays;

/**
 * FirstNewVersion 22.06.2020
 */
public class Ls43Arrays3_03hw {
    public static void main(String[] args) {
        //n * (n + 1) / 2
        System.out.println(Arrays.toString(seriesUp(3))); //[1,   1, 2,   1, 2, 3]
        System.out.println(Arrays.toString(seriesUp(4))); //[1,   1, 2,   1, 2, 3,   1, 2, 3, 4]
        System.out.println(Arrays.toString(seriesUp(2))); //[1,   1, 2]

    }

    //Arrays3-03
    // Учитывая n> = 0, создайте массив с шаблоном {1,  1, 2,  1, 2, 3, ... 1, 2, 3 .. n}
    // Обратите внимание, что длина массива будет 1 + 2 + 3 ... + n, которая суммируется с n * (n + 1) / 2.

    private static int[] seriesUp(int n) {
        int length = n * (n + 1) / 2;
        int[] array = new int[length];
        int count = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j < i + 1; j++) {
                array[count] = j;
                count++;
            }
        }
        return array;
    }
}

package Exercises;

import java.util.Arrays;

/**
 * FirstNewVersion
 * 19.06.2020
 */
public class Ls42Arrays2 {
    public static void main(String[] args) {
//        int[] a = {0, 5, 0, 3};
//        int[] b = {0, 4, 0, 3};
//        int[] c = {0, 1, 0};
//        System.out.println(Arrays.toString(zeroMax(a))); // 5, 5, 3, 3
//        System.out.println(Arrays.toString(zeroMax(b))); //3, 4, 3, 3
//        System.out.println(Arrays.toString(zeroMax(c))); //1, 1, 0

        int[] a1 = {1, 2, 3, 4, 100}; //3
        int[] a2 = {1, 1, 5, 5, 10, 8, 7}; //5;
        int[] a3 = {-10, -4, -2, -4, -2, 0}; //-3
        System.out.println(centeredAverage(a1));
        System.out.println(centeredAverage(a2));
        System.out.println(centeredAverage(a3));

//        System.out.println(findMin(a1));
//        System.out.println(findMin(a2));
//        System.out.println(findMin(a3));

    }

    public static int centeredAverage(int[] array) {
        //Arrays2-24
//       Вернуть «центрированное» среднее для массива целых чисел,
//       которое мы будем называть средним средним из значений,
//       за исключением игнорирования самых больших и самых маленьких значений
//       в массиве. Если существует несколько копий наименьшего значения,
//       игнорируйте только одну копию, а также для наибольшего значения.
//       Используйте int Division для получения окончательного среднего.
//       Вы можете предположить, что массив имеет длину 3 или более.
        int result = 0;
        int max = array[0];
        int min = array[0];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
            sum += array[i];
        }
        result = (sum - max - min) / (array.length - 2);
//        System.out.println("max = " + max);
//        System.out.println("min = " + min);
//        System.out.println("sum = " + sum);
        return result;
    }

    public static int findMin(int[]array){// for test
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    //  not solved
    public static int[] zeroMax(int[] array) {
        //Arrays2-23
//        Вернуть версию данного массива, где каждое нулевое значение в массиве
//        заменяется наибольшим нечетным значением справа от нуля в массиве.
//        Если справа от нуля нет нечетного значения, оставьте ноль как ноль.
        int max = 0;
        for (int i = 0; i < array.length - 1; i++) {//сравниваем со след. значением. поэтому -1
            if (array[i] == 0) {
                for (int j = 1; j < array.length; j++) {

                    if (array[j] % 2 == 1 && array[j] > max) {
                        max = array[j];//нашли макс значение и присваиваем его макс
                    }
                }
                if (max != 0) {
                    array[i] = max;
                }

            }
        }
        return array;
    }

}

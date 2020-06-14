package Sorting;

import java.util.Arrays;

/**
 * FirstNewVersion
 * 14.06.2020
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] a = {15, 87, 4, 55, 16, 32, 99, 113, 1, 10};
        System.out.println(Arrays.toString(shellSort(a)));
    }

    public static int[] shellSort(int[] array) {

        /*1. Вводится шаг сортировки - половина массива
2. Сравнивается I элемент первой половины массива и I элемент второй половины (1+шаг),  затем - элементы II  т.д.
3. Меняются  местами, если левый больше правого
4. Шаг уменьшается в половину (дробная часть отбрасывается)
5. Сортировка вставками внутри каждой части раздробленного массива,
т.е "перепрыгивая" через второй массив с нужным шагом
6. Простая сортировка вставками, когда шаг = 1
*/
        int step = array.length / 2;
        while (step >= 1) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i - step; j >= 0; j = j - step) {
                    if (array[j] > array[j + step]) {
                        int temp = array[j];
                        array[j] = array[j + step];
                        array[j + step] = temp;
                    }
                }
            }
            step = step/2;
        }
        return array;
    }
}

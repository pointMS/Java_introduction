package Sorting;

import java.util.Arrays;

/**
 * FirstNewVersion
 * 13.06.2020
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {58, 12, 77, 36, 1, 18, 100, 24};
        System.out.println(Arrays.toString(selectionSort(a)));
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i; // находим и запоминаем минимальное значение и перемещаем го в начало списка
            for (int j = i + 1; j < array.length; j++) {//проверяем дальше, начиная со следующего элемента
                if (array[j] < array[min]) {//сравниваем каждое след. значение с минимальным
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }
}

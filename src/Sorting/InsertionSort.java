package Sorting;

import java.util.Arrays;

/**
 * FirstNewVersion
 * 12.06.2020
 */
public class InsertionSort {
    public static void main(String[] args) {
        //сортировка вставкой
        int[] array = {22, 100, 55,63,14, 33, 88, 77, 7};
        System.out.println(Arrays.toString(insertSort(array)));
        //System.out.println(Arrays.toString(insertSortRepeat(array)));

    }

    public static int[] insertSort(int[] input) {
        for (int i = 1; i < input.length; i++) { //цикл начинается с 1, первый элемент по определению отсротирован
            int tempElement = input[i]; //для временного хранения значения и сравнения
            int location = i - 1; //индекс предыдущего значения
            while (location >= 0 && input[location] > tempElement) {//пока значение от Location больше значения элемента проверки
                input[location + 1] = input[location];
                location -= 1; //decrement: location = location-1
            }
            input[location + 1] = tempElement; //передаем значение из "памяти"
        }
        return input;
    }


    public static int[] insertSortRepeat(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int index = i - 1;
            while (index >= 0 && array[index] > temp) {
                array[index + 1] = array[index];
                index = index - 1;
            }
            array[index + 1] = temp;
        }
        return array;
    }

}

package Sorting;

import java.util.Arrays;

public class CocktailSorting {
    public static void main(String[] args) {
        int[] myLittleArray = {100, 28, 56, 24, 87, 45, 15, 98, 1};

       // System.out.println(Arrays.toString(cocktailSort(myLittleArray)));
        System.out.println(Arrays.toString(cocktailSortRepeat(myLittleArray)));
    }

    public static int[] cocktailSortRepeat(int[] array) {
        //https://prog-cpp.ru/sort-shaker/
        int left = 0; //границы сортируемой области массива
        int right = array.length - 1;
        int flag = 1; //флаг наличия перемещений
        //Выполнение цикла, пока левая граница не сомкнется с правой и пока в массиве имеются перемещения
        while ((left < right) && flag > 0) {
            flag = 0;
            for (int i = left; i < right; i++) {//идем слева направо -->
                if (array[i] > array[i + 1]) {//если след. элемент больше предыдущего, меняем местами
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = 1; //перемещения в цикле были
                }
            }
            right--;//сдвигаем правую границу на предыдущий элемент
            for (int i = right; i > left; i--) {// идем справа налево <--
                if (array[i - 1] > array[i]) {// если пред. элемент больше текущего, меняем местами
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    flag = 1; //перемещения в цикле были
                }
            }
            left++; // сдвигаем левую границу на след.элемент
        }
        return array;
    }

    private static int[] cocktailSort(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            for (int i = start; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    array[i] = array[i] ^ array[i + 1];
                    array[i + 1] = array[i + 1] ^ array[i];
                    array[i] = array[i] ^ array[i + 1];
                }
            }
            end--;
            for (int i = end; i > start; i--) {
                if (array[i] < array[i - 1]) {
                    array[i] = array[i] ^ array[i - 1];
                    array[i - 1] = array[i - 1] ^ array[i];
                    array[i] = array[i] ^ array[i - 1];
                }
            }
            start++;
        }
        return array;
    }

}

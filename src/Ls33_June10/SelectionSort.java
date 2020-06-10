package Ls33_June10;

import java.util.Arrays;

/*10.06.2020*/
public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {44, 9, 100, 1, 7, 33, 156, 6};
        System.out.println(Arrays.toString(makeSortSelection(a)));

    }

    public static int[] makeSortSelection(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i; //индекс, на котором будет стоять минимальное число, присваиваем i и сравниваем с ней
        //но сравниваем в след цикле и после каждого цикла уменьшаем размер массива, смещает, во внешнем цикле - обмен

            for (int j = i + 1; j < array.length; j++) { //во внутр цикле - поиск
                if (array[j] < array[minIndex]) {
                    minIndex = j; //меняем значение индекса
                }
            }
            int temp = array[minIndex]; //обмен значениями внутри первого цикла
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

}
package Exercises;

import java.util.Arrays;

/**
 * FirstNewVersion 23.06.2020
 */
public class Ls44Arrays3_04 {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 1, 4};
        int[] a2 = {1, 3, 1, 4, 4, 3, 1};
        int[] a3 = {3, 2, 2, 4};
        System.out.println(Arrays.toString(fix34(a1))); // [1, 3, 4, 1]
        System.out.println(Arrays.toString(fix34(a2))); // [1, 3, 4, 1, 1, 3, 4]
        System.out.println(Arrays.toString(fix34(a3))); // [3, 4, 2, 2]


    }

    private static int[] fix34(int[] array) {
        int count;
        do {
            count = 0;
            int indexAfterKey = array[0];
            int indexKeySingle4 = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == 3 && array[i + 1] != 4) {
                    indexAfterKey = i + 1;
                }
                if (array[i] == 4 && array[i - 1] != 3) {
                    indexKeySingle4 = i;
                }
            }
            //a=a+b-(b=a) short variant
            int temp = array[indexAfterKey];
            array[indexAfterKey] = array[indexKeySingle4];
            array[indexKeySingle4] = temp;
            count++;
        } while (count == 0);

        return array;
    }
    //Arrays3-4
    //Вернуть массив, который содержит в точности те же числа, что и данный массив,
    // но переставлен так, что за каждым 3 сразу следует 4.
    // Не перемещайте 3, но каждое другое число может двигаться.
    // Массив содержит одинаковое количество 3 и 4, каждые 3 имеют после него номер,
    // который не является 3, а 3 появляется в массиве перед любыми 4.

    //1. Найти индекс 3
    //2. узнать, что идет за тройкой
    //3. Найти индексы четверок
    //4. Поменять следующие за тройками индексы на имеющиеся четверки
}

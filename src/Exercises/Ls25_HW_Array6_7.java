package Exercises;

public class Ls25_HW_Array6_7 {
    public static void main(String[] args) {
//        int[] a1 = new int[]{1, 2, 3, 5, 4, 3, 2, 3}; //[1,2,0]
//        int[] a2 = new int[]{2, 3, 5}; //[2,0,5]
//        int[] a3 = new int[]{1, 2, 1}; //[1,2,1]
//
//        arrayPrint(fix23(a1));
//        arrayPrint(fix23(a2));
//        arrayPrint(fix23(a3));

        int[] mm1 = {1, 2, 3, 4};
        int[] mm2 = {7, 1, 2, 3, 4, 9};
        int[] mm3 = {1, 2};

        //arrayPrint(makeMiddleEven(mm1)); //[2,3]
        arrayPrint(makeMiddleEven(mm2)); //[2,3]
        //arrayPrint(makeMiddleEven(mm3)); //[1,2]

    }

    public static int[] fix23(int[] array) {
        //#6 Дан целочисленный массив из 3 значений, если сразу за 2 стоит 3, вместо 3 поставить 0.
        // Вернуть измененный массив.
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 2 & array[i + 1] == 3) {
                array[i + 1] = 0; // перезаписываем значение вместо
            }
        }
        return array;
    }

    public static void arrayPrint(int[] input) { //для распечатки массива
        for (int element : input) {
            System.out.print(element + ", ");
        }
        System.out.println("-------");
    }

    public static int[] makeMiddleEven(int[] array) {
        //7. Получив массив четной длины, верните новый массив длиной 2, содержащий два средних элемента из исходного массива.
        // Исходный массив будет иметь длину 2 или более.
        int[] output = new int[2]; //новый массив для вывода результата
        output[0] = array[array.length / 2 - 1];
        output[1] = array[array.length / 2];
        return output;

    }
}

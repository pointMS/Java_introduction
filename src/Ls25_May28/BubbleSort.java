package Ls25_May28;

public class BubbleSort {
    public static void main(String[] args) {

        int[] unSortArray = new int[]{104, 64, 34, 25, 12, 22, 11, 90};
        //myArrayPrint(bubbleSortRecursion(unSortArray));

        myArrayPrint(bubbleSort(unSortArray));
    }

    public static int[] bubbleSortRecursion(int[] myArray) {
        int countChanging = 0; //проход круга сравнения значений, считаем изменения
        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] > myArray[i + 1]) {
                int temp = myArray[i]; //для сохранения промежут. значения
                myArray[i] = myArray[i + 1];
                myArray[i + 1] = temp; // меняем значения местами
                countChanging++;
            }
        }
        System.out.println("Count: " + countChanging); //количество изменений, сделанных к каждом круге
        if (countChanging > 0) {
            bubbleSortRecursion(myArray); //рекурсия, чтобы вызвать метод заново и пройти все этапы
        }
        return myArray;
    }

    public static void myArrayPrint(int[] arrayToPrint) {
        for (int value : arrayToPrint) {
            System.out.println(value);

        }
    }

    public static int[] bubbleSort(int[] myArray) {
        boolean unsorted = true;
        while (unsorted) {
            int count = 0; // подсчет циклов сортировки
            for (int i = 0; i < myArray.length - 1; i++) {
                if (myArray[i] > myArray[i + 1]) {
//                    int a = myArray[i]; // вариант с промежуточными элементами
//                    int b = myArray[i + 1];
//                    a = a + b;
//                    b = a - b;
//                    a = a - b;
                    myArray[i] = myArray[i] + myArray[i + 1];
                    myArray[i + 1] = myArray[i] - myArray[i + 1];
                    myArray[i] = myArray[i] - myArray[i + 1];
                    count++;
                }
            }
            if (count == 0) {
                unsorted = false;
            }
        }
        return myArray;
    }
}

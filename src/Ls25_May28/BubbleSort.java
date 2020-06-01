package Ls25_May28;

public class BubbleSort {
    public static void main(String[] args) {

        int[] unSortArray = new int[]{104, 64, 34, 25, 12, 22, 11, 90};
        myArrayPrint(bubbleSort(unSortArray));
    }

    public static int[] bubbleSort(int[] myArray) {
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
            bubbleSort(myArray); //рекурсия, чтобы вызвать метод заново и пройти все этапы
        }
        return myArray;
    }

    public static void myArrayPrint(int[] arrayToPrint) {
        for (int value : arrayToPrint) {
            System.out.println(value);

        }
    }
}

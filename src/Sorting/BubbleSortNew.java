package Sorting;

/*04.06.2020*/
public class BubbleSortNew {
    public static void main(String[] args) {
        int[] array = {104, 64, 34, 25, 12, 22, 11, 90, 13};
        //toPrint(bubbleSortNew(array));

        toPrint(makeBubbleSortImprovement(array));


    }
// с пояснениями
    public static int[] makeBubbleSortImprovement(int[] myArray) {
        int start = 0; // инициализация начальной точки
        int end = myArray.length - 1; // точка от конца цикла
        while (start < end) {// пока эти точки не сойдутся
            for (int i = start; i < end; i++) {//
                if (myArray[i] > myArray[i + 1]) {
                    // swap temp and myArray[i] // обменяем значения для следующего круга, если условие выше выполнилось
                    int temp = myArray[i];// инициализация temp переменной
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temp;
                }
            }
            end--;// так как последнее значение уже отсортировано, то следующий loop уже без него
            for (int j = end; j > start; j--) {
                if (myArray[j] < myArray[j - 1]) {
                    // swap temp and myArray[j] // обменяем значения для следующего круга, если условие выше выполнилось
                    int temp = myArray[j];// инициализация temp переменной
                    myArray[j] = myArray[j - 1];
                    myArray[j - 1] = temp;
                }
            }
            start++; // так как последнее значение уже отсортировано, то следующий loop уже без него
        }
        return myArray;
    }



    public static void toPrint(int[] arrayToPrint) {
        for (int value : arrayToPrint) {
            System.out.print(value + ", ");

        }
    }

    public static int[] bubbleSortNew(int[] array) {
        boolean unsorted = true;
        while (unsorted) {
            int count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                }
                for (int j = array.length - 1; j > 0; j--) {
                    if (array[j] < array[j - 1]) {
                        int temp1 = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp1;
                        count--;
                    }
                }
            }
            if (count == 0) {
                unsorted = false;
            }
        }
        return array;
    }
}



package Sorting;

/*04.06.2020*/
public class BubbleSortNew {
    public static void main(String[] args) {
        int[] array = {104, 64, 34, 25, 12, 22, 11, 90, 13};
        myArrayPrint(bubbleSortNew(array));

    }

    public static void myArrayPrint(int[] arrayToPrint) {
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



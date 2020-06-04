package Sorting;
// from Maria
public class CombSort {
    public static void main(String[] args) {
        int[] array = {104, 64, 34, 25, 12, 22, 11, 90, 13};
        myArrayPrint(comb(array));
    }

    public static int[] comb(int[] array) {
        double stepConstant = 1.24733095;
        int step = array.length;

        boolean sorted = false;
        while (step > 1 || sorted) {
            if (step > 1) {
                step = (int) (step / stepConstant);
            }
            sorted = false;
            for (int i = 0; step + i < array.length; i++) {
                if (array[i] > array[i + step]) {
                    swap(array, i, i + step);
                    sorted = true;
                }
            }
        }
        return array;
    }

    public static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static void myArrayPrint(int[] arrayToPrint) {
        for (int value : arrayToPrint) {
            System.out.print(value + ", ");

        }
    }
}

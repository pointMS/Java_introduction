package Ls28_June03;

public class CombSortTest {
    public static void main(String[] args) {
        int[] array = {104, 64, 34, 25, 12, 22, 11, 90, 13};
        myArrayPrint(comb(array));
    }

    private static int[] comb(int[] array) {
        double stepConstant = 1.2473309;
        int step = array.length;
        boolean unsorted = true;

        while (unsorted == true || step > 1) {
            if (step > 1) {
                step = (int) (step / stepConstant);
            }
            int count = 0;
            for (int i = 0; i < array.length - step; i++) {
                if (array[i] > array[i + step]) {
                    int temp = array[i];
                    array[i] = array[i + step];
                    array[i + step] = temp;
                    count++;
                    unsorted = true;
                }
            }
            if (count == 0) {
                unsorted = false;
            }
        }
        return array;
    }

    public static void myArrayPrint(int[] arrayToPrint) {
        for (int value : arrayToPrint) {
            System.out.print(value + ", ");
        }
    }
}

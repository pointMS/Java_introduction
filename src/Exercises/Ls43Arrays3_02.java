package Exercises;

/**
 * FirstNewVersion
 * 22.06.2020
 */
public class Ls43Arrays3_02 {
    public static void main(String[] args) {
        //Arrays3-02
        int[] a1 = {1, 1, 1, 2, 1}; //true
        int[] a2 = {2, 1, 1, 2, 1}; //false
        int[] a3 = {10, 10}; //true
        System.out.println(canBalance(a1));
        System.out.println(canBalance(a2));
        System.out.println(canBalance(a3));

    }

    private static boolean canBalance(int[] array) {
        //Arrays3-02 Если задан непустой массив, вернуть true, если есть место для разбиения массива так,
        // чтобы сумма чисел на одной стороне была равна сумме чисел на другой стороне.

        //1. найти сумму всех элементов массива
        //2. разделить сумму пополам
        //3. складывать накопительно элементы массива и сравнивать с 1/2 суммы

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i]; //sum = sum+array[i]
        }

        sum = sum / 2;

        int pivot = 0; // index of the element
        int leftSum = 0;
        for (int i = 0; i < array.length; i++) {
            leftSum = leftSum + array[i];
            if (leftSum == sum) {
                pivot = i;
                break;
            }
        }
        //System.out.println("pivot " + pivot);

        int rightSum = 0;
        for (int i = pivot + 1; i < array.length; i++) {
            rightSum = rightSum + array[i];
        }
        if (rightSum == leftSum) return true;

        return false;
    }
}

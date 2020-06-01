package Ls24_May27;

public class Ls24HWArrays {
    public static void main(String[] args) {
//        1.
//        int[] a = new int[]{1, 2, 6};
//        System.out.println(firstLast6(a));
//        int[] b = new int[]{6, 1, 2, 3};
//        System.out.println(firstLast6(b));
//        int[] c = new int[]{13, 6, 1, 2, 3};
//        System.out.println(firstLast6(c));

        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{5, 11, 9};
        int[] a3 = new int[]{7, 0, 0};

        //3.
        arrayPrint(reverse3(a1));
        arrayPrint(reverse3(a2));
        arrayPrint(reverse3(a3));

//        2.
//        int[] a1 = new int[]{1, 2, 3};
//
//        int[] a2 = new int[]{7, 3};
//        int[] b2 = new int[]{7, 3, 2};
//        int[] c2 = new int[]{1, 3};
//
//        System.out.println(commonEnd(a1, a2)); //true
//        System.out.println(commonEnd(a1, b2)); //false
//        System.out.println(commonEnd(a1, c2)); //true

//        4.
//        arrayPrint(middleWay(a1, a2));
//        arrayPrint(middleWay(a1, b2));
//        arrayPrint(middleWay(a1, c2));

    }

    public static boolean firstLast6(int[] args) {
        //1. Дан массив int. Верните true, если цифра 6 является значением в первом или последнем элементе массива.
        // Массив будет длиной больше, либо равной единице.
        boolean result = false;
//        if (args[0] == 6 || args[args.length - 1] == 6) result = true;
//        return result;

        return args[0] == 6 || args[args.length - 1] == 6;
    }

    public static boolean commonEnd(int[] a1, int[] a2) {
        //2. Получив 2 массива int[], a и b, возвращаем true, если они имеют один и тот же первый или последний элемент.
        // Оба массива будут длиной больше, либо равной единице.
//        boolean result = false;
//        if (a1[0] == a2[0] || a1[a1.length - 1] == a2[a2.length - 1]) {
//            result = true;
//        }
//        return result;
        return a1[0] == a2[0] || a1[a1.length - 1] == a2[a2.length - 1];
    }

    public static int[] reverse3(int[] input)   {
        //3. Дан массив длиной 3, верните новый массив с элементами в обратном порядке,
        // например {1, 2, 3} становится {3, 2, 1}.
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[output.length - i - 1] = input[i];
            // System.out.println(output[output.length - i-1]);
        }
        return output;
    }

    public static void arrayPrint(int[] input) { //для распечатки массива
        for (int element : input) {
            System.out.println(element);
        }
    }

    public static int[] middleWay(int[] a1, int[] a2) {
        //4. Получив 2 массива int[], a и b, возвращаем true, если они имеют один и тот же первый или последний элемент.
        // Оба массива будут длиной больше, либо равной единице.
        int[] output = new int[2];

        output[0] = average(a1);
        output[output.length-1] = average(a2);

        return output;
    }

    public static int average(int[] array) {
        int middle = 0;
        for (int i = 0; i < array.length; i++) {
            middle = middle + array[i];

        }
        return middle / array.length;
    }
}



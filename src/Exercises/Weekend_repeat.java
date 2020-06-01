package Exercises;

public class Weekend_repeat {
    public static void main(String[] args) {

//        System.out.println(doubleChar("The"));
//        System.out.println(doubleChar("AAbb"));
//        System.out.println(doubleChar("Hi-There"));

//        System.out.println(countCode("aaacodebbb")); //1
//        System.out.println(countCode("codexxcode")); //2
//        System.out.println(countCode("cozexxcodess code  xcope")); //4

//        System.out.println(bobThere("abcbob")); //true
//        System.out.println(bobThere("xxxb9b")); //true
//        System.out.println(bobThere("xxxbac")); //false

//        System.out.println(repeatEnd("Hello", 3));
//        System.out.println(repeatEnd("Hello", 2));
//        System.out.println(repeatEnd("Hello", 1));

//        System.out.println(evenlySpaced(2, 4, 6)); //true
//        System.out.println(evenlySpaced(4, 6, 2)); //true
//        System.out.println(evenlySpaced(4, 6, 3)); //false


        //System.out.println(makeChocolates(4, 1, 9));
        //System.out.println(makeChocolates(4, 1, 10));
        //System.out.println(makeChocolates(5, 4, 20));

//        System.out.println(closeFar(1, 2, 10));
//        System.out.println(closeFar(1, 2, 3));
//        System.out.println(closeFar(4, 1, 3));

//        int[] a1 = new int[]{1, 2, 6};
//        int[] a2 = new int[]{6, 1, 2, 3};
//        int[] a3 = new int[]{13, 6, 1, 2, 3};
//
//        System.out.println(firstLast6(a1));
//        System.out.println(firstLast6(a2));
//        System.out.println(firstLast6(a3));

//        int[] a11 = new int[]{1, 2, 3};
//        int[] a21 = new int[]{1, 2, 3};
//        int[] a31 = new int[]{1, 2, 3};
//
//        int[] b11 = new int[]{7, 3};
//        int[] b21 = new int[]{7, 3, 2};
//        int[] b31 = new int[]{1, 3};
//
//        System.out.println(commonEnd(a11, b11));
//        System.out.println(commonEnd(a21, b21));
//        System.out.println(commonEnd(a31, b31));

//        int[] a1 = new int[]{1, 2, 3};
//        printArray(reverse3(a1));

        int[] arr1 = new int[]{1, 2, 3};
        int[] arr11 = new int[]{4, 5, 6};
        int[] arr2 = new int[]{7, 7, 7};
        int[] arr21 = new int[]{3, 8, 0};
//
//        printArray(middleWay(arr1,arr11));
//        printArray(middleWay(arr2,arr21));

//        System.out.println(no23(arr1)); //false
//        System.out.println(no23(arr11)); //true

        printArray(fix23(arr1)); //1.2.0
        printArray(fix23(arr11)); //4.5.6

    }

    public static int[] middleWay(int[] c1, int[] c2) {
// arrays1-4 Даны 2 массива int, a и b, каждый длиной 3, верните новый массив с длиной 2,
// содержащий центральный элемент массива
        int[] result = {c1[c1.length / 2], c2[c2.length / 2]};
        return result;
    }

    public static boolean no23(int[] array1) {
        //arrays1-5 Given an int array length 2, return true if it does not contain a 2 or 3.

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 2 || array1[i] == 3) return false;
        }
        return true;
    }

    public static int[] fix23(int[] array) {
        //arrays1-6 Given an int array length 3, if there is a 2 in the array immediately followed by a 3,
        // set the 3 element to 0. Return the changed array.
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 2 & array[i + 1] == 3) {
                array[i + 1] = 0;
            }
        }
        return array;

    }


    public static String doubleChar(String str) {
        //String02-01
        //Given a string, return a string where for every char in the original, there are two chars.
        String result = "";
        int index = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            String temp;
            temp = str.substring(index, index + 1) + str.substring(index, index + 1);
            index++;
            result = result + temp;
        }
        return result;
    }

    public static int countCode(String strToCheck) {
        //String02-02
        //Верните, сколько раз появляется стринг "code" в данном стринге, кроме того,
        // вместо d может быть любая буква, так что "cope" & "cooe" тоже считаются
        int result = 0;
        char codeC = 'c';
        char codeO = 'o';
        char codeE = 'e';

        for (int i = 0; i < strToCheck.length(); i++) {
            if (strToCheck.charAt(i) == codeC && strToCheck.charAt(i + 1) == codeO && strToCheck.charAt(i + 3) == codeE) {
                result++;
            }
        }
        return result;
    }

    public static boolean bobThere(String str) {
        //String02-03 Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
        char symbolB = 'b';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbolB && str.charAt(i + 2) == symbolB) return true;
        }

        return false;
    }

    public static String repeatEnd(String str, int n) {
        //String 02-04 Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
        // You may assume that n is between 0 and the length of the string, inclusive.
        String result = "";
        String temp = str.substring(str.length() - n);
        for (int i = 0; i < n; i++) {
            result = result + temp;
        }
        return result;
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        //Logic-2-9 Given three ints, a b c, one of them is small, one is medium and one is large.
        // Return true if the three values are evenly spaced, so the difference between small and medium
        // is the same as the difference between medium and large.
        if ((a - b == b - c) || (a - c == c - b) || (a - b == c - a)) return true;
        return false;
    }

    public static int makeChocolates(int pcsSmallBar, int pcsLargeBar, int goalResultKilo) {
        //Logic-2-8 We want make a package of goal kilos of chocolate.
        // We have small bars (1 kilo each) and big bars (5 kilos each).
        // Return the number of small bars to use, assuming we always use big bars before small bars.
        // Return -1 if it can't be done.
        int result = 0;
        int weightLarge = 5;
        int qtyOfSmall = goalResultKilo - weightLarge * pcsLargeBar;
        if (qtyOfSmall > pcsSmallBar) result = -1;
        if (qtyOfSmall < pcsSmallBar) result = qtyOfSmall;
        if (qtyOfSmall == pcsSmallBar) result = pcsSmallBar;
        if (qtyOfSmall == 0) result = 0;
        return result;
    }

    public static boolean closeFar(int a, int b, int c) {
        //Logic-2-7 Даны три целых числа, вернуть true, если одно из них отличается от другого на 1,
        // а другое отличается от обоих на 2 и больше.
        // Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
        // while the other is "far", differing from both other values by 2 or more.
        // Note: Math.abs(num) computes the absolute value of a number.
        int ab = Math.abs(a - b);
        int bc = Math.abs(b - c);
        int ac = Math.abs(a - c);
        if ((ab == 1 && bc > 1 && ac > 1) || (bc == 1 && ab > 1 && ac > 1) || (ac == 1 && bc > 1 && ab > 1))
            return true;

        return false;
    }

    public static boolean firstLast6(int[] arr) {
        //Arrays1-1 Дан массив int. Верните true, если первый или последний элемент массива - цифра 6. Массив >= 1.
        if (arr[0] == 6 || arr[arr.length - 1] == 6) return true;
        return false;
    }

    public static boolean commonEnd(int[] a, int[] b) {
        //arrays1-2 Получив 2 массива int[], a и b, возвращаем true,
        // если они имеют один и тот же первый или последний элемент. Массивы >= 1
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) return true;
        return false;
    }

    public static int[] reverse3(int[] arr) {
        //array1-3 Дан массив длиной 3, верните новый массив с элементами в обратном порядке
        int[] output = new int[arr.length]; //инициализация нового массива такой же длинны, как данный
        for (int i = 0; i < arr.length; i++) { //обходим все элементы входящего массива
            // и их значения наоборот передаем исходящему массиву i - счетчик. "-1" - чтобы остаться в рамках массива
            output[output.length - i - 1] = arr[i];
        }
        return output;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + ", ");
        }
    }
}

package Ls35_June11;

/**
 * FirstNewVersion
 * 11.06.2020
 */
public class Ls35ExArraysRecursion {
    public static void main(String[] args) {
        //Rec-08
//        String a1 = "abc";
//        String a2 = "abcxxabc";
//        String a3 = "abcxxaba";
//        System.out.println(countAbc(a1));
//        System.out.println(countAbc(a2));
//        System.out.println(countAbc(a3));

        //Rec-09
//        String b1 = "ahixhi";//1
//        String b2 = "ahibhi";//2
//        String b3 = "xhixhi";//0
//        String b4 = "xhxh";//0
//        String b5 = "xxxxxahihi";//2
//        System.out.println(countHi2(b1));
//        System.out.println(countHi2(b2));
//        System.out.println(countHi2(b3));
//        System.out.println(countHi2(b4));
//        System.out.println(countHi2(b5));

//        //Arr02-18
//        int[] a1 = {1, 7, 7};
//        int[] a2 = {1, 7, 1, 7};
//        int[] a3 = {1, 7, 1, 1, 7};
//        System.out.println(has77(a1)); //true
//        System.out.println(has77(a2)); //true
//        System.out.println(has77(a3)); //false

        //Arr02-19
        int[] c1 = {3, 1, 3, 1, 3}; // true
        int[] c2 = {3, 1, 3, 3}; // false
        int[] c3 = {3, 4, 3, 3, 4}; // false

        System.out.println(haveThree(c1));
        System.out.println(haveThree(c2));
        System.out.println(haveThree(c3));
    }

    public static boolean haveThree(int[] array) {
        //Arr02-19 Given an array of ints, return true if the value 3 appears in the array
        // exactly 3 times, and no 3's are next to each other.
        int count = 0;
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 3 && array.length - 1 > i) {// считаем количество троек в массиве
                if (array[i + 1] != 3) {
                    count++;
                }
            }
        }
        if (array[array.length - 1] == 3 && array[array.length - 2] != 3) {
            count++;
        }
        if (count == 3) result = true;
        return result;
    }


    public static boolean has77(int[] array) {
        //Arr02-18 Given an array of ints, return true if the array contains two 7's
        //next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 7) {
                if (array[i + 1] == 7 || array[i + 2] == 7) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int countHi2(String input) {
        //Rec-09 Given a string, compute recursively the number of times lowercase "hi" appears in the string,
        // however do not count "hi" that have an 'x' immediately before them.
        String hi = "hi";
        char x = 'x';
        if (input.length() < 2) return 0;
        if (input.length() == 2) return (input.equals(hi)) ? 1 : 0;
        if (input.charAt(0) == x) {
            if (input.substring(1, 3).equals(hi)) return countHi2(input.substring(3));
            return countHi2(input.substring(1));
        }
        if (input.substring(0, 2).equals(hi)) return 1 + countHi2(input.substring(2));
        if (input.substring(1, 3).equals(hi)) return 1 + countHi2(input.substring(3));
        return countHi2(input.substring(2));
    }

    private static int countAbc(String input) {
        //Rec-08 Count recursively the total number of "abc" and "aba"
        // substrings that appear in the given string.
        String abc = "abc";
        String aba = "aba";

        if (input.length() < 3) return 0;
        String checkString = input.substring(0, 3); // оставляем три символа для проверки
        if (checkString.equals(abc) || checkString.equals(aba)) {
            return 1 + countAbc(input.substring(3));
        }
        return countAbc(input.substring(1)); //от оставшегося стринга отрезаем первый символ для проверки следующей группы символов
    }

}

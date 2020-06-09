package Sorting;

import java.util.Arrays;

/*06.06.2020*/
public class CharCocktailSorting {
    public static void main(String[] args) {
//        char[] a = {'x', 'C', 'N', '&', 'd', 'F'};
//        toPrint(sortCharArray(a));

        char[] myArray = {'"', 'T', 'e', 'l', '-', 'R', 'a', 'n', '!', '"'};
        //sortCharStr(myArray);
        toPrint(sortCharInt(myArray));

    }

    /*09.06.2020 в классе через String - not soled*/
    private static char[] sortCharStr(char[] array) {
        String myString = new String(array); // char [] to String
        //System.out.println(myString);

        for (int i = 0; i < myString.length() - 1; i++) {
            String a = myString.substring(i, i + 1).toLowerCase();
            String b = myString.substring(i + 1, i + 2).toLowerCase();

//            String c = String.valueOf(array[i]);
//            String d = String.valueOf(array[i + 1]);

            if (a.compareTo(b) > 0) { //compareTo сравнивает значение букв из Юникода
                myString = myString.substring(0, i) + b + a + myString.substring(i + 2);

            }
        }

        return array;
    }


    private static char[] sortCharInt(char[] array) {
        int[] intArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            intArray[i] = (int) array[i];

        }
        boolean unsorted = true;

        while (unsorted) {
            int count = 0; // подсчет обменов
            for (int i = 0; i < intArray.length-1; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    intArray[i] = intArray[i] + intArray[i + 1];
                    intArray[i + 1] = intArray[i] - intArray[i + 1];
                    intArray[i] = intArray[i] - intArray[i + 1];
                    count++;
                }
            }
            if (count == 0) {
                unsorted = false;
            }

//            char a = 'a';
//            String myString = "a";
//            int findDigit = myString.charAt(0);
//            char test2 = 97;
        }
        System.out.println(Arrays.toString(intArray));
        return array;
    }

    public static void myPrint(char[] array) {
        for (char value : array) {
            System.out.print((int) value + ", "); // для debugging
        }
        System.out.println();
    }


    public static char[] sortCharArray(char[] arrayCh) {
        int start = 0;
        int end = arrayCh.length - 1;
        while (start < end) {
            for (int i = start; i < end; i++) {
                if (arrayCh[i] > arrayCh[i + 1]) {
                    char temp = arrayCh[i];
                    arrayCh[i] = arrayCh[i + 1];
                    arrayCh[i + 1] = temp;
                }
            }
            end--;

            for (int j = end; j > start; j--) {
                if (arrayCh[j] < arrayCh[j - 1]) {
                    char temp = arrayCh[j];
                    arrayCh[j] = arrayCh[j - 1];
                    arrayCh[j - 1] = temp;
                }
            }
            start++;
        }
        return arrayCh;
    }

    public static void toPrint(char[] input) {
        for (char element : input) {
            System.out.print(element + ", ");
        }
    }
}


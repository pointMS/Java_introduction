package Ls26_May29;

import java.util.Arrays;

public class MultipleDimension {
    public static void main(String[] args) {
        //month();
        //schoolTable();
        //myLovelyInt();
        example();

    }
    public static void example(){
        int arr[] = {2, 2, 1, 8, 3, 2, 2, 4, 2};
// To fill complete array with a particular value
        Arrays.fill(arr, 10);
        System.out.println("Array completely filled with 10\n" + Arrays.toString(arr));
        System.out.printf("Modified arr[] : %s", Arrays.toString(arr));
    }

    public static void myLovelyInt() {
        int[][] myLittleArray = new int[5][];
        myLittleArray[0] = new int[1]; // default initialization = 0
        myLittleArray[1] = new int[2];
        myLittleArray[2] = new int[3];
        myLittleArray[3] = new int[4];
        myLittleArray[4] = new int[5];

        for (int[] veryLittleArray : myLittleArray) {
            for (int element : veryLittleArray) {
                System.out.print(element + " ");
            }
            System.out.println("");
        }
    }

    public static void month() {
        int[][] monthCalendar;
        monthCalendar = new int[4][7]; //4 - q-ty rows - высота, 7 - q-ty columns - длина
        for (int row = 0; row < monthCalendar.length; row++) {// обходим строчки
            for (int column = 0; column < monthCalendar[row].length; column++) {//[row] длина подмассива, обходим столбцы
                monthCalendar[row][column] = row * 7 + column + 1; //формула инициализации значений в строках
                System.out.print(" " + monthCalendar[row][column]);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Please print element [1][3], expect 11: " + monthCalendar[1][3]);
    }

    public static void schoolTable() {
        String[][] myArray = new String[5][3];
        myArray[0][0] = "1";
        myArray[0][1] = "Matveev";
        myArray[0][2] = "# 01912345";

        myArray[1][0] = "2";
        myArray[1][1] = "Ivanov";
        myArray[1][2] = "# 18554676";

        myArray[2][0] = "3";
        myArray[2][1] = "Petrov";
        myArray[2][2] = "# 127837612";

        myArray[3][0] = "4";
        myArray[3][1] = "Sidorov";
        myArray[3][2] = "# 046215733";

        myArray[4][0] = "5";
        myArray[4][1] = "Vasechkin";
        myArray[4][2] = "# 14974443";

        for (String[] smallArray : myArray) {
            for (String value : smallArray) {
                System.out.print(value + " ");
            }
            System.out.println("");
        }
    }
}

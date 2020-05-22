package Ls14_May12;

/**
 * First * 12.05.2020  15:05
 */
//Реализовать метод, печатающий таблицу умножения для заданного числа
public class Ls14HW_2MultTable {
    public static void main(String[] args) {

        getMultTableFor(3);
        getMultTableWhile(3);
        getMultTableDoWhile(3);

    }

    private static void getMultTableFor(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + " = " + i * n);
        }
    }

    private static void getMultTableWhile(int n) {
        int result;
        int m = 0;
        while (m <= 9) {
            m++;
            result = n * m;
            System.out.println(n + "x" + m + " = " + result);
        }
    }

    private static void getMultTableDoWhile(int n) {
        int result;
        int m = 0;
        do {
            m++;
            result = n * m;
            System.out.println(n + "x" + m + " = " + result);
        } while (m <= 9);
    }
}



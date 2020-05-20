package Ls06;

/**
 * First
 * 28.04.2020  09:36
 */
public class Lesson06Review {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Площадь прямоугольника: " + square(a, b));

        //intCompare(x, y);


    }

    public static int square(int a, int b) {
        return a * b;
    }

    public static boolean intCompare(int x, int y) {
        return x >= y && x > 0;

        //сравнение переменных через логическое значение
        //if (x > y) {
        //    return true;
        //} else {
        //    return false;
        //}

    }
}

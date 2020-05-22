package Ls08_Apr30;

/**
 * First
 * 30.04.2020  12:42
 */
//Напишите программу, которая выясняет делится число на два или нет.

public class Lesson08Check {
    public static void main(String[] args) {
        System.out.println(checkNumber(16));
    }

    public static boolean checkNumber(int number) {
        return number % 2 == 0;


    }
}

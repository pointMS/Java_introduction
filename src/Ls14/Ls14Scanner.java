package Ls14;

import java.util.Scanner;

/**
 * First * 12.05.2020  21:08
 */
public class Ls14Scanner {
    public static void main(String[] args) {
        //testNextInt();
        //testNextIntTwo();
        textNextLine();

    }

    public static void testNextInt() {
        System.out.print("Введите любое целое число от 1 до 10: ");
        Scanner input = new Scanner(System.in); // объявление сканера, импорт
        int number = input.nextInt(); // считывание числа с консоли - nextInt, число целое
        System.out.println("Вы ввели число " + number);
    }

    public static void testNextIntTwo() {
        Scanner digit = new Scanner(System.in);
        System.out.println("Введите 2 любых целых числа: ");
        int number1 = digit.nextInt(); //считывает первое число и присваивает значение в number1
        int number2 = digit.nextInt(); //считывает второе число и присваивает значение в number2
        int sum = number1+number2;
        System.out.print("Сумма чисел равна " + sum);
    }
    public static void textNextLine(){
        Scanner text = new Scanner(System.in);
        System.out.println("Введите любое слово: ");
        String text1 = text.nextLine();
        System.out.println(text1);
    }
}

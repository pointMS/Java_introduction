package Ls01_05;
/* Знакомство с базовыми типами даных
 * Определение,объявление и инициализация переменных
 * Definition, declaration, initialization
 */

public class Lesson02HelloInteger {
    public static void main(String[] args) {
        goodMorningInteger();
        //goodMorningByte();
        //goodMorningShort();
        //goodMorningLong();
    }

    public static void goodMorningDefinition() {
        int a, b, c, d, g;
        a = 1;
        b = 2;
        c = 3;
        c = c + 3;
        d = a + b + c;
        g = 5;
    }

    public static void goodMorningLong() {
        long a = 12345L;
        long b = 23456L;
        long c = 223_456_457_432_486_888L;
        System.out.println("Сумма всех переменных в методе: " + (a + b + c));
    }

    public static void goodMorningShort() {
        short firstVariable = 1000;
        short secondVariable = 15000;
        short thirdVariable = (short) (firstVariable + secondVariable);

        System.out.println("Если сложить переменную " + firstVariable
                + "\n и переменную " + secondVariable
                + "\n получится значение " + thirdVariable);

    }


    public static void goodMorningByte() {
        byte a = 10;
        byte b = 30;
        byte c = (byte) (a + b);
        System.out.println("Странный байт " + c);

        byte x = 120;
        byte y = 10;
        byte z = (byte) (x + y);
        System.out.println("Значение " + z);
// диапазон -128 до 127 - прошел по кругу
    }

    public static void goodMorningInteger() {
        // создаем переменные и присваиваем значения
        int a = 2;
        int b = 3;
        int c = a + b;
        System.out.println("Сумма переменных a и b: " + c);
        // периметр квадрата со стороной равной 4
        System.out.println("Периметр квадрата со стороной 4 равен: " + 4 * 4);
        // Площадь прямугольника со сторонами 5 и 7
        int x = 5;
        int y = 7;
        int square = x * y;
        System.out.println("Площадь прямоугольника: " + square);

    }
}
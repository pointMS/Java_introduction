package Ls01_05;

/**
 * First
 * 27.04.2020  20:26
 */
public class Lesson05printF {
    public static void main(String[] args) {
        //checkPi();
        checkMix();

    }

    public static void checkPi() {
        double Pi = Math.PI;
        System.out.println("Значение числа Pi: " + Pi);
        System.out.printf("Значение числа Пи: %.2f ", Pi);
        // знак % обозначает инструкцию форматирования, после него ставится точка
        // 2 - количество знаков после запятой
        // f - обзначение форматирования числа с плавающей точкой

    }

    public static void checkMix() {
        String username = "Maria";
        int userage = 45;
        double userbalance = 520.45;
        System.out.printf("Dear %s\n", username);
        System.out.printf("You are %d years old\n", userage);
        System.out.printf("You have %.2f EUR at your account", userbalance);

    }

}

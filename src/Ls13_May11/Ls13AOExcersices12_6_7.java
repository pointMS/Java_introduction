package Ls13_May11;

/**
 * First * 11.05.2020  10:42
 */
public class Ls13AOExcersices12_6_7 {
    public static void main(String[] args) {
        countdownText(5);
        intSwitchString(5);
        primeNumbers(2, 100);
    }

    public static void countdownText(int n) {
        //6.Реализовать метод “Обратный отсчёт” который выводит на экран цифры
        // от 5 до 1 текстом, затем выводит строку „start“.
        System.out.println("start");
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    public static String intSwitchString(int number) {
        String result = "";
        switch (number) {
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            default:
                result = "repeat insert";
        }
        return result;
    }

    //7.Напишите программу, которая выводит на консоль простые числа в промежутке от 2 до 100.
    public static void primeNumbers(int min, int max) {
        for (int i = min; i <= max; i++) {
            int count = 0;
            for (int j = min; j < i && count < 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count < 2) ;
            System.out.println(i);
        }
    }
}


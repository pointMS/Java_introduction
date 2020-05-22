package Ls12_May07;

/**
 * First * 08.05.2020  15:33
 */

public class HW12 {
    public static void main(String[] args) {
//        digitBack();
//        digitRank();
//        checkRank();
//        printLineNtimes();
//        countdown();
        //     countdownText();
        //digitMix();
//        digitMixTwo();
symbolCurAndLat();
//        makeOwnProgramm();
    }

    public static void digitBack() {
        //1.Дано целое трехзначное число. Написать метод, который возвращает число, записанное в обратном порядке
        int a = 234;
        String back = Integer.toString(a);
        System.out.println("Сама насочиняла: " + back.substring(2, 3) + back.substring(1, 2) + back.substring(0, 1));

        String back1 = "123";
        String reverse = new StringBuffer(back1).reverse().toString();
        System.out.println("Нагуглила: " + reverse);
        System.out.println("------------");
    }

    public static void digitRank() {
        //2.Дано целое трехзначное число. Написать метод, который возвращает сумму разрядов этого числа.
        //остаток от деления на 10
        int digit = 549;
        int a = digit / 10;
        int rDigit = digit % a; // остаток справа
        int b = a / 10;
        int mDigit = a % 10; // остаток середина
        int c = b / 10;
        int lDigit = b % 10; // остаток слева
        int result = rDigit + mDigit + lDigit;
        System.out.println("Сумма разрядов: " + result);
        System.out.println("------------");
    }

    public static void checkRank() {
        //3.Дано целое трехзначное число. Написать метод, который определит четность/ нечетность разрядов этого числа
        int digit = 549;
        System.out.println("Задано число " + digit);
        int a = digit / 10;
        int rDigit = digit % a; // остаток справа
        int b = a / 10;
        int mDigit = a % 10; // остаток середина
        int c = b / 10;
        int lDigit = b % 10; // остаток слева
        if (lDigit % 2 == 0) {
            System.out.println(lDigit + " - четное");
        } else {
            System.out.println(lDigit + " - нечетное");
        }
        if (mDigit % 2 == 0) {
            System.out.println(mDigit + " - четное");
        } else {
            System.out.println(mDigit + " - нечетное");
        }
        if (rDigit % 2 == 0) {
            System.out.println(rDigit + " - четное");
        } else {
            System.out.println(rDigit + " - нечетное");
        }
        System.out.println("------------");
    }

    public static void printLineNtimes() {
        //4.Реализовать метод, который выводит на экран заданную строку N раз.
        String text = "Эх, раз, еще раз!";
        int n = 3;
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
        System.out.println("------------");
    }

    public static void countdown() {
        //5.Реализовать метод(ы) “Обратный отсчёт” который выводит на экран цифры от 5 до 1, затем выводит строку „start“
        int min = 1;
        int max = 5;
        for (int i = max; i >= min; i--) {
            System.out.println(i);
        }
        System.out.println("Start!");
        System.out.println("------------");
    }

    public static void countdownText() {
        //6.Реализовать метод “Обратный отсчёт” который выводит на экран цифры от 5 до 1 текстом, затем выводит строку „start“.
        //ничего умнее не придумалось
        String number = "54321";

        //System.out.println(number.toString("5"));
        System.out.println("------------");
    }

    public static void digitMix() {
        //7.Напишите программу, которая выводит на консоль простые числа в промежутке от 2 до 100.
        int result = 0;
        int min = 2;
        int max = 100;
        for (int i = min; i < max; i++) {
            if (i == (i % 1) && i == (i % i)) {
            }
            result = i;
            result = (int) (Math.random() * (max - min) + min);
        }
        System.out.println("Случайное простое число: " + result);
        System.out.println("------------");
    }

    public static void digitMixTwo() {
        //8.Выведите в консоль N раз случайное целое число.
        //9.Запишите этот ряд чисел в строку.
        int result = 0;
        int min = 2;
        int max = 100;
        int n = 6;
        System.out.print("Ряд случайных чисел: ");
        for (int i = 0; i < n; i++) {
            result = (int) (Math.random() * (max - min) + min);
            System.out.print(result + " ");
        }
        System.out.println("\n------------");
    }

    public static void symbolCurAndLat() {
        //15.Выведите случайный символ из латиницы и кириллицы чередуя один другой
        char latMin = '\u0020';
        char latMax = '\u005A';
        char curMin = '\u0410';
        char curMax = '\u044F';
        char symbolLat = 0;
        char symbolCur = 0;
        String result = "";
        int n = 3;
        for (int i = 0; i < n; i++) {
            symbolLat = (char) ((Math.random() * (latMax - latMin) + latMin));
            result = result + symbolLat;
            symbolCur = (char) ((Math.random() * (curMax - curMin) + curMin));
            result = result + symbolCur;
            if (i % 2 == 0) {
                result = result + symbolLat + symbolCur;
            }
        }
        System.out.println(result);
        System.out.println("\n------------");
    }

    public static void makeOwnProgramm() {
        //16.Напишите программу, где вы используете минимум 5 методов
        // для данных типа String из библиотеки Oracle
        String text1 = "Однажды в студеную зимнюю пору я из лесу вышел, был сильный мороз,   ";
        String text2 = "гляжу - поднимается медленно в гору лошадка, везущая хворосту воз.";
        System.out.println(text1.trim());
        System.out.println("*** " + text1.substring(48, 65) + " ***");
        System.out.println("\n" + text1.replace("был сильный мороз", "дул прохладный ветерок"));
        System.out.println("\n*** " + text1.trim() + "\n" + text2.trim() + " ***");
        System.out.println("\n" + text2.toUpperCase());
        System.out.println("первая строка содержит " + text1.length() + " символов, вторая - " + text2.length());
        System.out.println(text2.charAt(6) + " and " + text1.charAt(4));
        System.out.println(text1.concat(text2));
        System.out.println(text1.matches("(.*)солнечным(.*)"));
        System.out.println(text1.matches("(.*)зимнюю(.*)"));


    }
}



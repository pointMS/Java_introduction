package Ls09_May04;

/**
 * First
 * 04.05.2020  17:23
 */
//Написать новый класс Calculator и метод newCalculate;
//который принимает два целых числа и оператор String ( "*", "+","-",":"),
// а возвращает операцию между этими числами. Недопустить деление на ноль.

public class homeWork09Calculator {
    public static void main(String[] args) {

        int a = 100;
        int b = -12;
//        System.out.println("Результат операции:");
//        System.out.println("- сложения: " + newCalculator(a, b, "+"));
//        System.out.println("- вычитания: " + newCalculator(a, b, "-"));
//        System.out.println("- умножения: " + newCalculator(a, b, "*"));
//        System.out.println("- деления: " + newCalculator(a, b, ":"));
//        //newCalculatorTest();
//        newCalculatorIf(a, b, "+");
        newCalculatorIfTest();

    }

    public static String avoidZeroTwo(int a, int b) {
        String tempResult = "";
        if (b == 0) {
            tempResult = "Ошибка, деление на 0 невозможно.";
        } else {
            tempResult = String.valueOf(a / b);
        }
        return tempResult;
    }

    public static String avoidZero(int digit) {

        String tempResult = Integer.toString(digit);

        if (digit == 0) {
            tempResult = "Ошибка, деление на 0 невозможно.";
        }
        return tempResult;
    }

    public static String newCalculator(int a, int b, String toDo) {
        String result = "";
        switch (toDo) {
            case "+":
                result = String.valueOf(a + b);
                break;
            case "-":
                result = String.valueOf(a - b);
                break;
            case "*":
                result = String.valueOf(a * b);
                break;
            case ":":
                result = avoidZeroTwo(a, b);
                break;
            default:
                result = "Mistake";
                break;
        }
        return result;
    }

    public static void newCalculatorTest() {
        System.out.println("Сложение, ожидаем 5 " + newCalculator(5, 0, "+"));
        System.out.println("Вычитание, ожидаем ... " + newCalculator(5, 0, "-"));
        System.out.println("Умножение, ожидаем ... " + newCalculator(5, 0, "*"));
        System.out.println("Деление, ожидаем ошибку " + newCalculator(5, 0, ":"));
    }

    public static String newCalculatorIf(int a, int b, String toDo) {
        String result = "";
        if (toDo == "+") {
            result = String.valueOf(a + b);
        } else if (toDo == "-") {
            result = String.valueOf(a - b);
        } else if (toDo == "*") {
            result = String.valueOf(a * b);
        } else if (toDo == ":") {
            result = avoidZeroTwo(a, b);
        } else {
            result = "Оператор не распознан! Help!";
        }
        return result;
    }

    public static void newCalculatorIfTest() {
        System.out.println("Сложение - ожидаем 9: " + newCalculatorIf(5, 4, "+"));
        System.out.println("Вычитание - ожидаем 1: " + newCalculatorIf(5, 4, "-"));
        System.out.println("Умножение - ожидаем 20: " + newCalculatorIf(5, 4, "*"));
        System.out.println("Деление - ожидаем ошибку: " + newCalculatorIf(5, 0, ":"));
        System.out.println("ХХХХХХ - ожидаем ошибку: " + newCalculatorIf(5, 0, "хххх"));
    }
}

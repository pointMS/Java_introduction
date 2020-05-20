package Ls11;

/**
 * First * 06.05.2020  12:09
 */

//Если клиент положил в банк 1000€ под 3,5%, какая сумма будет его ждать через семь лет? Расчет с % на %

public class BankPercent {
    public static void main(String[] args) {
        double amount = 100;
        double interest = 0.023;
        int year = 2;
        System.out.println(getPercentTwo(amount, interest, year));

    }

//    public static void bankAndMoney() {
//
//
//        //Формулу вычисления, естественно, нагуглила
//        //с double получается много знаков после запятой
//        float a, b, c, d;
//        a = 1000;
//        b = (float) 3.5;
//        c = 7;
//        d = 1 + (b / 100);
//        float result = (float) (Math.pow(d, c) * a);
//        System.out.println("\n5. Через семь лет клиент получит " + result + " евро");
//
//    }
//
//    public static void bankAndM2(double kapital, double zinsen, int years) {
//        //Если клиент положил в банк 1000€ под 3,5%, какая сумма будет его ждать через семь лет? Расчет без годовых %
//
//        //double a = zinsen * 100;
//        double result = kapital + (zinsen * 10 * years);
//        System.out.println("Без учета ежегодных процентов клент получит: " + result + " евро.");
//
//    }

    public static double getPercentTwo(double amount, double interest, int year) {
        double result = 0.0;
        result = amount;
        for (int i = 0; i < year; i++) {
            result = result + result * interest;
            System.out.println(i + 1 + " сумма за этот год  " + result);
        }
        return result;
    }
}


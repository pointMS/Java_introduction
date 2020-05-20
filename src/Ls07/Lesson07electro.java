package Ls07;

/**
 * First
 * 29.04.2020  10:59
 */

//Стоимость электроэнергии рассчитывается исходя из стоимости одного киловатт-часа в 20 центов. Базовая плата - 30€.
// В базовую плату входят 100 киловатт-часов.
// Напишите метод расчёта стоимости пользования электроэнергией.
public class Lesson07electro {
    public static void main(String[] args) {
        double userElectricityConsumption = 300.5;
        char euroSymbol = 8364;

        System.out.println("Цена за электричество: " + getMeMoneyForElectrisity(userElectricityConsumption) + euroSymbol);
        System.out.println("Цена за электричество: " + getMeMoneyForElectrisity(95) + euroSymbol);

    }

    public static double getMeMoneyForElectrisity(double userKW) {
        double moneyResult = 0.0;
        double kwPrice = 0.2;
        double basicPrice = 30.00;
        int basicKW = 100;

        if (userKW <= basicKW) {
            moneyResult = basicPrice;
        } else {
            moneyResult = basicPrice + kwPrice * (userKW - basicKW);
        }

        return moneyResult;

    }
}

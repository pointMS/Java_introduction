package Ls08;

/**
 * First
 * 30.04.2020  11:02
 */
//Реализовать метод, который принимает название валюты (например, “EUR”,”RUR”,”USD”,”GPB”) и выдает курс к доллару.
// Естественно, “USD” возвращает 1.0



public class Lesson08CurrenсyConvertor {
    public static void main(String[] args) {
        String currencyName = "GRB";
        System.out.println("Если передать кассиру " + currencyName + ", то курс к доллару - "
                + currecnyNametoExchange(currencyName));
        String rub = "RUB";
        String eur = "EUR";
        String dol = "USD";
        String greatBrit = "GRB";
        System.out.println("Rate " + rub + " to " + eur + onePaarCurrency(rub, eur));
        System.out.println(onePaarCurrency(rub, "GRB"));
        System.out.println(onePaarCurrency("USD", "EUR"));
        System.out.println("--------");

        System.out.println("Если передать две валюты и сумма одной, то плучится : " + trueExchange(eur, rub, 500));


    }

    //Используя метод из предыдущего пункта, реализовать метод, который получает пару валют и сумму в первой валюте,
// возвращает сумму во второй валюте.
    public static double trueExchange(String firstCurrency, String secondCurrency, double money) {
        return onePaarCurrency(firstCurrency, secondCurrency) * money;
    }

    //Используя метод из предыдущего пункта написать метод,
    // который принимает пару валют (“GPB”,”EUR”) и возвращает курс обмена.

    public static double onePaarCurrency(String firstCurrecny, String secondCurrency) {
        return currecnyNametoExchange(firstCurrecny) / currecnyNametoExchange(secondCurrency);

    }
    // способ передавать в свитч стринг!
    public static double currecnyNametoExchange(String cName) {
        double resultRate = 0.0;

        switch (cName) {
            case "EUR":
                resultRate = 1.1;
                break;
            case "RUB":
                resultRate = 0.015;
                break;
            case "GRB":
                resultRate = 1.25;
                break;
            case "USD":
                resultRate = 1;
                break;
            default:
                resultRate = 0.0;
                break;
        }

        return resultRate;

    }
}

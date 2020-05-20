/**
 * First
 * 02.05.2020  15:53
 */


public class TestCurrecncyConverter {
    public static void main(String[] args) {
        String currencyName = "RUB";
        System.out.println("Курс " + currencyName + " к доллару равен " + currencyNameToExchange(currencyName));

        System.out.println("Курс обмена GBP на EUR " + paarCurrency("GBP", "EUR"));

        double moneyOne = 150.0;
        System.out.println("За " + moneyOne + " евро мы получим "
                + exchangeTwoCurrency("EUR", "RUB", moneyOne) + " рублей.");

    }

    //Используя метод из предыдущего пункта реализовать метод который получает пару валют
    // и сумму в первой валюте, возвращает сумму во второй валюте
    public static double exchangeTwoCurrency(String currencyOne, String currencyTwo, double moneyOne) {
        return paarCurrency(currencyOne, currencyTwo) * moneyOne;

    }

    //Используя метод из предыдущего пункта написать метод, который принимает пару валют (“GPB”,”EUR”)
    // и возвращает курс обмена.
    public static double paarCurrency(String currencyOne, String currencyTwo) {
        return currencyNameToExchange(currencyOne) / currencyNameToExchange(currencyTwo);
    }

    //Реализовать программу “конвертер валют” Реализовать метод, который принимает название валюты
    //(например, “EUR”,”RUR”,”USD”,”GPB”) и выдает курс к доллару. Естественно, “USD” возвращает 1.0
    public static double currencyNameToExchange(String cName) {
        double rate = 0.0;
        switch (cName) {
            case "EUR":
                rate = 1.09;
                break;
            case "RUB":
                rate = 0.015;
                break;
            case "GBP":
                rate = 1.24;
                break;
            case "USD":
                rate = 1.0;
                break;
            default:
                rate = 0;
                break;
        }
        return rate;

    }

}



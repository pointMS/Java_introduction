package Ls06_Apr28;

/**
 * First
 * 28.04.2020  18:41
 */
//Написать метод, который String getStringMonth (int month),
// который принимает номер месяца, а возвращает название.
// Не забудьте проверить, что число может быть номером месяца (используя уже написаный checkMonth()),
// и если нет, вернуть «error». В main распечатать результат работы метода.

//Реализовать метод double getPercent (double amount, double interest)
// который считает указанный процент (interest) от указанного числа (amount ).
// Например getPercent (1000.0, 10.0), должно вернуть 100.
// В main распечатать результат работы метода.

public class HomeWork06_1 {
    public static void main(String[] args) {
        int month = 5;
        System.out.println("Ответ задание номер 2: " + getMonth(month));

        double amount = 285.0;
        double interest = 15.0;
        System.out.println("\nОтвет задание номер 5: " + getPercent(amount, interest) + "%");
    }

    public static String getMonth(int month) {
        String monthNumber;
        switch (month) {
            case 1:
                monthNumber = "January";
                break;
            case 2:
                monthNumber = "February";
                break;
            case 3:
                monthNumber = "March";
                break;
            case 4:
                monthNumber = "April";
                break;
            case 5:
                monthNumber = "May";
                break;
            case 6:
                monthNumber = "June";
                break;
            case 7:
                monthNumber = "July";
                break;
            case 8:
                monthNumber = "August";
                break;
            case 9:
                monthNumber = "September";
                break;
            case 10:
                monthNumber = "October";
                break;
            case 11:
                monthNumber = "November";
                break;
            case 12:
                monthNumber = "December";
                break;
            default:
                monthNumber = "not in this year!";
        }
        return monthNumber;

    }

    public static double getPercent(double amount, double interest) {
        return amount * interest / 100;
    }


}

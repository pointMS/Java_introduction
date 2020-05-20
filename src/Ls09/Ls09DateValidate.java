package Ls09;

import Ls08.Lesson08LeapYear1;

/**
 * First
 * 04.05.2020  11:12
 */
// напишите метод проверки передаваемой даты

public class Ls09DateValidate {
    public static void main(String[] args) {
        //dateCheckTest();
        //theoreticDayTest();
        //checkDayTest();
        //correctWritingDate();

    }

    public static boolean dateCheck(int day, int month, int year) {
        boolean result = false;
        result = checkDay(day, month, year) & checkMonth(month) & checkYear(year);
        return result;
    }

    public static void dateCheckTest() {
        System.out.println("Передаем 25/07/1995 " + dateCheck(25, 7, 1995) + " ожидаем true");
        System.out.println("Передаем 35/07/1995 " + dateCheck(35, 7, 1995) + " ожидаем false");
        System.out.println("Передаем 25/07/-7 " + dateCheck(35, 7, -7) + " ожидаем false");
        System.out.println("Передаем 25/15/2020 " + dateCheck(35, 15, 1995) + " ожидаем false");
        System.out.println("Передаем 29/02/2020 " + dateCheck(19, 02, 2020) + " ожидаем true, leap year");
        System.out.println("Передаем 29/02/2019 " + dateCheck(19, 02, 2019) + " ожидаем false, not leap year");


    }

    public static boolean checkDay(int day, int month, int year) {
        boolean result = false;
        if (checkYear(year) & checkMonth(month) & day > 0 & day <= theoreticDay(month, year)) {
            result = true;
        }

        return result;
    }

    public static void checkDayTest() {// проверка существования дня.
        System.out.println("Передаем дату 10/12/2020, ожидаем true " + checkDay(10, 12, 2020));
        System.out.println("Передаем дату 31/11/2018, ожидаем false " + checkDay(31, 11, 2018));
    }

    public static boolean checkMonth(int month) {
        boolean result = false;
        result = month >= 1 & month <= 12;

        return result;
    }

    public static boolean checkYear(int year) {
        boolean result;
        result = year > 0 & year < 2021;

        return result;
    }

    public static int theoreticDay(int month, int year) {//проверка максимального количества дней в месяце
        int tempDay = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                tempDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                tempDay = 30;
                break;
            case 2:
                tempDay = 28;
                break;
            default:
                tempDay = 0;
                break;

        }
        if (Lesson08LeapYear1.checkLeapYearTwo(year) & month == 2) {
            tempDay = tempDay + 1;
        }

        return tempDay;
    }

    public static void theoreticDayTest() { //проверка работы метода tempDay

        System.out.println("Передаем 02/2020, ожидаем 29 дней " + theoreticDay(2, 2020));
        System.out.println("Передаем 02/2019, ожидаем 28 дней " + theoreticDay(2, 2019));
        System.out.println("Передаем 07/2020, ожидаем 31 дней " + theoreticDay(7, 2020));
        System.out.println("Передаем 15/2020, ожидаем ошибка " + theoreticDay(15, 2020));
    }


}

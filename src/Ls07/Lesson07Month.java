package Ls07;

/**
 * First
 * 29.04.2020  10:14
 */
//Написать метод, который String getStringMonth (int month),
// который принимает номер месяца, а возвращает название.
// Не забудьте проверить, что число может быть номером месяца (используя уже написаный checkMonth()),
// и если нет, вернуть «error». В main распечатать результат работы метода.

public class Lesson07Month {
    public static void main(String[] args) {
        //int month = 14; - first solution
        //System.out.println(checkMonth1(month));

        int month = 5;
        System.out.println(getStringMonth(month));

    }

    public static String getStringMonth(int month) {
        String monthName = " ";
        if (checkMonth(month)) {
            monthName = getMeMonthName(month);
        } else {
            monthName = "mistake";
        }
        return monthName;

    }

    public static String getMeMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "not in this year!";
                break;
        }
        return monthName;
    }

    public static boolean checkMonth(int month) {
        boolean result = false;
        if (month >= 1 & month <= 12) {
            result = true;
        }
        return result;
    }

}

package Ls08_Apr30;

/**
 * First
 * 30.04.2020  12:49
 */
// * Отсюда следует распределение високосных годов:

// * год, номер которого кратен 400, — високосный;
// * остальные годы, номер которых кратен 100, — невисокосные (например, го­ды 1700, 1800, 1900, 2100);
// * остальные годы, номер которых кратен 4, — високосные.

public class Lesson08LeapYear {
    public static void main(String[] args) {
        int year = 1984;
        System.out.println("Проверка условия 1 - деление на 400: " + checkLeapYearFourHundred(year));
        System.out.println("Проверка условия 2 - деление на 4: " + checkLeapYearFour(year));
        System.out.println("Проверка условия 3 - деление на 100: " + checkLeapYearOneHundred(year));
        System.out.println("Является ли год " + year + " високосным? - " + leapYearCheck(year));

    }

    public static boolean leapYearCheck(int year) {
        boolean yearForCheck = ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
        if (yearForCheck) {
            System.out.println(year + " високосный");
        } else {
            System.out.println(year + " не високосный");
        }
        return yearForCheck;
    }

    public static boolean checkLeapYearFourHundred(int year) {
        return year % 400 == 0;
    }

    public static boolean checkLeapYearOneHundred(int year) {
        return !(year % 100 == 0);
    }

    public static boolean checkLeapYearFour(int year) {
        return (year % 4 == 0);
    }

}






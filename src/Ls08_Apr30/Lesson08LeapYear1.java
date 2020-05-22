package Ls08_Apr30;

/**
 * First
 * 03.05.2020  20:30
 */


public class Lesson08LeapYear1 {
    public static void main(String[] args) {
        //leapYearTwo(2016);
        checkleapYearOneTest();
        System.out.println("__________");
        checkleapYearTwoTest();

        //checkLeapYearTwo(int);


    }

    public static void checkleapYearTwoTest() {
        int year2000 = 2000;
        int year1900 = 1900;
        int year4 = 4;

        if (checkLeapYearTwo(year2000)) {
            System.out.println("Тестовый год " + year2000 + " успешно");
        } else {
            System.out.println("ВНИМАНИЕ! Тестовый год " + year2000 + " не успешно");
        }
        if (!checkLeapYearTwo(year1900)) {
            System.out.println("Тестовый год " + year1900 + "успешно");
        } else {
            System.out.println("ВНИМАНИЕ! Тестовый год " + year1900 + " не успешно");
        }
        if (!checkLeapYearTwo(year4)) {
            System.out.println("Тестовый год " + year4 + " успешно");
        } else {
            System.out.println((char) 27 + "[31m" + "ВНИМАНИЕ! Тестовый год " + year4 + " не успешно");
        }
        System.out.println();

        //System.out.println(checkLeapYearOne(2000));
        //System.out.println(checkLeapYearOne(1900));
        //System.out.println(checkLeapYearOne(2020));
    }

    public static boolean checkLeapYearTwo(int year) {
        int y400 = 400;
        int y100 = 100;
        int y4 = 4;

        boolean leapYearCheck;
        leapYearCheck = (year > 0) & (year % y400 == 0) ^ !(year % y100 == 0) & (year % y4 == 0);
        return leapYearCheck;
    }

    public static void leapYearTwo(int year) {
        if (year % 400 == 0) {
            System.out.println(year + " a leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " a leap year");
        } else {
            System.out.println(year + " not a leap year");
        }
    }

    public static boolean checkLeapYearOne(int year) {
        boolean resultCehck = false;
        if (year % 400 == 0) {
            resultCehck = true;
        } else if (year % 100 == 0) {
            resultCehck = false;
        } else if (year % 4 == 0) {
            resultCehck = true;
        }

        return resultCehck;

    }

    public static void checkleapYearOneTest() {
        int year2000 = 2000;
        int year1900 = 1900;
        int year4 = 4;

        if (checkLeapYearOne(year2000)) {
            System.out.println("Тестовый год " + year2000 + " успешно");
        } else {
            System.out.println("ВНИМАНИЕ! Тестовый год " + year2000 + " не успешно");
        }
        if (!checkLeapYearOne(year1900)) {
            System.out.println("Тестовый год " + year1900 + "успешно");
        } else {
            System.out.println("ВНИМАНИЕ! Тестовый год " + year1900 + " не успешно");
        }
        if (checkLeapYearOne(year4)) {
            System.out.println("Тестовый год " + year4 + " успешно");
        } else {
            System.out.println("ВНИМАНИЕ! Тестовый год " + year4 + " не успешно");
        }
        System.out.println();

        //System.out.println(checkLeapYearOne(2000));
        //System.out.println(checkLeapYearOne(1900));
        //System.out.println(checkLeapYearOne(2020));
    }
}

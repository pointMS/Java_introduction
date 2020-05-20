package Ls08;

/**
 * First
 * 30.04.2020  12:04
 */
public class Lesson08Modulo {
    public static void main(String[] args) {
        helloModulo();

//        System.out.println(findLeapYear(190));
//        System.out.println(findLeapYear(1900));
//        System.out.println(findLeapYear(2020));
//        System.out.println(findLeapYear(2019));
//        System.out.println("-------------");
//        System.out.println(findLeapYearSimple(10));
//        System.out.println(findLeapYearSimple(2020));

    }

    public static boolean findLeapYear(int year) {
        int leap = year % 4;
        if (leap == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean findLeapYearSimple(int year) {
        return year % 4 == 0;
    }

    public static void helloModulo() {
        int a = 1;
        int b = 10;
        int c = a / b; // ответ - ноль
        int d = a % b; // modulo - остаток от деления

        //System.out.println("Результат деления: " + c);
        //System.out.println("Остаток от деления: " + d);


        int f = 80; //делимое
        int ff = 13; //делитель
        int fff = f % ff; // делимое/делитель
        int rest = f - (f / ff) * ff;
        int j = 7 % 2;

        System.out.println("Делимое. делитель " + fff);
        System.out.println("Остоток деления " + rest);
    }


}


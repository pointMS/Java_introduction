package Ls13_May11;

/**
 * First * 11.05.2020  09:48
 */
public class Ls13AOExcersices12_1 {
    public static void main(String[] args) {
        System.out.println("Ожидаем 321 - " + intReverse(123));
        System.out.println("Ожидаем 867 - " + intReverse(768));
    }

    //1.Дано целое трехзначное число. Написать метод, который возвращает число,
    // записанное в обратном порядке
    public static int intReverse(int digit) {
        // x%100 = сотни / (х-сотни) %10 = десятки / (х - сотки - десятки) = единицы
        // единицы умнижить на 100, десятки на 10, сотни = новое трехзначное число наоборот

        int hundreds = 0;
        int decimal = 0;
        int units = 0;
        int n = 3;

        for (int i = 0; i > n; i++) {

        }
        hundreds = digit / 100; // variant (digit - dogit%100)/100
        System.out.println("Сотни - " + hundreds);
        decimal = (digit - hundreds * 100) / 10;
        System.out.println("Десятки - " + decimal);
        units = digit - hundreds * 100 - decimal * 10;
        System.out.println("Единицы -  " + units);

        return units * 100 + decimal * 10 + hundreds;
    }
}

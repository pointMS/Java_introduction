package Ls09;

/**
 * First
 * 04.05.2020  16:42
 */
public class Ls09WritingDate {
    public static void main(String[] args) {

        correctWritingDateTest();
    }

    public static String correctWritingDate(int day, int month, int year, String placeholder) {
        String result = "";
        String dayTemp = "";
        String monthTemp = "";
        String yearTemp = "";

        if (day < 10) {
            dayTemp = "0" + Integer.toString(day);
        } else {
            dayTemp = Integer.toString(day);
        }
        if (month < 10) {
            monthTemp = "0" + Integer.toString(month);
        } else {
            monthTemp = Integer.toString(month);
        }
        if (year < 10) {
            yearTemp = "0" + Integer.toString(year);
        } else {
            yearTemp = Integer.toString(year);
        }
        result = dayTemp + placeholder + monthTemp + placeholder + yearTemp;
        return result;

    }

    public static void correctWritingDateTest() {
        System.out.println("Если мы передаем 15/2/2020 и *, то ожидаем получить 15*02*2020 - "
                + correctWritingDate(15, 2, 2020, "*"));
        System.out.println("Если мы передаем 5/12/2020 и *, то ожидаем получить 05*12*2020 - "
                + correctWritingDate(5, 12, 2020, "*"));
    }


}

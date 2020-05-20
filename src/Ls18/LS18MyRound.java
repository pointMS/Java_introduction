package Ls18;

public class LS18MyRound {
    public static double roundDigit(double digitNumber, int index) {
        int multiplucator = 10;
        for (int i = 0; i <= index; i++) {
            i *= multiplucator;
        }
        int temp = (int) (digitNumber * Math.pow(multiplucator, index));
        double tempTwo = temp;
        return tempTwo / Math.pow(multiplucator, index);


// debug, попробовать без цикла for, разбить на небольшие задачи
    }

    public static void roundDigitNoFor() {
        double dNumber = 123.456789;
        int index = 4;
        int multiplucator = 10;

        int temp = (int) (dNumber * Math.pow(multiplucator, index));
        double result = temp / Math.pow(multiplucator, index);

        System.out.println("-------------");
        System.out.println("Result without FOR - " + result);

    }

    // обрезка лишнего в стинге
    public static void roundDigitString() {
        String digitNumber = "152.547417";
        char point = '.';
        int index;
        index = digitNumber.indexOf(point);

        System.out.println("индекс точки: " + index);
        System.out.println("обрезка до точки: " + digitNumber.substring(0, index));
        System.out.println("обрезка после точки: " + digitNumber.substring(index, 2));
    }
}

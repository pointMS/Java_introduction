package Ls13;

/**
 * First * 11.05.2020  12:07
 */
public class Ls13Modulo {
    public static void main(String[] args) {

        System.out.println(decimalToBinary(78));

    }

    public static String decimalToBinary(int d) {
        int reminder;
        String output = "";

        //while (d > 0) {
//            reminder = (d % 2);
//            output = Integer.toString(reminder) + output;
//            d = d / 2;

        for (int i = d; i > 0; i /= 2) {
            reminder = (i % 2);
            System.out.println(reminder);
            output = Integer.toString(reminder) + output;
        }
        return output;
    }
}


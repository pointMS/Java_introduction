package Ls18;

public class Ls18ConvertDigitsNew {
    public static String remainderIndex(int remainder) {
        // 11 - A
        // 12 - B
        // 13 - C
        // 14 - D
        // 15 - E
        // 16 - F
        return "";
    }

    public static String convertDecimalToAnything(int decimalDigit, int systemIndex) {
        int remainder;
        String output = "";
        while (decimalDigit > 0) {
            remainder = (decimalDigit % systemIndex);

            output = Integer.toString(remainder) + output;
            decimalDigit = decimalDigit / systemIndex;
        }
        return output;
    }

    public static int convertBinaryToDecimal(int binaryDigit) {
        int decimal = 0;
        int n = 0;
        int temp = 0;
        int systemIndex = 10;
        while (binaryDigit > 0) {
            temp = binaryDigit % systemIndex;
            decimal += temp * Math.pow(2, n);
            binaryDigit = binaryDigit / systemIndex;
            n++;
        }
        return decimal;
    }

    public static String convertDecimalToBinary(int decimal) {
        int remainder;
        String output = "";
        int systemIndex = 2;
        while (decimal > 0) {
            remainder = (decimal % systemIndex);
            output = Integer.toString(remainder) + output;
            decimal = decimal / systemIndex;
        }
        return output;
    }

    public static String convertBinaryToAnything(int binaryDigit, int systemIndex) {
        String result;
        int decimal = convertBinaryToDecimal(binaryDigit);
        result = convertDecimalToAnything(decimal, systemIndex);
        return result;
    }
}


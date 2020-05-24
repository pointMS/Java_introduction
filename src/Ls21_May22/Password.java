package Ls21_May22;

public class Password {
    public static void main(String[] args) {

        System.out.println(pwdGenerate(21));
    }

    private static String pwdGenerate(int passwordLength) {
        String myPassword = "";


        for (int i = 0; i < passwordLength; i++) {
            if (i % 2 == 0) {
                myPassword += generateLatinSymbol().toLowerCase();
            } else myPassword += generateLatinSymbol().toUpperCase();
        }
        generteDigitSymbol();
        return myPassword;
    }


    private static String generteDigitSymbol() {
        String myDigit = "";
        int temp = (int) (Math.random() * 9);
        myDigit = String.valueOf(temp);
        return myDigit;
    }

    private static String generateLatinSymbol() {
        char myLatinChar;
        myLatinChar = (char) (Math.random() * (90 - 65) + 65);
        return "" + myLatinChar;
    }
}

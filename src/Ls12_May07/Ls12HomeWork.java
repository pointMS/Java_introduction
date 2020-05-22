package Ls12_May07;

/**
 * First * 07.05.2020  11:33
 */
public class Ls12HomeWork {
    public static void main(String[] args) {
        int n = 7;
        //randomDigits(n);
        //randomSymbol(n);
        System.out.println(latineAlphabet(10));
        System.out.println(smallAndBigLetters(10));
    }

    public static void randomDigits(int n) {
        //8,9.Выведите в консоль N раз случайное целое число.
        int result = 0;
        final int MIN = 0;
        final int MAX = 100;
        for (int i = 0; i < n; i++) {
            result = (int) (Math.random() * (MAX - MIN) + MIN);
            System.out.print(result + ", ");
        }
    }

    public static void randomSymbol(int n) {
        //10,11.Выведите в консоль N раз случайный символ
        char symbol1 = 0;
        final int MIN = 0;
        final int MAX = 100;
        for (int i = 0; i < n; i++) {
            symbol1 = (char) ((Math.random() * (MAX - MIN)) + MIN);
            System.out.print(symbol1 + " ");
        }
    }

    public static int random(int min, int max) {
        int result = (int) ((Math.random() * (max - min)) + min);
        return result;
    }

    public static String latineAlphabet(int length) {
        //12.Выведите случайный символ из латиницы.
        String result = "";
        char symbol = 0;
        //final int MIN = 41;
        //final int MAX = 60;
        char MIN = '\u0041';
        char MAX = '\u005A';
        for (int i = 0; i < length; i++) {
            symbol = (char) (random(MIN, MAX));
            result = result + symbol;
        }
        return result;
    }

    public static String smallAndBigLetters(int length) {
        //13.Выведите случайный символ из латиницы чередуя строчную и прописную букву.
        String result = "";
        String convertSymbol = "";
        char symbol = 0;
        //final int MIN = 61;
        //final int MAX = 90;
        char MIN = '\u0041';
        char MAX = '\u005A';
        for (int i = 0; i < length; i++) {
            symbol = (char) (random(MIN, MAX));
            convertSymbol = String.valueOf(symbol);
            if (i % 2 == 0) {
                convertSymbol = convertSymbol.toLowerCase();
            }
            result = result + convertSymbol;
        }
        return result;
    }

}

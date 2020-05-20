package HW;

/**
 * First * 11.05.2020  14:11
 * <p>
 * Программа, которая находит: високосный год, простые числа,  чётные числа
 */
public class HW13YearAndDigits {
    public static void main(String[] args) {

        checkYear(2019);
        checkEvenNumber(16);
        //checkPrimeNumber(12, 2, 100);

    }

    public static void checkYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year " + year + " is not a leap year");
        }
    }

    public static void checkEvenNumber(int a) {
        if (a % 2 != 0) {
            System.out.println("Number " + a + " is odd");
        } else {
            System.out.println("Number " + a + " is even");
        }
    }

    /*public static void checkPrimeNumber(int n, int min, int max) {
        for (int i = min; i <= max; i++) {
            int temp = 0;
            for (int j = min; j < i && temp < 2; j++) {
                if (i % j == 0) {
                    temp++;
                }
            }
            if (temp < 2) {
                System.out.println("Number " + n + " is a prime");
            } else {
                System.out.println("Number " + n + " is not a prime");
            }
        }
    }*/
}

public class Ls19LcmLcd {
    public static void main(String[] args) {
        System.out.println(largestCommonDenomiator(15, 20));
        System.out.println(leastCommonMultiple(15, 20));

    }

    public static int leastCommonMultiple(int a, int b) {
        return a * b / largestCommonDenomiator(a, b);
    }

    public static int largestCommonDenomiator(int a, int b) {
        int result = 0;
        int minNumber; // дополнительная переменная
        if (a < b) {
            minNumber = a;
        } else {
            minNumber = b;
        }
        for (int i = 1; i < minNumber; i++) {
            if (a % i == 0 & b % i == 0) {
                result = i;
            }
        }
        return result;
    }
}

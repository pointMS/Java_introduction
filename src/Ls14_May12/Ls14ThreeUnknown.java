package Ls14_May12;

/**
 * First * 12.05.2020  10:11
 */
public class Ls14ThreeUnknown {
    public static void main(String[] args) {
        threeDigits(36);
    }

    public static void threeDigits(int n) {
        //алгоритм вывода на экран всех возможных комбинаций 3-х натуральных чисел до 36 с определенными условиями:
        //x <= y <= z
        //x*y*z = 36

        for (int x = 1; x <= n; x++) {
            for (int y = x; y <= n; y++) {
                for (int z = y; z <= n; z++) {
                    if (x * y * z == n) {
                        System.out.println("x=" + x + " y=" + y + " z=" + z);
                    }
                }
            }
        }
    }
}

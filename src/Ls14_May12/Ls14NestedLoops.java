package Ls14_May12;

/**
 * First * 12.05.2020  09:33
 */
public class Ls14NestedLoops {
    public static void main(String[] args) {
        //rectangle(5, 7);
        chess(8);
    }

    public static void chess(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (checkOdd(i) & !checkOdd(j) | !checkOdd(i) & checkOdd(j)) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println("");
        }
    }

    public static boolean checkOdd(int n) {
        return n % 2 == 0;

    }

    public static void rectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}

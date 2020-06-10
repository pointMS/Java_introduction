package Exercises;/* 10.6.2020 */

public class Ls33TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi(3, "A", "B", "C");
    }

    //with you-tube help
    public static void towerOfHanoi(int n, String a, String b, String c) {
        if (n == 1) {
            System.out.println("Move from " + a + " to " + c);

        } else {
            towerOfHanoi(n - 1, a, c, b);
            System.out.println("Move from " + a + " to " + c);
            towerOfHanoi(n - 1, b, a, c);
        }
    }
}

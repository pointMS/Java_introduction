package Ls12;

/**
 * First * 07.05.2020  09:50
 */
public class Ls12MultiplicationTable {
    public static void main(String[] args) {

        //generateMT(10);
        newMT(10);
    }

    public static void generateMT(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.printf("%4d", (i * j));
            }
            System.out.println();
        }
    }

    public static void newMT(int b) {
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print(space(i, j));
            }
            System.out.println("");
        }
    }
//создаем дополнительный стринг для распечатки
    public static String space(int c, int d) {
        if (c * d < 10) {
            return "   " + String.valueOf(c * d);
        } else if (c * d <= 100) {
            return "  " + String.valueOf(c * d);
        }
        return String.valueOf((c * d));
    }
}
package Ls14;

/**
 * First * 12.05.2020  10:00
 */
public class Ls14Floyd {
    public static void main(String[] args) {
        //floydGenerate(10);

    }

    public static void floydGenerate(int line) {
        int n = 1;
        for (int i = 1; i < line; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }


}

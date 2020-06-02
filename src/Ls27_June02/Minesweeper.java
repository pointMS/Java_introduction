package Ls27_June02;

public class Minesweeper {
    public static void main(String[] args) {
        minesweeper();
    }

    public static void minesweeper() {
        char array[][] = new char[10][10];



        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j] + " ");
            }
        }
    }
}

package Ls27_June02;

public class Minesweeper {
    public static void main(String[] args) {
        toPrint(createField(10));
    }

    public static String[][] createField(int rowColumn) {
        String[][] output = new String[rowColumn][rowColumn]; //create matrix
        String safePlace = "-";
        for (int i = 0; i < rowColumn; i++) {
            for (int j = 0; j < rowColumn; j++) {
                output[i][j] = safePlace;
            }
        }

        String bomb = "*";

        int countBomb = rowColumn * rowColumn / 10; //10% от общего количества клеток
        for (int i = 0; i < countBomb; i++) {
            int x = random(rowColumn); // rows
            int y = random(rowColumn); //columns

            int count = 0;

            while (output[x][y].equals(bomb)) { //проверяем, не попадает ли бомба в одно и тоже место
                x = random(rowColumn); // rows
                y = random(rowColumn); //columns
                count++;
            }
            output[x][y] = bomb;
            if (count > 0) {
                System.out.println("Совпали в одной клетке: " + count);
            }
        }
        return output;
    }

    public static int random(int max) {
        int min = 0;
        return (int) (Math.random() * (max - min)) + min;
    }

    public static void toPrint(String[][] arrayToPrint) {
        for (String[] elementArray : arrayToPrint) { // проверка мал. массива elementArray,
            // кот. находится в большом массиве arrayToPrint
            for (String element : elementArray) { // проверка элементов в маленьком массиве elementArray
                System.out.print(" " + element);
            }
            System.out.println("");
        }
    }
}

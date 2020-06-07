package Sorting;

public class SnowFlake {
    public static void main(String[] args) {
        
        toPrint(makeSnowflake());
    }

    public static String[][] makeSnowflake() {
        int size = 11;
        String[][] array = new String[size][size];
        String star = "*";
        String space = " ";

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == size / 2 || j == size / 2 || i == j || i + j == size - 1) {
                    array[i][j] = star;
                } else {
                    array[i][j] = space;
                }
            }
        }
        return array;
    }


    public static void toPrint(String[][] arrayToPrint) {
        for (String[] arrayInside : arrayToPrint) {
            for (String element : arrayInside) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}


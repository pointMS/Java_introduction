package Exercises;

/*01.06.2020*/
public class MultiplicationTableArray {
    public static void main(String[] args) {
        int[] table = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //mTable(table);
        thirdRow();

    }

    public static void mTable(int[] table) {
        for (int a : table) {
            for (int b : table) {
                System.out.printf("%5d", a * b);
            }
            System.out.println();
        }
    }

    public static void thirdRow() {
        //Создайте массив размерностью 5 на 6 и заполните его случайными числами (в диапазоне от 0 до 99 ).
        // Выведите на консоль третью строку
        int[][] array = new int[5][6];
        int min = 0;
        int max = 99;

        //array[0][0] = (int) (Math.random() * max);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * max);
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println("------------");
        System.out.println(array[2][0] + ", " + array[2][1]+ ", " + array[2][2]+ ", " + array[2][3]+ ", " + array[2][4]+ ", " + array[2][5]);
    //способ вывода третьей строки плохой, но другой не придумался.
    }

    public static void sumArray(){

    }
}


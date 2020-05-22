package Ls14_May12;

/**
 * First * 12.05.2020  20:29
 */
//Напишите метод, который выводит на экран квадрат с заданной стороной символами “*”
public class Ls14HW_5Square {
    public static void main(String[] args) {

        getSquareFor(5);
    }

    public static void getSquareFor(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) { //Левый верхний
                System.out.print("*");
            }
            for (int j = 0; j <= i; j++) { //Правый нижний
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

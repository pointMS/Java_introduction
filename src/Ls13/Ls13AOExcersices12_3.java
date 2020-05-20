package Ls13;

/**
 * First * 11.05.2020  10:21
 */
public class Ls13AOExcersices12_3 {
    public static void main(String[] args) {
        oddEven(123);

    }

    //3.Дано целое трехзначное число.
    // Написать метод, который определит четность/ нечетность разрядов этого числа
    public static void oddEven(int a) {
        if (a % 2 == 0) {
            System.out.println("четное");
        } else {
            System.out.println("нечетное");
        }
    }
}

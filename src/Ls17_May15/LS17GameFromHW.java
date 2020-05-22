package Ls17_May15;

import java.util.Scanner;

public class LS17GameFromHW {
    public static void startGame() {
        int min = 1;
        int max = 100;
        int k = 10;
        int randomDigit = myRandom(min, max);
        int guessDigit = 0;

        String win = "Your win!";
        String lose = "Your loser";
        String more = "The number is more ";
        String less = "The number is less ";
        String temp = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Загаданное число для проверки - " + randomDigit);
        System.out.println("Количество попыток от 3 до 10. " + "Сколько попыток вам дать?");

        k = input.nextInt();

        for (int i = 0; i < k; i++) {
            System.out.println("Введите любое число");
            guessDigit = input.nextInt();

            if (guessDigit == randomDigit) {
                temp = win;
                System.out.println(temp);
                break;
            } else if (guessDigit > randomDigit) {
                temp = less;
                System.out.println(temp);
            } else {
                temp = more;
                System.out.println(temp);
            }
        }
        System.out.println("Game is over!");
    }

    private static int myRandom(int min, int max) {
        return (int) (Math.random() * (max - min) + min);

    }
}


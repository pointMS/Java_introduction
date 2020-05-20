package HW;

import java.util.Scanner;

/**
 * First * 14.05.2020  14:28
 */
//Компьютер загадывает число от 1 до n.
//У пользователя k попыток отгадать.
//После каждой неудачной попытки компьютер сообщает меньше или больше загаданное число.
// В конце игры текст с результатом (или “Вы угадали”, или “Попытки закончились”).
public class Ls16HWGame {
    public static void main(String[] args) {
        game();
    }

    public static void game() {
        int min = 1;
        int max = 20;
        int number = (int) (Math.random() * (max - min) + min); //загаданное число
        int k = 5; //количество попыток
        int choice = 0; // выбор
        Scanner play = new Scanner(System.in);
        System.out.println("Угадайте число от " + min + " до " + max + " и у вас " + k + " попыток.");


        choice = play.nextInt();
        
        if (choice == number) {
            System.out.println("Верно, вы угадали! Конец игры!");
            for (int i = k; i < 0; i--) {
                if (choice > number) {
                    System.out.println("Загаданное число меньше.");
                    choice = play.nextInt();
                } else if (choice < number) {
                    System.out.println("Загаданное число больше.");
                    choice = play.nextInt();
                } else if (choice <= max || choice >= min) {
                    System.out.println("Это число не входит в диапазон.");
                    choice = play.nextInt();
                } else {
                    System.out.println("Все попытки исчерпаны, конец игры.");
                }
                choice++;
            }
            System.out.println("Конец игры!");
        }
    }
}


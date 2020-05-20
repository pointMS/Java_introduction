package Ls14;

/**
 * First * 12.05.2020  10:32
 */
public class Ls14While {
    public static void main(String[] args) {

        whileFromNet1();

    }

    public static void whileFromNet1() {
        int number = 3; // Возводимое в степень число
        int result = 1; // Результат возведения в степень
        int power = 1; // Начальный показатель степени
        while (power <= 10) { // условие входа в цикл
            result = result * number;
            System.out.println(number + " в степени " + power + " = " + result);
            power++;
        }
    }

}




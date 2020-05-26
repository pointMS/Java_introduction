package Ls23_May26;

public class LS23_Loops {
    public static void main(String[] args) {
        //findHappyPelmen(10);
        //findNumber(1, 100, 3);
        //findTwoDegree(1, 1000, 2);
        //findTwoDegreeNew(1, 1000, 2);
        alphabet();

    }
//08-01
//    Существует такая традиция: при приготовлении пельменей в один из них кладут монетку на счастье.
//    Считается, что тому, кому попадется пельмень с монеткой, улыбнется удача.
//    Представим, что у нас есть кастрюля, в которой лежит 10 пельменей.
//    Один из них счастливый — а именно пятый пельмень.
//    Давайте напишем программу, которая ищет счастливый пельмень.
//    Программа перебирает пельмени в кастрюле по одному,
//    и когда доходит до пятого пельменя — напишет "Вот счастливый пельмень!" и выходит из цикла.

    public static void findHappyPelmen(int number) {
        for (int i = 1; i <= number; i++) {
            if (i == 5) {
                System.out.println("You have it!");
            }
        }
    }

    //08-02
    //Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка.
    public static void findNumber(int min, int max, int checkNumber) {
        for (int i = min; i <= max; i++) {
            if (i % checkNumber == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void findTwoDegree(int min, int max, int number) {
        //Необходимо вывести на консоль такую последовательность чисел: 1 2 4 8 16 32 64 128 256 512
        int result = 0;
        int count = min;
        while (result <= max) {
            result = (int) Math.pow(number, count);
            System.out.println(result);
            count++;
        }
    }

    public static void findTwoDegreeNew(int min, int max, int number) {
        int result = 0;
        int count = min;

        do {
            result = (int) Math.pow(number, count);
            if (result > max) break;

            System.out.println(result);
            count++;
        } while (result < max);
    }

    public static void alphabet() {
        //Вывести алфавит от A-Z по 4 шт. в строку
        String az = "az"; //97-122
        int firstLetterInAlphabet, lastLetterInAlphabet;
        firstLetterInAlphabet = az.codePointAt(0);
        lastLetterInAlphabet = az.codePointAt(1);

        for (int i = firstLetterInAlphabet; i <= lastLetterInAlphabet; i++) {
            //char c = '';
        }

    }
}

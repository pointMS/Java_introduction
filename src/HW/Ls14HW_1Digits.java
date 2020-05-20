package HW;

/**
 * First * 12.05.2020  14:12
 */
//Дано два числа (a и b). Написать метод, который вернет сумму всех чисел между (a и b).
// Если a равно b, метод должен вернут a+b
//Пример: sum(2,4) -> 9
public class Ls14HW_1Digits {
    public static void main(String[] args) {
        getSumFor(5, 8);
        getSumWhile(5, 8);
        getSumDoWhile(5, 8);
    }

    public static void getSumFor(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++) {
            result = result + i;
        }
        System.out.println("Сумма чисел от А до В, способ FOR: " + result);
    }

    public static void getSumWhile(int a, int b) {
        int result = 0;
        while (a <= b) {
            result = result + a++;
        }
        System.out.println("Сумма чисел от А до В, способ WHILE: " + result);
    }

    public static void getSumDoWhile(int a, int b) {
        int result = 0;
        do {
            result = result + a++;
        } while (a <= b);

        System.out.println("Сумма чисел от А до В, способ DO WHILE: " + result);
    }
}

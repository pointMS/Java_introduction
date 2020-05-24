package Ls21_May22;

/*22.05.2020*/
public class Ls21_Recursion {
    public static void main(String[] args) {
        //System.out.println(myLovelyFactorial(7));
//        System.out.println(bunnyEars2(0)); //0
//        System.out.println(bunnyEars2(1)); //2
//        System.out.println(bunnyEars2(2)); //5

        System.out.println(count7(7177));

    }

    public static int myLovelyFactorial(int digit) {
        if (digit > 1) {
            return digit * myLovelyFactorial(digit - 1);
        } else {
            return 1;
        }
    }

    public static int bunnyEars2(int count) {
        //2. У нас есть очередь из кроликов и мы получаем количество стоящих в этой очереди кроликов.
        // У нечётных кроликов по два уха. А у чётных кроликов вроде как по три уха.
        // Это из-за того, что они все подняли ногу.
        // Посчитайте количество видимых нами "ушей".
        // Не использовать циклы или умножение.
        if (count == 0) return 0;
        else if (count == 1) return 2;
        else return 5 + bunnyEars2(count - 2); //5 сумма ушей у двух кроликов, 2 - пара кроликов
    }

    public static int count7(int n) {
        //3. Дано положительное целочисленное N. Верните количество семёрок в числе.
        // 717 - вернёт 2.
        // Обратите внимание, что модуло 10 даёт вам правую цифру(126 % 10 = 6),
        // а деление на 10 удалит правую цифру(126 / 10 = 12).
        if (n == 0) return 0;
        else if (n % 10 == 7) return 1 + count7(n / 10);
        return count7(n/10);
    }
}

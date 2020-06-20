package Ls17_May15;

import java.util.Scanner;

public class Ls17ConvertDigits {
    // двоичные в десятичные
    public static void binaryToDecimal() {
        String binary = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Insert your number");
        binary = input.next();

        int result = 0;
        for (int i = 0; i < binary.length(); i++) {
            result += Math.pow(2, i) * (binary.charAt(i) == '1' ? 1 : 0);
            }
        System.out.println(result);
        }

 /* кол-во символов в бинарном числе N - .length - принимаем стринг
 стринг раскладываем на символы, проверяем 1 или 0 - модуло
 начиная с N - максимальная степень двойки в формуле
1 * 2^5 + 1 * 2^4 + 0 * 2^3 + 0 * 2^2 + 0 * 2^1 + 1 * 2^0 = 49
  */

    public static void testMethod() {
        String test = "0757";
        int decimalTest = Integer.parseInt(test, 8);
        System.out.println(decimalTest);
    }
}

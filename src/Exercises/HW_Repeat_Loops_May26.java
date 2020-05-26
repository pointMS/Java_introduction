package Exercises;

public class HW_Repeat_Loops_May26 {
    public static void main(String[] args) {
        System.out.println(writeBack(123456));
        System.out.println(countRank(123456)); // 21

    }

    //08Loop-07. Дано целое число. Написать метод, который возвращает число, записанное в обратном порядке: 1234 -> 4321
    public static String writeBack(int number) {
        String newNumber = String.valueOf(number);
        String result = "";
        for (int i = 0; i < newNumber.length(); i++) {
            result = newNumber.charAt(i) + result;
        }
        return result;
    }

    //08Loop-08.Дано целое число. Написать метод, который возвращает сумму разрядов этого числа: 1234 -> 10  (1+2+3+4)
    public static int countRank(int number) {
        String temp = String.valueOf(number);
        int result = 0;
        for (int i = 0; i <= temp.length(); i++) {
            result = result + number % 10;
            number = number / 10;
        }
        return result;
    }
}

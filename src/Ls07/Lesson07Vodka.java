package Ls07;

/**
 * First
 * 29.04.2020  12:21
 */
public class Lesson07Vodka {
    public static void main(String[] args) {
        int age = 10;
        checkAge(10);
        checkAge(18);
        checkAge(21);
        checkAge(30);

    }

    public static void checkAge(int age) {
        if (age < 16) {
            System.out.println("Покупателю " + age + "лет. Товары для взрослых продавать запрещено.");
        } else if (age > 18) {
            System.out.println("Покупателю " + age + "лет. Можно продавать любые товары для взрослых");
        } else {
            System.out.println("Покупателю " + age + "лет. Можно продавать все, кроме крепких спиртных напитков");
        }
    }
}

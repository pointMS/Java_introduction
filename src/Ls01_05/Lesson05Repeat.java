/**
 * First
 * 27.04.2020  10:06
 */
public class Lesson05Repeat {
    public static void main(String[] args) {
        tryNotCry();

    }

    public static void tryNotCry() {
        String name = "Petya Vasechkin";
        name = name.replace('V', 'W'); // замена символа
        System.out.println(name);

        char symbol = name.charAt(8);
        System.out.println("Восьмой символ - " + symbol);

        int symbol1 = name.codePointAt(2); // вывод номера в таблице юникода
        System.out.println(symbol1);


    }
}

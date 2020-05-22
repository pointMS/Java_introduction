package Ls01_05;

/**
 * First
 * 24.04.2020  14:16
 * <p>
 * Найти в интернете таблицы для типа данных char.
 * символ стандартного смайлика, телефона, параграфа, копирайта(C), торговой марки(тм), рубля, евро, доллара, знаков зодиака, шахмат, червы
 * Что будет, если сложить переменную String с самой собой? Можно ли умножить её на саму себя? Почему?
 * Вывести на экран сообщение в кавычках. Например собственное имя + "профессия".
 * Вывести на экран построчно анкетные данные: Имя, Фамилия, Адрес, Улица и тд и тп. Пример вывода одной строчки:
 * Вырезать из выражения "Вход разрешён" последние 8 символов и добавить "воспрещён"
 * Вывести на экран "Осторожно, вход воспрещён" заглавными буквами.
 */
public class HomeWork04 {
    public static void main(String[] args) {
        charSelection();
        addStringCheck();
        nameProfession();
        anketa();
        cutAndInsert();
        bigLetters();

    }

    public static void charSelection() {
        //Найти в интернете таблицы для типа данных char

        char symbol1 = '\u263B';
        char symbol2 = '\u2248';
        char symbol3 = '\u263C';
        char symbol4 = '\u2122';
        char symbol5 = '\u2736';
        char symbol6 = '\u266B';
        char symbol7 = '\u263A';

        System.out.println(symbol1 + " " + symbol7 + " and: " + symbol2 + " plus: " + symbol3 + " and one more: " + symbol5);
        System.out.println(symbol2);
        System.out.println(symbol3);
        System.out.println(symbol4);
        System.out.println(symbol5);
        System.out.println("Вместо телефона (не нашла): " + symbol6);

    }

    public static void addStringCheck() {
        //Что будет, если сложить переменную String с самой собой? Можно ли умножить её на саму себя? Почему?

        String text1 = "Все стало вокруг голубым и зеленым, ";
        String text2 = "В ручьях забурлила, запела вода";
        String textres1 = text1 + text2; // опрерация сложения выводит оба стринга подряд - склеивает
        //String textres2 = text1 * text2; // операция умножения выдает ошибку, потому что математические действия с текстом производить нельзя

        System.out.println("\n" + textres1);
        //System.out.println(textres2);

    }

    public static void nameProfession() {
        //Вывести на экран сообщение в кавычках. Например собственное имя + "профессия"

        String name = "Maria Sekacheva";
        String profession = "beginner programmer";
        char symbol = '\"';
        System.out.println("\n" + name + " " + symbol + profession + symbol);
    }

    public static void anketa() {
        //Вывести на экран построчно анкетные данные: Имя, Фамилия, Адрес, Улица и тд и тп

        String firstName = "Глаша";
        String secondName = "Петрова";
        String town = "Москва";
        String street = "Пушкинская";
        int house = 15;
        int flat = 30;
        System.out.println("\n - Имя пользователя: " + firstName);
        System.out.println(" - Фамилия пользователя: " + secondName);
        System.out.println(" - Город: " + town);
        System.out.println(" - Улица: " + street);
        System.out.println(" - Номер дома: " + house);
        System.out.println(" - Квартира: " + flat);

    }

    public static void cutAndInsert() {
        //Вырезать из выражения "Вход разрешён" последние 8 символов и добавить "воспрещён"

        String text = "Посторонним вход воспрещен";
        text = text.substring(0, 17);
        String text1 = "разрешен :)";
        System.out.println("\n" + text + text1);

    }

    public static void bigLetters() {
        //Вывести на экран "Осторожно, вход воспрещён" заглавными буквами

        String text = "Осторожно! Опасная зона!";
        String text1 = text.toUpperCase();
        String text2 = "Osorozno".toUpperCase(); //short variant
        System.out.println("\n" + text1);
        System.out.println("\n" + text2);
    }

}

package HW;

/**
 * First
 * 27.04.2020  18:32
 */
public class HomeWork06Switch {
    public static void main(String[] args) {
        //программу действий кассира магазина. Если у него пытаются купить алкоголь 5 покупателей: 10, 17, 18, 20 и 30 лет
        int age = 18;
        System.out.println(alkohol(age));
        // мне кажется, что решение не правильное, потому что должен быть критерий больше/меньше,
        // но в голову ничего не пришло
    }

    public static String alkohol(int age) {
        String shopping;
        switch (age) {
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
                shopping = "Alkohol selling is not allowd";
                break;
            case 18:
                shopping = "Please let me see your passport";
                break;
            case 19:
            case 20:
            case 30:
                shopping = "Yes, please";
            default:
                shopping = "mistake";
        }
        return shopping;

    }
}

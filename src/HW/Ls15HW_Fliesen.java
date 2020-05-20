package HW;

import java.util.Scanner;

/**
 * First * 13.05.2020  14:22
 */
//
// в час он кладёт примерно 1 кв метр плитки.
// Его час стоит 27€ без НДС.
// Стандартная плитка 30 на 20 сантиметров. a*b
//
// Количество требуемых плиток, как целых, так и тех, которые надо будет резать.
// Учтите, что плитку можно класть как вдоль, так и поперёк и только на месте мастер узнает, как именно её надо класть.
// Стоимость материала
// Стоимость рабочего времени
// Итоговую ориентировочную стоимость

public class Ls15HW_Fliesen {
    public static void main(String[] args) {
        double size1 = 0.3;
        double size2 = 0.2;
        double price = 27.0; // for one hour
        double teilPrice = 13.0;
        double x = 5.0; // длина помещения
        double y = 3.0; // ширина

        getTileSize(size1, size2);
        System.out.println("Площадь помещения, кв.м " + getRoomSize(x, y));

        System.out.println("Всего целых плиток, шт.: " + tileQty(getRoomSize(x, y), getTileSize(size1, size2)));
        System.out.println("Штук в 1 кв.м: " + totalForOneMetr(getTileSize(size1, size2)));
        System.out.println("Время на укладку, часов: " + hoursForWork(totalForOneMetr(getTileSize(size1, size2)),
                tileQty(getRoomSize(x, y), getTileSize(size1, size2))));
        System.out.println("Стоимость работы с НДС, EUR: " + priceForWork(price, hoursForWork(totalForOneMetr(getTileSize(size1, size1)),
                tileQty(getRoomSize(x, y), getTileSize(size1, size2)))));
        System.out.println("Стоимость плитки, EUR: " + priceForTeils(teilPrice, tileQty(getRoomSize(x, y), getTileSize(size1, size2))));
        System.out.println("Расчетная стоимость работы и материала, EUR: "
                + totalAmount(priceForWork(price, hoursForWork(totalForOneMetr(getTileSize(size1, size1)),
                tileQty(getRoomSize(x, y), getTileSize(size1, size2)))),
                priceForTeils(teilPrice, tileQty(getRoomSize(x, y), getTileSize(size1, size2)))));

        System.out.println("\n*** scanner ***\n");

        System.out.println("Введите длину помещения: ");
        Scanner input = new Scanner(System.in);
        x = input.nextDouble();
        System.out.println("Введите ширину помещения: ");
        y = input.nextDouble();
        System.out.println("Введите стоимость выбранной плитки за 1 шт.: ");
        teilPrice = input.nextDouble();
        System.out.println("Общая площадь: " + getRoomSize(x, y));
        System.out.println("Стоимость плитки, EUR: " + priceForTeils(teilPrice, tileQty(getRoomSize(x, y), getTileSize(size1, size2))));
        System.out.println("Расчетная стоимость работы и материала, EUR: " + totalAmount(priceForWork(price, hoursForWork(totalForOneMetr(getTileSize(size1, size1)),
                tileQty(getRoomSize(x, y), getTileSize(size1, size2)))),
                priceForTeils(teilPrice, tileQty(getRoomSize(x, y), getTileSize(size1, size2)))));

    }

    public static double getTileSize(double size1, double size2) {// размер 1 плитки
        double sizeOnePcs = size1 * size2;
        return sizeOnePcs;
    }

    public static double getRoomSize(double x, double y) {//размер помещения
        double roomSize = x * y;
        return roomSize;
    }

    public static int tileQty(double getRoomSize, double getTileSize) {// кол-во плитки на помещение + запас 5%
        return (int) Math.ceil((getRoomSize / getTileSize) * 1.05);
    }

    public static int totalForOneMetr(double getTileSize) {// штук в 1 кв.м
        return (int) Math.ceil(1 / getTileSize);
    }

    public static float hoursForWork(int totalForOneMetr, int tileQty) {// время на укладку нужного кол-ва плитки
        return (float) tileQty / totalForOneMetr;
    }

    public static double priceForWork(double price, float hoursForWork) {
        return Math.ceil(hoursForWork * price * 1.19);
    }

    public static double priceForTeils(double teilPrice, int tileQty) {
        return (double) tileQty * teilPrice;
    }

    public static double totalAmount(double priceForWork, double priceForTeils) {
        return (double) priceForWork + priceForTeils;
    }

}

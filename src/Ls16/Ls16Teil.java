package Ls16;

/**
 * First * 14.05.2020  09:44
 * плитка еще раз из урока 15
 */
public class Ls16Teil {
    static double speed = 1.0;
    static double oneHourPayment = 27;
    static double highTile = 30;
    static double wigthTile = 10;

    static double roomPayment = 0;
    static double workHourPayment = 0;
    static double roomTeilMaterialCost = 0;
    static int tileCountMin = 0;
    static int tileCountMinInt = 0;
    static int tileCountMinAll = 0;
    static int tileCountMinBroken = 0;
    static int tileCountMaxInt = 0;
    static int tileCountMaxAll = 0;
    static int tileCountMaxBroken = 0;



    static int tileCountMax = 0;


    public static void customerInfo(double h, double w, double teilPriceUnit) {
        h *= 100; // перевод в см
        w *= 100;
        countTile(h, w);
        countBrokenTeil(h, w);
        tileCountMinInt = countTile(h,w);
        tileCountMinBroken = countBrokenTeil(h,w);
        tileCountMinAll = tileCountMinInt + tileCountMinBroken;

        tileCountMaxInt = countTile(w,h);
        tileCountMaxBroken = countBrokenTeil(w,h);
        tileCountMaxAll = tileCountMaxInt + tileCountMaxBroken;


        System.out.println("Итоговая стоимость работ по укладке: " + roomPayment);
        System.out.println("Стоимость рабочего времени " + workHourPayment);
        System.out.println("Стоимость материала " + roomTeilMaterialCost);
        System.out.println("При раскладке вдоль: целых плиток " + tileCountMinAll + " из них целых "+ tileCountMinInt + " поломаных "+ tileCountMinBroken);
        System.out.println("При раскладке поперек: целых плиток " + tileCountMaxAll + " из них целых "+ tileCountMaxInt + " поломаных "+ tileCountMaxBroken);

        System.out.println("Расчетное количество плитки:  от " + tileCountMinAll + " до " + tileCountMax);
    }

    private static int countTile(double h, double w) {
        int along = 0;
        int across = 0;

        across = (int) (w / wigthTile); // full teils
        along = (int) (h / highTile);
        //System.out.println("Промежуточное значение целых плиток " + across * along);
        return across * along;

    }

    private static int countBrokenTeil(double h, double w) {
        int along = 0;
        int across = 0;

        across = (int) Math.ceil(w / wigthTile);
        along = (int) Math.ceil(h / highTile);
        System.out.println("Округленное количество всех плиток " + along * across);


        return along * across - countTile(h,w);


    }

}

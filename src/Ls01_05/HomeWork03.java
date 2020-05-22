package Ls01_05;

/*
Найти длину окружности.
Написать формулу вычисления стоимости Евро, если курс Евро к Доллару 1,1.
Найти соотношение площади Беларуси к площади Украины.
Найти, во сколько раз площадь Москвы больше площади Берлина.
Если клиент положил в банк 1000€ под 3,5%, какая сумма будет его ждать через семь лет?
Через первую трубу бассейн можно наполнить за 20 ч, а через вторую — за 30 ч. За сколько часов наполнится бассейн через обе эти трубы?
 */

public class HomeWork03 {
    public static void main(String[] args) {
        curcleLength();
        double usd = 73.45;
        euroAndUsd(usd);

        final int BLR = 207595;
        final int UKR = 603628;
        squareBlrAndUkr(BLR, UKR);
        moscowAndBerlin(2511, 892);
        bankAndMoney();
        bankAndM2(1000, 3.5, 7);
        swimmingPool();

    }

    // вопрос - как округлить значение результата до двух знаков после запятой? или это можно регулировать выбором double / float?

    public static void curcleLength() {
        //Найти длину окружности.

        final double PI = 3.14; //константа - всегда с большой буквы
        double r = 20;
        double lenth = 2 * PI * r;
        System.out.println("1. Длина окружности равна " + lenth);
    }

    public static void euroAndUsd(double usd) {
        //Написать формулу вычисления стоимости Евро, если курс Евро к Доллару 1,1. Вариант с переносом переменной
        double result = usd * 1.1;
        System.out.println("\n2. Курс EURO на сегодня составляет: " + result);
    }

    public static void squareBlrAndUkr(double blr, double ukr) {
        //Найти соотношение площади Беларуси к площади Украины. Вариант с переносом переменной
        double r = ukr / blr;
        System.out.println("\n3. Площадь Украины больше площади Белоруссии в " + r + " раз");
    }

    public static void moscowAndBerlin(double mos, double ber) {
        //Найти, во сколько раз площадь Москвы больше площади Берлина
        double r = mos / ber;
        System.out.println("\n4. Площадь Москвы больше площади Берлина в " + r + " раз");

    }

    public static void bankAndMoney() {
        //Если клиент положил в банк 1000€ под 3,5%, какая сумма будет его ждать через семь лет? Расчет с % на %

        //Формулу вычисления, естественно, нагуглила
        //с double получается много знаков после запятой
        float a, b, c, d;
        a = 1000;
        b = (float) 3.5;
        c = 7;
        d = 1 + (b / 100);
        float result = (float) (Math.pow(d, c) * a);
        System.out.println("\n5. Через семь лет клиент получит " + result + " евро");

    }

    public static void bankAndM2(double kapital, double zinsen, int years) {
        //Если клиент положил в банк 1000€ под 3,5%, какая сумма будет его ждать через семь лет? Расчет без годовых %

        //double a = zinsen * 100;
        double result = kapital + (zinsen * 10 * years);
        System.out.println("Без учета ежегодных процентов клент получит: " + result + " евро.");

    }

    public static void swimmingPool() {
        //Через первую трубу бассейн можно наполнить за 20 ч, а через вторую — за 30 ч.
        // За сколько часов наполнится бассейн через обе эти трубы?

        // пробовала с double & float. С double получается 11.9999... float по-другому считает?
        float tube1, tube2;
        tube1 = 20F;
        tube2 = 30F;
        float res = (1 / tube1) + (1 / tube2);
        float result = 1 / res;
        System.out.println("\n6. Через обе трубы одновременно бассейн наполнится за " + result + " часов");
    }

}

package Ls06_Apr28;

/**
 * First
 * 28.04.2020  10:36
 */
public class Lesson06Geometry {
    public static void main(String[] args) {
        //int a = 12;
        //int b = 23;
        //System.out.println("Задача номер 1 ответ: " + number1(a, b));

        double side1 = 0.4; // длина стороны куба, перевод в метры
        double diameter = 0.58;
        double base = 0.20; //основание пирамиды
        double side2 = 0.30; //длина ребра пирамиды
        double baseL = 0.80; // ящик
        double baseH = 0.30;
        double baseW = 0.20;
        double consumption = 0.60; // литры
        double paintConsumptionForMeter = 0.06; // литры на один метр
        double priceBallon = 7.0; // EUR 1 ballon
        double volumeBallon = 0.40; // litr

        double aCube = areaCube(side1);
        double aSputnik = areaSpytnik(diameter);
        double aPyramide = areaPyramide(base, side2);
        double aBox = areaBox(baseW, baseH, baseL);
        double aSum = areaSum(aCube, aPyramide, aBox, aSputnik);

        double allPaintForAllSquare = paintCalculation(aSum, paintConsumptionForMeter);
        double literPrice = paymentForLiter(priceBallon, volumeBallon);
        double paintCost = amount(literPrice, allPaintForAllSquare);
        int sprayingResult = sprayingQuantity(allPaintForAllSquare, volumeBallon);


        System.out.println("Площадь куба: " + aCube);
        System.out.println("Площадь сферы: " + aSputnik);
        System.out.println("Площадь пирамиды: " + aPyramide);
        System.out.println("Площадь ящика (параллелепипед): " + aBox);
        System.out.println("Если площадь всех фигур равна " + aSum +
                " метров, а расход краски " + paintConsumptionForMeter +
                " за один метр, то расход краски: " + allPaintForAllSquare);
        System.out.println("Стоимость литра краски в евро: " + literPrice);
        System.out.println("Краска как бы стоит, если не считать, что надо купить балон " + paintCost + "€");
        System.out.println("Итого, балонов: " + sprayingResult +
                " Директору нужно выдать столько денег на покраску: " + priceBallon * sprayingResult);


    }

    public static boolean number1(int a, int b) {
        //Даны два целых числа. Верните true, если одно из этих чисел находится в диапазоне от 10 до 20 включительно
        return a >= 10 & a <= 20 | b >= 10 & b <= 20;

    }

    //Диаметр сферы 58см.
    //куб со стороной 40см.
    //пирамида c основанием 20см и боковыми рёбрами 30см
    //чёрный ящик с размерами 80см30см20с
    //на один кв. метр надо 60мл краски, а балончик 400мл стоит 7€

    public static double areaCube(double side1) {
        double areaCube = (Math.pow(side1, 2) * 6);
        return areaCube;

    }

    public static double areaSpytnik(double diameter) {
        final double PI = 3.14;
        return Math.pow(diameter / 2, 2) * 4 * PI;
        // расчет площади сферы

    }

    public static double areaPyramide(double base, double side2) {
        double high = Math.sqrt(side2 * side2 - base * base / 4); // квадратный корень, расчет высоты треугольника
        double areaThreangler = (base * high) / 2;
        double areaBasePyramide = Math.pow(base, 2);
        return areaBasePyramide + 4 * areaThreangler;
        // расчет площади пирамиды в два этапа - основание и треугольники

    }

    public static double areaBox(double w, double h, double l) {
        return 2 * (w * h + h * l + w * l);

    }

    public static double areaSum(double sputnik, double pyramide, double cube, double box) {
        double areaSum = sputnik + pyramide + cube + box;
        return areaSum;
    }

    public static double paintCalculation(double square, double consumption) {
        // принимаем метры, высчитываем литры
        return square * consumption;

    }

    public static int sprayingQuantity(double paintQantity, double sprayingVolume) {
        // чтобы узнать количество балончиков
        // нам нужно количество краски поделить на вместимость балончика
        return (int) Math.ceil(paintQantity / sprayingVolume);
    }

    public static double paymentForLiter(double priceBalon, double volumeBalon) {
        // рассчитываем цену литра краски
        // для этого цену за балончик делим на его объём
        return priceBalon / volumeBalon;
    }

    public static double amount(double priceForLiter, double paintFlow) {
        // рассчитывается стоимость краски, которая нужна на покраску поверхностей
        // количество краски умножить на её стоимость
        return priceForLiter * paintFlow;
    }

}


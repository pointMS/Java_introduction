package Ls01_05;

/*
 * Найти площадь и периметр квадрата
 * Найти площадь и периметр прямоугольника
 * Найти площадь и периметр куба
 * Найти количество зёрен на шахматной доске, если на первую клетку положить одно зёрнышко,
    на вторую клетку два зёрнышка, на третью в два раза больше, чем на предыдущей, то есть четыре и так далее.
 */

public class HomeWork02 {
    public static void main(String[] args) {
        hw02SquareAreaAndPerimetr();
        hw02RectangleAreaAndPerimetr();
        hw02CubeAreaAndPerimetr();
        hw02ChessAndCorns();
    }

    public static void hw02SquareAreaAndPerimetr() {
        //Найти площадь и периметр квадрата
        byte a = 5;
        byte area = (byte) (a * 2);
        byte perimetr = (byte) (a * 4);
        System.out.println("Площадь квадрата равна " + area);
        System.out.println("Периметр квадрата равен " + perimetr);

    }

    public static void hw02RectangleAreaAndPerimetr() {
        //Найти площадь и периметр прямоугольника
        short b = 30;
        short c = 45;
        short arear = (short) (b * c);
        short perimetrr = (short) ((b + c) * 2);
        System.out.println("\nПлощадь прямоугольника равна " + arear);
        System.out.println("Периметр прямоугльника равен " + perimetrr);
        System.out.println("Площадь прямоугольника равна " + arear + ", а периметр - " + perimetrr);

    }

    public static void hw02CubeAreaAndPerimetr() {
        //Найти площадь и периметр куба
        int d = 250;
        int areac = (int) ((d * d) * 6);
        int perimetrc = (int) (d * 12);
        System.out.println("\nПлощадь куба равна " + areac);
        System.out.println("Пеример куба равен " + perimetrc);

    }

    public static void hw02ChessAndCorns() {
        //Найти количество зёрен на шахматной доске, если на первую клетку положить одно зёрнышко,
        //    на вторую клетку два зёрнышка, на третью в два раза больше, чем на предыдущей, то есть четыре и так далее

        // формула (2 в степени 64) - 1. Как поставить степень? Символ ^ а java не работает. Задание не могу выполнить, просьба разобрать завтра на занятии.
        long n = 1L;
        long m = 64;
        long corns = (long) (n^m);
        System.out.println("\nОбщее количество зерен на шахматной доске равно: " + corns + ", но это неправильный ответ :)");
    }
}

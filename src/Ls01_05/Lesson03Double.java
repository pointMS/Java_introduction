public class Lesson03Double {
    public static void main(String[] args) {
        //addFloat();
        doubleDivision();
        intDivision();
        //halloPi();
        //magicNumber();


    }

    public static void magicNumber() {
        int var1 = 55;
        int var2 = 12;
        int var3 = var1 / var2;

        double var4 = 5.0;
        double var5 = 2.0;
        double var6 = var4 / var5;
        double var7 = var1 / var2;

        double var25 = var1 / var4;

        System.out.println("Int Var3 = " + var3);
        System.out.println("double var6 = " + var6);
        System.out.println("double Var7 = " + var7);
        System.out.println("double Var25 = " + var25);

        int var11 = (int) (var1 / var4);

        System.out.println("Int Var11 = " + var11);
        System.out.println("Magic " + 5.0 / var2);

    }

    public static void halloPi() {
        final double PI = 3.14;
        //final используется для финализации переменной, тепреь переменной PI нельзя присводить другое занчение
        double r = 1000000.0;
        double square = PI * r * r;
        System.out.println("Площадь круга равна :" + square);

    }

    public static void doubleDivision() {
        double a, b, c;
        a = 1;
        b = 10;
        c = a / b;
        System.out.println("Result double division: " + c);

    }

    public static void intDivision() {
        int a, b, c;
        a = 1;
        b = 10;
        c = a / b;
        System.out.println("Result integel division: " + c);

    }

    public static void addFloat() {
        // различные способы написания

        float a = 3.5f;
        float b = 4.5F;
        float c = (float) 5.5;
        float d = a + b + c;
        System.out.println("a + b + c: " + d);
    }


}



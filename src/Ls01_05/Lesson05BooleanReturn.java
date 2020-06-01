package Ls01_05;

/**
 * First
 * 27.04.2020  11:25
 */
public class Lesson05BooleanReturn {
    public static void main(String[] args) {
        //myBoolean();
        //yourNotMe();
        //System.out.println("Icecream: " + yourOrMe());
        //System.out.println("Officers with keys: " + yourAndMe());
        //System.out.println("Perfect holidays only: " + vacation());
        //newBoolean();
        example();
    }

    public static void example() {
        boolean a = (7 + 8) * 5 > 7 + 8 * 5;
        boolean b = (7 + 8) * 4 != 7 + 4 * 5;
        boolean c = 3 + 4 > 9 + 1 & 16 - 5 > 3 * 4;
        boolean d = false & true | false ^ true;
        boolean e = 16 / 2 < 6 + 2 | 4 + 5 <= 4 * 5;
        boolean f = !(3 * 4 < 7 + 8);
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f);
    }

    public static void newBoolean() {
        boolean a, b, c;
        a = true;
        b = false;
        c = a & b;
        System.out.println(c); // returns false because only one of the two required values​is true

        int d = 1, f = 2;
        boolean bool = d <= f;

        int i = 10;
        int j = 9;
        System.out.println(i > j); // returns true, because 10 is higher than 9

        System.out.println(10 == 15); // returns false, because 10 is not equal to 15

        int x = 10;
        System.out.println(x == 10); // returns true, because the value of x is equal to 10
    }


    public static boolean vacation() {
        boolean alpen = true;
        boolean oma = false;
        boolean iAmHappy = alpen ^ oma;
        return iAmHappy;

    }

    public static boolean yourAndMe() {
        boolean officerOne = false;
        boolean officerTwo = true;
        boolean result = officerOne & officerTwo;
        return result;

    }

    public static boolean yourOrMe() {
        boolean papa = true;
        boolean mama = false;
        boolean son = papa | mama;

        return son;

    }

    public static void yourNotMe() {
        boolean a = true;
        boolean b = !a; // not equal a
        System.out.println(b);

    }

    public static void myBoolean() {
        int a = 1;
        int b = 2;

        boolean boolTwo = false;
        boolean boolThree = true;
        boolean boolOne = a <= b;
        boolean boolFour = a >= b;
        System.out.println(boolOne);
        System.out.println(boolFour);

    }


}

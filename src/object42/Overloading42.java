package object42;

/**
 * FirstNewVersion
 * 19.06.2020
 */
public class Overloading42 {
    public static void main(String[] args) {
        int a = 10;
    myPrint(a);
    }

    private static void myPrint(int digit) {
        System.out.println("print for digit");
    }
    private static void myPrint() {
        System.out.println("just print");
    }
    private static void myPrint(String s, int digit) {
        System.out.println("print with string and digit");
    }
}

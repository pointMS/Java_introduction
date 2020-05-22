package Ls07_Apr29;

/**
 * First
 * 29.04.2020  11:54
 */
public class Lesson07IfElse {
    public static void main(String[] args) {
        boolean permission = false;
        vacation(permission);

        double speed = 5.0;
        spaceShutle(speed);
    }

    public static void spaceShutle(double speed) {
        final double SuperConstatnt_G = 9.8;
        if (speed < SuperConstatnt_G) {
            System.out.println("Ускорение недостаточно, ракета не может стартовать");
            System.out.println("Проверить стартовые системы");


        } else {
            System.out.println("Полетели");
        }
    }

    public static void vacation(boolean permission) {
        if (permission) {
            System.out.println("Summer lager");
        } else {
            System.out.println("Summer at home");
        }
    }

}

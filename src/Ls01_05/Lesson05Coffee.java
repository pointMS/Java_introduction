package Ls01_05;

/**
 * First
 * 27.04.2020  12:06
 */
public class Lesson05Coffee {
    public static void main(String[] args) {
        //water(100);
        //americano();
        //cappucino();
        //latte();
        int choose = 1;
        myChoose(choose);
    }

    public static void myChoose(int choose) {

        switch (choose) {// опреатор опции выбора
            case 3:
                latte();
                break;
            case 2:
                americano();
                break;
            case 1:
                cappucino();
                break;
        }
    }

    public static void latte() {
        System.out.println("---");
        System.out.println("Here is your latte: ");
        milk(30);
        water(70);
        coffee(30);
        System.out.println("---");
    }

    public static void cappucino() {
        System.out.println("---");
        System.out.println("Here is your cappucino: ");
        milk(30);
        water(40);
        coffee(20);
        System.out.println("---");
    }

    public static void americano() {
        System.out.println("---");
        System.out.println("Here is your americano: ");
        milk(0);
        water(30);
        coffee(10);
        System.out.println("---");
    }

    public static void water(int ml) {
        System.out.printf("Add %d ml of water \n", ml);
    }

    public static void milk(int ml) {
        System.out.printf("Add %d ml of milk \n", ml);
    }

    public static void coffee(int ml) {
        System.out.printf("Add %d ml of coffee \n", ml);
    }
}

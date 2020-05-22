package Ls13_May11;

/**
 * First * 11.05.2020  12:48
 */
public class Ls13Ternar {
    public static void main(String[] args) {

        methodeTwo(false);
        methodeTwo(true);
        methodeThree(false);

    }
    /*public static void methodOne(){
        if (условие) {
            number = 10;
        }else {
            number = -10;
        }
        number = (условие) ? 10 : -10;*/


    public static void methodeTwo(boolean b) {
        int number = 0;
        if (b) {
            number = 10;
        } else {
            number = -10;
        }
        System.out.println(number);
    }

    public static void methodeThree(boolean b) {
        int number = (b) ? 10 : -10;
        System.out.println(number);
    }
}
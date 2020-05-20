package Ls12;

/**
 * First * 07.05.2020  09:40
 */
public class Ls12ChristmasTreeFour {
    public static void main(String[] args) {
        int side = 5;
        //christmasTreeFour(side);
        rombus(side);
    }

    //равнобедренный треугольник
    public static void christmasTreeFour(int side) {
        String star = "*";
        String space = "1";
        String starOne = "*";
        String spaceLine = "2";
        String starLine = "3";
        String starOneLine = "H";
        String line = "";
        for (int i = 0; i < side; i++) {
            spaceLine = spaceLine + space;
        }
        for (int i = 0; i < side; i++) {
            spaceLine = spaceLine.substring(0, spaceLine.length() - 1);
            starLine = starLine + star;
            starOneLine = starOneLine + starOne;
            line = spaceLine + starLine + starOneLine;
            System.out.println(line);
        }
    }

    // ромб
    public static void rombus(int side) {
        String star = "*";
        String space = "1";
        String starOne = "*";
        String spaceLine = "2";
        String starLine = "3";
        String starOneLine = "H";
        String line = "";
        for (int i = 0; i < side; i++) {
            spaceLine = spaceLine + space;
        }
        for (int i = 0; i < side; i++) {
            spaceLine = spaceLine.substring(0, spaceLine.length() - 1);
            starLine = starLine + star;
            starOneLine = starOneLine + starOne;
            line = spaceLine + starLine + starOneLine;
            System.out.println(line);
        }
        System.out.println("-----------");
        for (int i = side; i > 0; i--) {

            System.out.println(line);
        }
    }
}

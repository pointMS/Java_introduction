package Ls12;

/**
 * First * 06.05.2020  17:21
 */
public class testChristmasTree {
    public static void main(String[] args) {
        int a = 7;
        //chrTreeOne(a);
        chrTreeTwo(a);
        //chrTreeOneTest(a);
        //christmasTreeThreeTest(7);
    }

    public static void chrTreeOneTest(int a) {
        String star = "*";
        String line = "0";
        for (int i = 0; i < a; i++) {
            line = line + star;
        }
        System.out.println(line);

        for (int i = a; i > 0; i--) {
            line = line.substring(0, line.length() - 1);
            System.out.println(line);
        }
    }

    public static void chrTreeOne(int a) {
        String star = "*";
        String line = "4";
        for (int i = 0; i < a; i++) {
            line = line + star;
            System.out.println(line);
        }
    }

    public static void chrTreeTwo(int a) {
        String star = "*";
        String line = "H";
        String lineOne = "*";

        for (int i = 0; i < a; i++) {
            line = line + star;
        }
        System.out.println(line);
        lineOne = line;
        for (int i = a; i > 0; i--) {
            lineOne = lineOne.substring(0, lineOne.length() - 1);
            System.out.println(lineOne);
        }
    }

    public static void christmasTreeThreeTest(int side) {
        String star = "*";
        String space = " ";
        String line = "";
        String spaceLine = "";
        String starLine = "";
        for (int i = 0; i < side; i++) {
            spaceLine = spaceLine + space;
        }
        for (int i = 0; i < side; i++) {
            spaceLine = spaceLine.substring(0, spaceLine.length() - 1);
            starLine = starLine + star;
            line = spaceLine + starLine;
            System.out.println(line);
        }

        System.out.println(spaceLine + "");
    }
}

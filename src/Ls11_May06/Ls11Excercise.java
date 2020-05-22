package Ls11_May06;

/**
 * First * 06.05.2020  11:06
 */
public class Ls11Excercise {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        //aAndBSideliNaTrube(a, b);
        //digitsWriting(5,17);
        //christmasTree(10   );
        //christmasTreeTwo(10);
        christmasTreeThree(10);
    }

    // Даны целые числа А и В, где В больше 0, Вывести В раз число А
    public static void aAndBSideliNaTrube(int a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    //Вывести в порядке возрастания все числа между А и B, где а = 5, а B = 17.
    public static void digitsWriting(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }

    public static void christmasTree(int a) {
        String star = "*";
        String line = "";
        for (int i = 0; i < a; i++) {
            line = line + star;
            System.out.println(line);
        }

    }

    public static void christmasTreeTwo(int a) {
        String star = "*";
        String line = "";
        String lineOne = "";
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

    public static void christmasTreeThree(int side) {
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


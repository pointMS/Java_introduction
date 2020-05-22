package Ls13_May11;

/**
 * First * 11.05.2020  11:33
 */
public class Ls13AOExcersices12_14 {
    public static void main(String[] args) {
        cyrillicTest();
    }

    public static void cyrillicTest() {
        String letters1 = "абвгдежзиклмнопрст";
        String name = "аяпапо";
        System.out.println(name.codePointAt(0));
        System.out.println(name.codePointAt(1));

        for (int i = 1040; i < 1072; i++) {
            char temp = (char)i;
            System.out.print(temp);

        }
    }

}

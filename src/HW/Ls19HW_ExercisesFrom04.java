package HW;

public class Ls19HW_ExercisesFrom04 {
    public static void main(String[] args) {

        //backAround("Google");
        //startHi();
        //System.out.println(hasTeen(5, 16, 20));
        mixStart();
        close10(5,8,10);


    }

    //19-05.backAround Задан стринг, возьмите последний символ и верните новую строку с последним символом,
    // добавленным спереди и сзади. Исходная строка имеет длину 1 или более символов.
    public static void backAround(String base) {
        String temp = String.valueOf(base.charAt(base.length() - 1));

        System.out.println(temp.concat(base));
        System.out.println(base.concat(temp));
    }

    //19-06.startHi Задан стринг, вернуть true, если он начинается с «hi», и false в противном случае.
    public static boolean startHi() {
        String strOne = "Hi";
        String strForCheck = "Hi! How are you?";
        System.out.println(strForCheck.startsWith(strOne)); //startsWith - помощь зала
        return false;
    }

    //19-07.hasTeen число «teen» находится в диапазоне 13,19 включительно.
    // даны 3 значения типа int, вернуть true, если 1 или более из них являются teen.
    public static boolean hasTeen(int a, int b, int c) {
        int rangeMin = 13;
        int rangeMax = 19;
        return a >= rangeMin & a <= rangeMax || b >= rangeMin & b <= rangeMax || c >= rangeMin & c <= rangeMax;
    }

    //19-08.mixStart Верните true, если данная строка начинается с «mix», «m» - any symbol, должно быть "ix"
    public static boolean mixStart() {
        String mustBe = "ix";
        String strToCheck = "prix lalala";
        System.out.println(strToCheck.contains(mustBe));
        return false;
    }

    //19-09.close10 задано 2 значения int, вернуть любое значение, ближайшее к 10, или 0 в случае равенства.
    public static boolean close10(int a, int b, int index) {
        int tempA = a/index;
        int tempB = b/index;
        // no solved
        return false;
    }
    //19-10.stringE - Return true if the given string contains between 1 and 3 'e' chars.
    public static boolean stringE(){


        return false;
    }

}

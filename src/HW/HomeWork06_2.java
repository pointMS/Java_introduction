package HW;

/**
 * First
 * 29.04.2020  08:15
 */
//Учитывая int n, возвращайте true, если он находится в пределах 10 от 100 или 200.
// Примечание: Math.abs(num) вычисляет абсолютное значение числа.
//nearHundred(93) → true
//nearHundred(90) → true
//nearHundred(89) → false

public class HomeWork06_2 {
    public static void main(String[] args) {

        System.out.println(checkNumber(89));
        System.out.println(checkNumber(124));
        System.out.println(checkNumber(-230));

    }

    public static boolean checkNumber(int digit) {
        //return a >= 10 & a <= 100;
        digit = Math.abs(digit);
        boolean bool = true;
        int range = 10;
        int target1 = 100;
        int target2 = 200;
        bool = digit >= target1 - range & digit <= target1 + range || digit >= target2 - range & digit >= target2 + range;
        return bool;

    }


}

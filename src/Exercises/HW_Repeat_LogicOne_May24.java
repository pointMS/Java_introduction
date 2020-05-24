package Exercises;

public class HW_Repeat_LogicOne_May24 {
    public static void main(String[] args) {

//        System.out.println(more20(21)); //true
//        System.out.println(more20(22)); //true
//        System.out.println(more20(20)); //false

//        System.out.println(nearTen(12)); //true
//        System.out.println(nearTen(17)); //false
//        System.out.println(nearTen(19)); //true

//        System.out.println(teaParty(7, 6)); //1
//        System.out.println(teaParty(5, 10)); //2
//        System.out.println(teaParty(4, 6)); //0

//        System.out.println(twoAsOne(1, 2, 3)); //true
//        System.out.println(twoAsOne(3, 2, 1)); //true
//        System.out.println(twoAsOne(3, 2, 4)); //false

        System.out.println(lastDigit(23, 19, 13)); // true
        System.out.println(lastDigit(23, 19, 12)); // false
        System.out.println(lastDigit(23, 19, 3)); // true


    }

    //01logic-04
    public static boolean more20(int number) {
        //Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod
        //if ((number - 20) == 1 | (number - 20) == 2) return true;
        if (number % 20 == 1 | number % 20 == 2) return true;
        return false;
    }

    //01logic-05
    public static boolean nearTen(int num) {
        //Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
        // Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod
        if (num % 10 <= 2 | num % 10 >= 8) return true;
        return false;
    }

    //01logic-06
    public static int teaParty(int tea, int candy) {
        //We are having a party with amounts of tea and candy.
        // Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great.
        // A party is good (1) if both tea and candy are at least 5.
        // However, if either tea or candy is at least double the amount of the other one, the party is great (2).
        // However, in all cases, if either tea or candy is less than 5, the party is always bad (0).

        if (tea >= 5 && candy >= tea * 2 | tea >= candy * 2 && candy >= 5) return 2;
        else if (tea >= 5 && candy >= 5) return 1;
        else return 0;
    }

    //01logic-07
    public static boolean twoAsOne(int a, int b, int c) {
        //Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
        if (a + b == c | b + c == a | a + c == b) return true;
        return false;
    }

    //01logic-08
    public static boolean lastDigit(int a, int b, int c) {
        //Given three ints, a b c, return true if two or more of them have the same rightmost digit.
        // The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
        if (a % 10 == b % 10 | b % 10 == c % 10 | a % 10 == c % 10) return true;
        return false;
    }
}

package Ls20_May20;

public class Ls19_06_02Logic {

    public static boolean makeBricks(int smallBricksCount, int bigBricksCount, int goalSize) {
        //We want to make a row of bricks that is goal inches long.
// We have a number of small bricks (1 inch each)
// and big bricks (5 inches each).
// Return true if it is possible to make the goal by choosing
// from the given bricks. This is a little harder than it looks
// and can be done without any loops.
// See also: Introduction to MakeBricks
        int sizeSmall = 1;
        int sizeBig = 5;

        for (int i = 0; i <= smallBricksCount; i++) {
            for (int j = 0; j <= bigBricksCount; j++) {
                if (i * sizeSmall + j * sizeBig == goalSize) return true;
            }
        }
        return false;
    }

    public static int noTeenSum(int a, int b, int c) {
        //Given 3 int values, a b c, return their sum. However, if any of the values is a teen --
        // in the range 13..19 inclusive -- then that value counts as 0,
        // except 15 and 16 do not count as a teens. Write a separate helper
        // "public int fixTeen(int n) {"that takes in an int value and returns
        // that value fixed for the teen rule. In this way, you avoid repeating
        // the teen code 3 times (i.e. "decomposition").
        // Define the helper below and at the same indent level as the main noTeenSum().
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public static int fixTeen(int n) {
        if (n >= 13 & n <= 19 ^ (n == 15 | n == 16)) return 0; // если в правильном диапазоне
        return n; // if false
    }

    public static boolean makeBricksDoc(int smallBricksCount, int bigBricksCount, int goalSize) {
        int sizeSmall = 1;
        int sizeBig = 5;
        int maybeGoal = goalSize % (bigBricksCount * sizeBig) + smallBricksCount;
        return maybeGoal >= 0; //true / not solved
    }

    public static int blackJack(int a, int b) {
        //Given 2 int values greater than 0, return whichever value is nearest to 21
        // without going over. Return 0 if they both go over.
        a = over21(a);
        b = over21(b);
        if (a > b) return a;
        return b;
    }

    public static int over21(int n) {
        if (n > 21) return 0;
        return n;
    }

    public static int loneSum(int a, int b, int c) {
        //Given 3 int values, a b c, return their sum. However, if one of the values
        // is the same as another of the values, it does not count towards the sum.
        if (a == b & a == c) {
            a = 0;
            b = 0;
            c = 0;
        } else if (a == b) {
            a = 0;
            b = 0;
        } else if (a == c) {
            a = 0;
            c = 0;
        } else if (b == c) {
            b = 0;
            c = 0;
        }
        return a + b + c;
    }

    //For this problem, we'll round an int value up to the next multiple of 10
    // if its rightmost digit is 5 or more, so 15 rounds up to 20.
    // Alternately, round down to the previous multiple of 10 if its
    // rightmost digit is less than 5, so 12 rounds down to 10.
    // Given 3 ints, a b c, return the sum of their rounded values.
    // To avoid code repetition, write a separate helper "public int round10(int num)
    // {" and call it 3 times.
    // Write the helper entirely below and at the same indent level as roundSum().

    // not solved
}




package Ls19;

public class Ls19Exercises {
    public static void main(String[] args) {
        boolean weekday = true;
        boolean vacation = true;
        //System.out.println(sleepIn(weekday, vacation));

        //System.out.println("N = 19: " + diff21(19));

        //System.out.println(nearHundred(109));

        System.out.println(missingChar("Maria", 8));


    }

    //19-00 сравнение стрингов - matchString a.equals(b)

    //19-01
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    //19-02
    public static int diff21(int n) {
        int result = 0;
        int magicNumber = 21;
        if (n > magicNumber) {
            result = 2 * Math.abs(n - magicNumber);
        } else {
            result = Math.abs(n - magicNumber);
        }
        return result;
    }

    //19-03
    public static boolean nearHundred(int a) {
        int range = 10;
        int pylonOne = 100;
        int pylonTwo = 200;

        return a >= pylonOne - range && a <= pylonOne + range
                || a >= pylonTwo - range && a <= pylonTwo + range;
    }

    //19-04
    public static String missingChar(String str, int index) {
        String result = "";
        if (index >= str.length()) {
            return "Not possible, wrong index";
        } else {
            result = str.substring(0, index)
                    + str.substring(index, str.length());
        }
        return result;

    }
}

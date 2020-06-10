package Exercises;

public class Ls33ExRecursion {
    public static void main(String[] args) {
        String a = "hello";
        String b = "xxyy";
        String c = "aaaa";
        System.out.println(pairStar(a)); //hel*lo
//        System.out.println(pairStar(b)); //x*xy*y
//        System.out.println(pairStar(c)); //a*a*a*a


    }

    public static String pairStar(String input) {
        //Rec01-07 Given a string, compute recursively a new string where identical chars that are adjacent
        // in the original string are separated from each other by a "*".

        String placeHolder = "*";
        if (input.length() < 2) {
            return input;
        }
        if (input.charAt(0) == input.charAt(1)) {
            return input.substring(0, 1) + placeHolder + pairStar(input.substring(1));
        }
        return input.substring(0, 1) + pairStar(input.substring(1));

    }

}

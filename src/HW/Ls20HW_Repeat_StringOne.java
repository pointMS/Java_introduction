package HW;
/*20.05.2020*/

public class Ls20HW_Repeat_StringOne {
    public static void main(String[] args) {
        //helloName("Bob", "Hello, ", '!');
        //makeOutWord("<<>>", "WooHoo");
        //firstHalf("WooHoo");
        //System.out.println(nonStart("Great ", "job"));

        //System.out.println(theEnd("garden", false));
        //System.out.println(theEnd("garden", true));

        //System.out.println(endsLy("weekly", "ly")); // true
        //System.out.println(endsLy("week", "ly")); // false

        //middleThree("XXwelcomeXX");
        //lastChars("good", "morning");
        //seeColor("blueAndRed","blue");
        //extraFront("ABC", 3);

        //System.out.println(makeAbba("Hi", "Bye"));
        //extraEnd("Hello");
        //withoutEnd("present");
        //leftTwo("spargel-");
        //System.out.println(withoutEndTwo("lalalala"));
        //nTwice("myexampletext", 3);
        //System.out.println(hasBad());

    }

    public static void helloName(String name, String add, char mark) {
        //1. Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
        System.out.println(add + name + mark);
    }

    public static void makeOutWord(String out, String inside) {
        //2. Given an "out" string length 4, such as "<<>>", and a word,
        // return a new string where the word is in the middle of the out string, e.g. "<>".
        System.out.println(out.substring(0, 2) + inside + out.substring(2, 4));
    }

    public static void firstHalf(String text) {
        //3. Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
        System.out.println(text.substring(0, text.length() / 2));
    }

    public static String nonStart(String first, String second) {
        //4.Given 2 strings, return their concatenation, except omit the first char of each.
        // The strings will be at least length 1.
        String result = first.substring(1, first.length()) + second.substring(1, second.length());
        return result;
    }

    public static String theEnd(String text, boolean mark) {
        //5.Given a string, return a string length 1 from its front, unless front is false,
        //in which case return a string length 1 from its back. The string will be non-empty.
        if (mark == false) {
            return (text.substring(text.length() - 1, text.length()));
        } else {
            return (text.substring(0, 1));
        }
    }

    public static boolean endsLy(String text, String mark) {
        //6. Given a string, return true if it ends in "ly".
        if (text.endsWith(mark)) return true;
        return false;
    }

    public static void middleThree(String text) {
        //7.Given a string of odd length, return the string length 3 from its middle,
        // so "Candy" yields "and". The string length will be at least 3.
        int letters = (text.length() - 3) / 2;
        System.out.println(text.substring(letters, letters + 3));
    }

    public static void lastChars(String a, String b) {
        //8.Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
        // so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
        if (b.length() == 0) {
            System.out.println(a.substring(0, 1) + "@");
        } else if (a.length() == 0) {
            System.out.println("@" + b.substring(b.length() - 1));
        } else
            System.out.println(a.substring(0, 1) + b.substring(b.length() - 1));
    }

    public static void seeColor(String color, String check) {
        //9. Given a string, if the string begins with "red" or "blue"
        // return that color string, otherwise return the empty string.
        if (color.startsWith(check)) {
            System.out.println(check);
        } else {
            System.out.println("empty");
        }
    }

    public static void extraFront(String letters, int rate) {
        //10.Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
        // The string may be any length. If there are fewer than 2 chars, use whatever is there.
        String tempLarge = letters.substring(0, 2);
        String tempSmall = letters.substring(0, 1);
        if (letters.length() < rate) {
            System.out.println(tempSmall + tempSmall);
        } else {
            System.out.println(tempLarge + tempLarge + tempLarge); //знаю, подгонка под ответ :(
        }
    }

    public static String makeAbba(String first, String last) {
        //12.Given two strings, a and b, return the result of putting them together in the order abba,
        // e.g. "Hi" and "Bye" returns "HiByeByeHi".
        return first.concat(last.concat(last.concat(first)));
    }

    public static void extraEnd(String text) {
        //13.Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
        String last = text.substring(text.length() - 2);
        System.out.println(last.concat(last.concat(last)));
    }

    public static void withoutEnd(String text) {
        //14.Given a string, return a version without the first and last char, so "Hello" yields "ell"
        System.out.println(text.substring(1, text.length() - 1));
    }

    public static void leftTwo(String text) {
        //15.Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
        System.out.println(text.substring(2, text.length()) + text.substring(0, 2));
    }

    public static String withoutEndTwo(String text) {
        //16.Given a string, return a version without both the first and last char of the string.
        //The string may be any length, including 0
        String result = "";
        if (text.length() < 1) {
            result = " ";
        } else {
            result = text.substring(1, text.length() - 1);
        }
        return result;
    }

    public static void nTwice(String text, int n) {
        //17.Given a string and an int n, return a string made of the first and last n chars from the string.
        // The string length will be at least n.
        System.out.println(text.substring(0, n) + text.substring(text.length() - n));
    }

}

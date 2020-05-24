package Exercises;

/*22-24.05.2020*/
public class HW_Repeat_StringOne_May24 {
    public static void main(String[] args) {

//        System.out.println(hasBad("badxxx")); //true
//        System.out.println(hasBad("xbadxxx")); //true
//        System.out.println(hasBad("xxbadxxx")); //false

//        System.out.println(conCut("dog", "cat"));
//        System.out.println(conCut("abc", "cat"));
//        System.out.println(conCut("abc", " "));

//        System.out.println(frontAgain("edited")); //true
//        System.out.println(frontAgain("edit")); //false
//        System.out.println(frontAgain("ed")); //true

//        System.out.println(without2("HelloHe")); //lloHe
//        System.out.println(without2("HelloHi")); //HelloHi
//        System.out.println(without2("Hi")); //""

//        System.out.println(withoutX("xHix")); //Hi
//        System.out.println(withoutX("xHi")); //Hi
//        System.out.println(withoutX("Hxix")); //Hxi

//        System.out.println(firstTwo("Hello")); //He
//        System.out.println(firstTwo("abcdef")); //ab
//        System.out.println(firstTwo(" ")); //ab

//        System.out.println(comboString("Hello", "Hi")); //HiHelloHi
//        System.out.println(comboString("Hi", "Hello")); //HiHelloHi
//        System.out.println(comboString("aaa", "")); //aaa

//        System.out.println(right2("round")); //ndrou
//        System.out.println(right2("home")); //meho
//        System.out.println(right2("no")); //no

//        System.out.println(middleTwo("logotype")); //ot

//        System.out.println(twoChar("hello", 3));
//        System.out.println(twoChar("java", 3));

//        System.out.println(atFirst("hello")); //he
//        System.out.println(atFirst("h")); //h@

//        System.out.println(lastTwo("charge"));  //chareg
//        System.out.println(lastTwo("as"));  //sa

//        System.out.println(minCut("good", "morning")); //goodning
//        System.out.println(minCut("good", "hi")); //odhi
//        System.out.println(minCut("good", "hifi"));

//        System.out.println(deFront("arcade")); //acade
//        System.out.println(deFront("ebony")); // bony
//        System.out.println(deFront("letstry")); // tstry

        System.out.println(withoutX2("xxYes")); //Yes
        System.out.println(withoutX2("Wxhy")); //Why
        System.out.println(withoutX2("xNew")); //New
        System.out.println(withoutX2("Old")); //Old


    }

    //01-18 получилось без equals, это ошибка?
    public static boolean hasBad(String text) {
        //18. Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
        // such as with "badxxx" or "xbadxx" but not "xxbadxx".
        // The string may be any length, including 0. Note: use .equals() to compare 2 strings.
        String testPart = "bad";
        if (text.startsWith(testPart) | text.startsWith(testPart, 1)) return true;
        else return false;
    }

    //01-19
    public static String conCut(String first, String second) {
        //19. Given two strings, append them together (known as "concatenation") and return the result.
        // However, if the concatenation creates a double-char,
        // then omit one of the chars, so "abc" and "cat" yields "abcat"
        String result = "";
        String fristLast = first.substring(first.length() - 1);
        String secondBegin = second.substring(0, 1);
        if (fristLast.equals(secondBegin)) {
            result = first + second.substring(1, second.length());
        } else
            result = first + second;
        return result;
    }

    //01-20
    public static boolean frontAgain(String text) {
        //20. Given a string, return true if the first 2 chars in the string
        // also appear at the end of the string, such as with "edited".
        String firstTwo = text.substring(0, 2);
        String lastTwo = text.substring(text.length() - 2, text.length());
        if (firstTwo.equals(lastTwo)) return true;
        else return false;
    }

    //01-21
    public static String without2(String text) {
        //Given a string, if a length 2 substring appears at both its beginning and end,
        // return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
        // The substring may overlap with itself, so "Hi" yields "".
        // Otherwise, return the original string unchanged.
        String result = "";
        String partBegin = text.substring(0, 2);
        String partEnd = text.substring(text.length() - 2, text.length());

        if (partBegin.equals(partEnd)) {
            result = text.substring(2, text.length());
        } else if (text.length() == partBegin.length()) {
            result = "";
        } else result = text;
        return result;
    }

    //01-22
    public static String withoutX(String text) {
        //Given a string, if the first or last chars are 'x',
        // return the string without those 'x' chars, and otherwise return the string unchanged.
        String result = "";
        String x = "x";
        String charBegin = text.substring(0, 1);
        String charEnd = text.substring(text.length() - 1, text.length());

        // System.out.println(charBegin + " " + charEnd);

        if (charBegin.equals(x) & charEnd.equals(x)) {
            result = text.substring(1, text.length() - 1);
        } else if (text.startsWith(x)) {
            result = text.substring(1, text.length());
        } else if (text.endsWith(x)) {
            result = text.substring(0, text.length() - 1);
        }
        return result;
    }

    //01-23 makeTags делали на уроке 20/05

    //01-24
    public static String firstTwo(String word) {
        //Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
        // If the string is shorter than length 2, return whatever there is, so "X" yields "X",
        // and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.

        if (word.length() <= 2) return "";
        return word.substring(0, 2);
    }

    //01-25
    public static String comboString(String a, String b) {
        //Given 2 strings, a and b, return a string of the form short+long+short,
        // with the shorter string on the outside and the longer string on the inside.
        // The strings will not be the same length, but they may be empty (length 0).
        String result = "";
        if (a.length() > b.length()) {
            result = b + a + b;
        } else if (b.length() > a.length()) {
            result = a + b + a;
        }
        return result;
    }

    //01-26 можно в одну строчу, но так, мне кажется, нагляднее
    public static String right2(String text) {
        //Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
        // The string length will be at least 2.
        String add = text.substring(text.length() - 2, text.length());
        return add + text.substring(0, text.length() - 2);
    }

    //01-27
    public static String middleTwo(String text) {
        //Given a string of even length, return a string made of the middle two chars,
        // so the string "string" yields "ri". The string length will be at least 2.
        return text.substring((text.length() / 2) - 1, text.length() / 2 + 1);
    }

    //01-28
    public static String twoChar(String text, int index) {
        //Given a string and an index, return a string length 2 starting at the given index.
        // If the index is too big or too small to define a string length 2, use the first 2 chars.
        // The string length will be at least 2.
        if (index >= text.length() | index <= text.length()) return text.substring(0, 2);
        return text.substring(index, index + 2);
    }

    //01-29
    public static String atFirst(String text) {
        //Given a string, return a string length 2 made of its first 2 chars.
        // If the string length is less than 2, use '@' for the missing chars.
        if (text.length() <= 2) return text.substring(0) + "@";
        return text.substring(0, 2);
    }

    //01-30
    public static String lastTwo(String text) {
        //Given a string of any length, return a new string where the last 2 chars,
        // if present, are swapped, so "coding" yields "codign".
        return text.substring(0, text.length() - 2) + text.substring(text.length() - 1)
                + text.substring(text.length() - 2, text.length() - 1);

    }

    //01-31
    public static String minCut(String firstText, String secondText) {
        //Given two strings, append them together (known as "concatenation") and return the result.
        // However, if the strings are different lengths, omit chars from the longer string so it is the same length
        // as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
        String result = "";
        if (firstText.length() < secondText.length())
            return firstText + secondText.substring(firstText.length() - 1, secondText.length());
        else if (firstText.length() > secondText.length())
            return firstText.substring(secondText.length(), firstText.length()) + secondText;
        else return firstText + secondText;
    }

    //01-32
    public static String deFront(String text) {
        //Given a string, return a version without the first 2 chars.
        // Except keep the first char if it is 'a' and keep the second char if it is 'b'.
        // The string may be any length. Harder than it looks.
        String a = "a";
        String b = "b";
        if (text.startsWith(a)) return a + text.substring(2, text.length());
        else if (text.substring(0, 2).contains(b)) return text.substring(1, text.length());
        else return text.substring(2, text.length());
    }

    //01-33
    public static String withoutX2(String text) {
        //Given a string, if one or both of the first 2 chars is 'x',
        // return the string without those 'x' chars, and otherwise return the string unchanged.
        // This is a little harder than it looks.
        String x = "x";
        String xx = "xx";
        if (text.startsWith(xx)) return text.substring(2, text.length());
        else if (text.startsWith(x)) return text.substring(1, text.length());
        else if (text.substring(0, 2).contains(x)) return text.substring(0, 1) + text.substring(2, text.length());
        else return text;
    }
}


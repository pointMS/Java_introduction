package Ls22_May25;

/*25.05.2020 */
public class Ls22HW_Palindrome {
    public static void main(String[] args) {

        System.out.println(checkPalindrome("А роза упала на лапу азора")); //true
        System.out.println(checkPalindrome("радар")); //true
        System.out.println(checkPalindrome("школа")); //false
        System.out.println(checkPalindrome("java")); //false
    }

    private static boolean checkPalindrome(String text) {
        String noSpaceText = text.replace(" ", "").toLowerCase();
        StringBuffer backText = new StringBuffer(noSpaceText).reverse();
        String backTextOne = backText.toString();

        if (noSpaceText.equals(backTextOne)) return true;
        else return false;
    }

}
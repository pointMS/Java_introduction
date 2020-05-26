package Ls22_May25;

/*25.05.2020 */
public class Ls22HW_Palindrome {
    public static void main(String[] args) {

        System.out.println(checkPalindrome("А роза упала на лапу азора")); //true
        System.out.println(checkPalindrome("радар")); //true
        System.out.println(checkPalindrome("школа")); //false
        System.out.println(checkPalindrome("java")); //false
    }

    //решено в классе
    private static boolean checkPalindrome(String myPolindrome) {
        myPolindrome = myPolindrome.toLowerCase().replace(" ","");
        boolean result = false;
        String reversePalindrome = "";

        for (int i = 0; i < myPolindrome.length(); i++) {
            reversePalindrome = myPolindrome.charAt(i) + reversePalindrome;
        }
        if(myPolindrome.equals(reversePalindrome)){
            return true;
        }

        return result;
    }
}

//        StringBuffer backText = new StringBuffer(noSpaceText).reverse();
//        String backTextOne = backText.toString();
//        if (noSpaceText.equals(backTextOne)) return true;

package Ls22_May25;

/*25.05.2020 */
public class Ls22HW_Palindrome {
    public static void main(String[] args) {

        System.out.println(checkPalindrome("А роза упала на лапу азора")); //true
        System.out.println(checkPalindrome("радар")); //true
        System.out.println(checkPalindrome("школа")); //false
        System.out.println(checkPalindrome("java")); //false
    }

    //решено в классе 26/05/2020
    private static boolean checkPalindrome(String myPolindrome) {
        myPolindrome = myPolindrome.toLowerCase().replace(" ","");
        boolean result = false;
        String reversePalindrome = "";

        for (int i = 0; i < myPolindrome.length(); i++) {
            reversePalindrome = myPolindrome.charAt(i) + reversePalindrome;
            // присоединяем новое значение к предыдущему и оно становится впереди
        }
        if(myPolindrome.equals(reversePalindrome)){ //сравниваем новый и оригинальный вариант
            return true;
        }

        return result;
    }
}
// решено дома 25/05/2020
//        StringBuffer backText = new StringBuffer(noSpaceText).reverse();
//        String backTextOne = backText.toString();
//        if (noSpaceText.equals(backTextOne)) return true;

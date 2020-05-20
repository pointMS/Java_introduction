/**
 * First
 * 24.04.2020  10:30
 */
public class Lesson04CharString {
    public static void main(String[] args) {

        //charInfo();
        stringRalation();
        //upperCase();
        //getArticle();

    }

    public static void charInfo() {
        char symbol1 = '\u0489';
        char symbol2 = '\u263A';
        char symbol3 = '\u263B';
        char symbol4 = '\u20B0';
        char symbol5 = '\t';
        char symbol6 = 350; // 350-й по счету символ в таблице
        char symbol7 = '\350';

        System.out.println(symbol1);
        System.out.println(symbol2);
        System.out.println(symbol3);
        System.out.println(symbol4);
        System.out.println(symbol5);
        System.out.println(symbol6);
        System.out.println(symbol7);
    }


    public static void stringRalation() {
        String firstName = "Maria ";
        String secondName = "Sekacheva ";
        String mail = "m.sekacheva@gmail.com";
        int old = 20;
        System.out.println("Welcome " + firstName + secondName + mail);

        String user = firstName + " " + secondName;
        int lengthDisplay = user.length();
        System.out.println("Dlina stroki :" + lengthDisplay);

        firstName = firstName.substring(3);
        System.out.println(firstName);
        mail = mail.substring(10, 12);
        System.out.println(mail);

//substring - to do
    }

    public static void upperCase() {
        String text = "gggggggg";
        text = text.toUpperCase();
        System.out.println(text);

        String text2 = "NNNNNNN";
        text2 = text2.toLowerCase();
        System.out.println(text2);

//toLowerCase - to do

    }

    public static void getArticle() {
        String title = "london is a capital";


    }
}

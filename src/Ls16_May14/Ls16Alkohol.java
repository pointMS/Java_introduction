package Ls16_May14;

import java.util.Scanner;

/**
 * First * 14.05.2020  12:25
 */
public class Ls16Alkohol {

    public static String kasse() {
        int age = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
        age = sc.nextInt();



        String result = "";
        String resultTrue = "Yes ";
        String resultFaulse = "No ";

        if (age >= 18) {
            result = resultTrue;

        } else {
            result = resultFaulse;

        }
        return result;
    }

}

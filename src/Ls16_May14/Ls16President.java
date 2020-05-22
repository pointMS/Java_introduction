package Ls16_May14;

import java.util.Scanner;

/**
 * First * 14.05.2020  12:02
 */
public class Ls16President {
    public static void electionResult() {

        Scanner myScanner = new Scanner(System.in);
        String name = "";
        System.out.println("What is a name of the candidate?");
        name = myScanner.next();
        System.out.println("How many voites candidate " + name);


        double result = 0;

        double minVote = 50;
        if (result >= 100){
            System.out.println("Wrong calculation of result!");
        }
        else if (result > minVote) {
            System.out.println("New president, congratulations " + name);
        } else {
            System.out.println("Sorry, Mr. " + name + " has not enougth " + minVote + "%");
        }

    }
}

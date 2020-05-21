package HW;
/* 21.05.2020*/

public class Ls19HW_Repeat_LogicOne {
    public static void main(String[] args) {
        //System.out.println(cigarParty(70, true)); //true
        //caugthSpeeding(65, true); // no ticket
        //System.out.println(love6(1, 5)); // true

    }

    public static boolean cigarParty(int nCigar, boolean weekend) {
        //1.When squirrels get together for a party, they like to have cigars.
        // A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
        // Unless it is the weekend, in which case there is no upper bound on the number of cigars.
        // Return true if the party with the given values is successful, or false otherwise.
        if (nCigar >= 40 | nCigar <= 60 & weekend | nCigar >= 60 & !weekend) {
            return true;
        }
        return false;
    }

    public static boolean caugthSpeeding(int speed, boolean birthday) {
        //2. You are driving a little too fast, and a police officer stops you.
        // Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
        // If speed is 60 or less, the result is 0.
        // If speed is between 61 and 80 inclusive, the result is 1.
        // If speed is 81 or more, the result is 2.
        // Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
        if (speed <= 60 | !birthday ^ speed <= 65 | birthday) {
            System.out.println("no ticket");
        } else if (speed >= 61 | speed <= 80 | !birthday ^ speed >= 66 | speed <= 85 | birthday) {
            System.out.println("small ticket");
        } else if (speed >= 81 | !birthday ^ speed >= 86 | birthday) {
            System.out.println("big ticket");
        }
        return false;
    }

    public static boolean love6(int a, int b) {
        //3. The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6.
        // Or if their sum or difference is 6.
        // Note: the function Math.abs(num) computes the absolute value of a number.
        if (a == 6 ^ b == 6) {
            return true;
        } else if ((a + b) == 6) {
            return true;
        } else if (Math.abs(a - b) == 6 ^ Math.abs(b - a) == 6) {
            return true;
        }
        return false;
    }
}

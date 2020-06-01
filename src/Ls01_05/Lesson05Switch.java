package Ls01_05;
/**
 * First
 * 27.04.2020  12:49
 */
public class Lesson05Switch {
    public static void main(String[] args) {
        int rate = 4;
        System.out.println(crimeAndP(rate));

    }

    public static String crimeAndP(int rating) {
        String award;
        switch (rating) {
            case 5:
                award = "Fahrad";
                break;
            case 4:
                award = "Game";
                break;
            case 3:
                award = "Nothing, OK";
                break;
            case 2:
                award = "Very bad";
                break;
            case 1:
                award = "Terrible, no ice!";
                break;
            default:
                award = "Mistake";
                break;
        }
        return award;

    }
}

package Ls10_May05;

/**
 * First
 * 05.05.2020  11:42
 */
public class Ls10For {
    public static void main(String[] args) {
        fabricForWeek();
    }

    public static void fabricForWeek() {
        int weekDays = 7;
        for (int i = 1; i < weekDays; i++) {// i++ = i+1
            System.out.println("Day " + i);
            System.out.println("----------");
            System.out.println("New day");
            System.out.println("Wake up at 6 ");
            System.out.println("Go to work to 8 ");
            System.out.println("Go home to 18 ");
            System.out.println("Go sleep ");
            System.out.println("----------");
        }
    }


    public static void fabric() {
        boolean morning = true;
        boolean evening = true;
        if (morning) {
            // do working
        } else if (evening) {
            // do home
        }

    }
}

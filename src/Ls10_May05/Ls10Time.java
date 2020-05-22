package Ls10_May05;

/**
 * First
 * 05.05.2020  10:39
 */
// напишите метод, который принимает дни, а отдает секунды
public class Ls10Time {
    public static void main(String[] args) {
        int day = 1;
        System.out.println(dateToSecond(day));

    }

    public static int dateToSecond(int day) {
        int seconds = 0;
        int hoursInDay = 24;
        int minutesInHour = 60;
        int secondsInMinute = 60;
        seconds = day * hoursInDay * minutesInHour * secondsInMinute;
        return seconds;
    }

}

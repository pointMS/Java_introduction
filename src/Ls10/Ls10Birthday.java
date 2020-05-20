package Ls10;

/**
 * First
 * 05.05.2020  11:09
 */
//Посчитайте разницу между двумя днями года и выдайте число дней, которое осталось до следующего дня рождения:
//        - сегодня и днём рождения пушкина
//        - сегодня и новый год
//        - пасха и новый год

    // задание 2:

public class Ls10Birthday {
    public static void main(String[] args) {
        findBdPushkinTest();
    }

    public static int findBdPushkin(int today, int futureDay) {
        int allDaysInYear = 365;
        int result = 0;
        if (today > futureDay) {//today - 2 Jan, futureDay - 1 Jan
            result = allDaysInYear - today + futureDay;
        } else if (today < futureDay) {// today - 2 Jan, futureDay - 3 Jan
            result = futureDay - today;
        }
        return result;
    }

    public static void findBdPushkinTest() {
        System.out.println("Ожидаем 364 дня " + findBdPushkin(2, 1));
        System.out.println("Ожидаем 1 день " + findBdPushkin(1, 2));
    }
}

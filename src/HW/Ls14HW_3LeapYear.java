package HW;

/**
 * First * 12.05.2020  16:43
 */
//Реализовать метод, печатающий все високосные годы в интервале от year1 до year2
public class Ls14HW_3LeapYear {
    public static void main(String[] args) {

        getLeapYearFor(2000, 2020);
        getLeapYearWhile(2000, 2020);
        getLeapYearDoWhile(2000, 2020);

    }

    public static void getLeapYearFor(int yearOne, int yearTwo) {
        for (int year = yearOne; year <= yearTwo; year++) {
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                System.out.println(year);
            }
        }
    }

    public static void getLeapYearWhile(int yearOne, int yearTwo) {
        while (yearOne <= yearTwo) {
            yearOne++;
            if (yearOne % 400 == 0 || yearOne % 4 == 0 && yearOne % 100 != 0)
                System.out.println(yearOne);
        }
    }

    public static void getLeapYearDoWhile(int yearOne, int yearTwo) {
        do {
            yearOne++;
            if (yearOne % 400 == 0 || yearOne % 4 == 0 && yearOne % 100 != 0)
                System.out.println(yearOne);
        } while (yearOne <= yearTwo);
    }
}


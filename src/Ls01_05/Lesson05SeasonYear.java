/**
 * First
 * 27.04.2020  13:12
 */
public class Lesson05SeasonYear {
    public static void main(String[] args) {
        int month = 13;
        System.out.println(season(month));
    }

    public static String season(int month) {
        String season = "";
        switch (month) {
            case 1:
            case 2:
            case 12:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Mistake";
        }
        return season;
    }
}

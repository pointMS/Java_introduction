package HW;

/**
 * First * 11.05.2020  13:44
 */
public class HW13CyrillicAndLatin {
    public static void main(String[] args) {
        getLatAndCyr();

    }

    public static void getLatAndCyr() {
        //15.Выведите случайный символ из латиницы и кириллицы, чередуя один другой
        String lettersLat = "az";
        String lettersCyr = "ая";
        //System.out.println("LAT start - " + lettersLat.codePointAt(0));
        //System.out.println("LAT finish - " + lettersLat.codePointAt(1));
        //System.out.println("CYR finish - " + lettersCyr.codePointAt(0));
        //System.out.println("CYR finish - " + lettersCyr.codePointAt(1));

        char latMin = 97;
        char latMax = 122;
        char cyrMin = 1072;
        char cyrMax = 1103;
        char symbolLat = 0;
        char symbolCur = 0;

        String result = "";
        int n = 5;

        for (int i = 0; i < n; i++) {
            symbolLat = (char) (Math.random() * (latMax - latMin) + latMin);
            symbolCur = (char) (Math.random() * (cyrMax - cyrMin) + cyrMin);
            result = result + symbolCur + symbolLat;
        }
        System.out.println(result);
    }
}

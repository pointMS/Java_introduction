package Sorting;
/*05.06.2020*/
import java.util.Arrays;

public class StringSorting {
    public static void main(String[] args) {
        String name = "AbcdDcba";
        String a = "A";
        String b = "n";
        System.out.println(a.toLowerCase().compareTo(b.toLowerCase()));
        //сравнивает целочисленные значения в Юникоде и возвращает разницу

        String[] array = name.split(""); //разделение элементов по отдельности
        System.out.println(Arrays.toString(array));
        System.out.println(array[0]); //вывести первую букву
        array = stringBubbleSort(array);
        System.out.println(Arrays.toString(array));


    }

    public static String[] stringBubbleSort(String[] myArray) {
        int count = 0;

        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i].toLowerCase().compareTo(myArray[i + 1].toLowerCase()) > 0) {
                count++;
                String temp = myArray[i];
                myArray[i] = myArray[i + 1];
                myArray[i + 1] = temp;
            }
        }
        if (count > 0) {
            stringBubbleSort(myArray); //рекурсия
        }
        return myArray;
    }
}

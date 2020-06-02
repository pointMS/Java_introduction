package Exercises;
/*27.05.2020*/
public class HW_Array5 {
    public static void main(String[] args) {

        int[] arr1 = new int[]{4, 5};
        int[] arr2 = new int[]{4, 2};
        int[] arr3 = new int[]{3, 5};

        System.out.println(no23(arr1)); //true
        System.out.println(no23(arr2)); //false
        System.out.println(no23(arr3)); //false

    }

    public static boolean no23(int[] arr1) {
        //array1-5 Given an int array length 2, return true if it does not contain a 2 or 3.
        //Дан целочисленный массив из двух элементов, верните true, если он не содержит цифры 2 или 3
        for (int element : arr1) {
            //System.out.println("element = " + element);
            if (element == 2 || element == 3) return false;
        }
        return true;
    }
}

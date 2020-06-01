package Exercises;

public class HW_Array1 {
    public static void main(String[] args) {
        myFirstArray(5);
    }

    //сделано в классе
    //Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
    // Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
    public static void myFirstArray(int elementCount) {
        int[] digits = new int[elementCount];

        for (int element : digits) { //for each - цикл работает с каждым элементом массива, частный случай fori
            element = (int) (Math.random() * ((100 - 1) + 1));
            //System.out.println(element);
        }
        System.out.println("________________");
        for (int i = 0; i < elementCount; i++) {//равнозначное for each, с шагом
            digits[i] = (int) (Math.random() * ((100 - 1) + 1));
            //System.out.println(digits[i]);
        }
        System.out.println("________________");
        int min = digits[0]; //взяли нулевой элемент массива
        int max = digits[0];
        int middle = 0;

        for (int i = 0; i < elementCount; i++) {
            if (digits[i] < min) {
                min = digits[i]; //обращаемся к элементу массива
            }
        }
        for (int i = 0; i < elementCount; i++) {
            if (digits[i] > max) {
                max = digits[i]; //обращаемся к элементу массива
            }
        }
        for (int i = 0; i < elementCount; i++) {
            middle = middle + digits[i];
        }
        System.out.println("Среднее арифметическое " + middle / elementCount);
        System.out.println("Минимальное значение массива: " + min);
        System.out.println("Максимальное значение массива: " + max);
    }
}

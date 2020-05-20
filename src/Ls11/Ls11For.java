package Ls11;

/**
 * First * 06.05.2020  09:37
 */
public class Ls11For {
    public static void main(String[] args) {
        introductionToLoopFor();

    }

    public static void introductionToLoopFor() {
        int a = 0;
        for (int i = 0; i < 5; i++) { // начало, условие, шаг, i - итератор iterator
            a++;
            int b = 10;
            //System.out.println("Переменная А в первом цикле: " + a);
            //System.out.println("Итератор первого цикла : " + i);
        }
        for (int i = 0; i < 20; i++) {
            a++;
        }
        //System.out.println("в конце метда распечатываем а: " + a);

        for (int i = 5; i > 0; i--) {
            System.out.println("Количество оставшихся мандаринок " + i);
        }
    }
}

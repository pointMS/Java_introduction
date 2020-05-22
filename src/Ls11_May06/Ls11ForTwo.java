package Ls11_May06;

/**
 * First * 06.05.2020  10:11
 */
public class Ls11ForTwo {
    public static void main(String[] args) {

        //myPrettyPrintByFor();
        reviewFor();

    }
        public static void magicFor () {
            for (int i = 1; i < 20; i = 2 * i) {
                // если Int i = 0, получается бесконечный цикл, т.к. 2*0=0 и условие 20 не достигается
                // если int i = 1, то значение умножается на 2 и остановится до 20
                System.out.println(i);
            }
        }

        public static void myPrettyPrintByFor () {
            for (int i = 0; i < 5; i++) {
                System.out.print(i);
            }
            for (int i = 1; i < 1_000_000_000; i = 10 * i) {
                System.out.println(i);
            }
            String s = "s";
            for (int i = 0; i < 5; i++) {
                s = s + "2";
                System.out.println(s);
            }
        }

        public static void reviewFor () {
            int a = 5;
            int b = 4;
            int c;
            for (int i = 0; i < a; i++) {
                b = b + 1;
                c = i + 1;
                System.out.println("Значение с: " + c);
            }
            System.out.println("Значение в: " + b);
        }
    }


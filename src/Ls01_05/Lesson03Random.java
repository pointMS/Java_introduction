import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Lesson03Random {
    public static void main(String[] args) {
        //magicPower();
        int a = 2;
        int b = 3;
        //magicAddition(a, b);
        //myPrint(a);
        lernRandom();

    }

    public static void magicAddition(int a, int b) {
        //int a = 2;
        //int b = 3;
        int c = a + b;
        System.out.println("Sum of a and b is " + c);
    }

    public static void myPrint(int a) {
        System.out.println("Значение переменной а: + a");

    }

    // возведение в степень
    public static void magicPower() {
        double firstVariable = 2.0;
        double secondVariable = 20.0;
        double thirdVariable = 10.0;
        double result = Math.pow(firstVariable, thirdVariable);
        System.out.println("The result number 1 is " + result);
        double secondResult = Math.pow(firstVariable, secondVariable);
        int lifeResult = (int) secondResult;
        System.out.println("The result number 2 is " + lifeResult);
    }

    public static void lernRandom() {
        final int MIN = 20;
        final int MAX = 40;
        int randomDigits = (int) (Math.random() * (MAX - MIN) + MIN);
        int randomDigits1 = (int) (Math.random() * 100);
        System.out.println("Случайное число: " + randomDigits);
        System.out.println(("Случайное число 2: ")+ randomDigits1);


        //можно использовать для тестировки
        //тип - int, double, float, long, short, byte
        //имя переменной - randomDigits
        //размер переменной (зависит от типа) - 8 бит, 16, 32, 64
        //значение переменной, которым мы инициализируем эту переменную


    }
}

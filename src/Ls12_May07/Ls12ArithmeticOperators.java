package Ls12_May07;

/**
 * First * 07.05.2020  11:00
 */
public class Ls12ArithmeticOperators {
    public static void main(String[] args) {

    }

    public static void aoOne() {
        int a = 5;// = опеатор присваивания
        int b = 6;
        int c;
        c = a + b;
        c = a - b;
        c = a * b;
        c = a / b;
        c = a % b;
        a++; // соответствует - a = a + 1;
        a--; // соответствует - a = a - 1;
        a += b; // соответствует - a = a + b;
        a -= b;// a = a - b;
        a *= b; // a = a * b
        a /= b; // a = a / b
        a %= b; // a = a % b
    }

    public static void aoTwo() {
        boolean c;
        int a = 5;
        int b = 6;
        boolean d = false;
        boolean f = false;
        c = a == b; //
        c = a != b;
        c = a > b;
        c = a < b;
        c = a <= b;
        c = a >= b;
        c = d && f;
        c = d & f;
        c = d || f;
        c = d | f;
        c = !d; // true if d = false
        c = d ^ f; //XOR - исключительное ИЛИ, побитовое логическое ИЛИ
        //c = d ~ f; - to check
        //& с присваиванием &=
        //| с рисваиванием - |=
        //^ с присваиванием -
        //< - сдвиг влево
        // > - сдвиг вправо
        //?: - террнарный оператор (if else)

    }


}

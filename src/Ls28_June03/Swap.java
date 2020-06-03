package Ls28_June03;

public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = a;
        a = b;
        b = c;
        System.out.println("first round");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b; //a=8
        b = a - b; //8-5=3
        a = a - b; //8-3=5
        System.out.println("second round");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b - (b = a);
        System.out.println("third round");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("forth round");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        a ^= b ^= a ^= b; //XOR в одну строчку - не работает
//        System.out.println("fifth round");
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

    }
}

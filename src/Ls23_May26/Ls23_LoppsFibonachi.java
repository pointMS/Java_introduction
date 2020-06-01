package Ls23_May26;

public class Ls23_LoppsFibonachi {
    public static void main(String[] args) {
        fibonacci(10);
    }

    //ex.7
    public static void fibonacci(int lastLine) {
        // 0,1,1,2,3,5,8,13,21,34
        int n0 = 0;
        int n1 = 1;

        for (int i = 1; i <= lastLine; i++) {
            int fibDigitNow = n0 + n1;
            n0 = n1;
            n1 = fibDigitNow;
            System.out.print(fibDigitNow + ", ");
        }
    }
}

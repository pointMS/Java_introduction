/**
 * First * 08.05.2020  14:28
 */
public class TestRomb {
    public static void main(String[] args) {
        int side = 5;

        for (int i = 0; i < side; i++) {
            for (int j = side; j > i; j--) {//Левое пустое пространство
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) { //Левая часть треугольника
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {//Правая часть треугольника
                System.out.print("*");
            }
            for (int j = side; j > i; j--) {//Правое пустое пространство
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = side; i >= 0; i--) {
            for (int j = side; j > i; j--) {//Левое пустое пространство
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {//Левая часть треугольника
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {//Правая часть треугольника
                System.out.print("*");
            }
            for (int j = side; j > i; j--) {//Правое пустое пространство
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}



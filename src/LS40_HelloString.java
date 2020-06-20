/**
 * FirstNewVersion
 * 17.06.2020
 */
public class LS40_HelloString {
    public static void main(String[] args) {
//String pool
        String firstName1 = "Andrej";// инициализация как литерал - better
        String firstName2 = "Andrej";

        String firstName3 = new String("Andrej"); // инициализация как объект
        String firstName4 = new String("Andrej"); // инициализация как объект

        System.out.println(firstName1 == firstName2);
        System.out.println(firstName3 == firstName4);
        System.out.println(firstName1 == firstName3);
        System.out.println(" - - - - - ");
        System.out.println("Literals: " + firstName1.equals(firstName2));
        System.out.println("Objects: " + firstName3.equals(firstName4));
        System.out.println("Literal & object " + firstName1.equals(firstName3));
        System.out.println(" - - - - - ");

    }
}

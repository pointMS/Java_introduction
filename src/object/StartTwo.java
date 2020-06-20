package object;

/**
 * FirstNewVersion
 * 16.06.2020
 */
public class StartTwo {
    public static void main(String[] args) {
        Person sasha, dasha, pasha, glasha; // создали объект класса персон - экземпляр Instance, с помощью класса person определили новый тип данных

        Person misha = new Person(100, 185); // метод говорит, как будет создаваться объект - конструктор
        // default, пустой или с параметрами

        pasha = new Person();
        sasha = new Person();
        dasha = new Person();
        glasha = new Person();


        Person[] bm13morning = {sasha, pasha, dasha, glasha, misha};
        glasha.myPrint();
        System.out.println();
    }

}

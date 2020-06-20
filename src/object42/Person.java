package object42;

/**
 * FirstNewVersion
 * 19.06.2020
 */
public class Person {
    private String name;
    private String firstName;
    public int age;

    public Person(String ln, String fn) {
        this.name = ln;
        this.firstName = fn;
    }

    public Person() {
        this("Doe", "John", 25); // вызывает конструктор, который принимает такие значения
    }

    public Person(String ln, String fn, int ad) {
        name = ln;
        firstName = fn;
        age = ad;
    }

    public void setName(String ln, String fn) {//setter может принимать два значения
        this.name = ln;
        this.firstName = fn;
    }

    public String fullName() {//это тоже геттер, без get, возвращает классовое значение, нет тела метода
        return (name + " " + firstName);
    }
}

package object;

/**
 * FirstNewVersion
 * 18.06.2020
 */
public class Human { //объект -  инициализация человека
    String name;
    int speed;
    Dog dog;

    Human() {// пустой
    }

    Human(String name) {
        this.name = name; //конструктор - инициализируй этим именем параметр класса
    }

    Human(String name, Dog dog) { // конструктор - объединили человека и собаку
        this.dog = dog;
        this.name = name;
    }

    void walk(int speedH) {//метод - скорость человека
        this.speed = speedH;
    }

    public void walkWithDog(int speedTogether) {//метод - общая скорость
        walk(speedTogether);
        dog.runAround(speed * 2); //собака бегает быстрее человека в два раза
        System.out.println("Скорость человека " + speed);

    }
}

class Dog { //объект - инициализация собаки
    String name;
    int speed;

    Dog() {//пустой
    }

    Dog(String name) {
        this.name = name;
    }

    void runAround(int speedD) {//скорость собаки
        this.speed = speedD;
        System.out.println("Скорость собаки " + speedD);
    }

}

class Test {
    public static void main(String[] args) {//здесь все запускается
        Dog myDog = new Dog("Тузик");
        Human lastMan = new Human("Васечкин", myDog);
        lastMan.walkWithDog(5);
    }
}

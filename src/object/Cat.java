package object;

import java.util.Date;

/**
 * FirstNewVersion
 * 18.06.2020
 */
public class Cat {

    private String name;// защита классовых хар. от использования в других методах
    private double price;
    private String breed;
    private Date birthDate; //utilits
    private String color;
    private boolean passport;
    private String gender;
    private double weight;
    private double height;
    private int chipNumber;
    private Address address;

    Cat() {
        setName("Пушистик");
    }

    private Date getBirthDate() {
        return birthDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {//getter только возвращает, не принимает параметры
        return name;
    }

    public void setName(String name) {//setter исполняет, принимает параметр(ы) и изменяет или создает
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
    }

    public String getBreed() {
        return breed;
    }

    private void setBreed(String breed) {//не видно в тесте
        this.breed = breed;

    }


}

class CatTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.getName());
        cat.setName("Tiger");
        System.out.println(cat.getName());
        cat.setPrice(200);

        cat.setColor("White");
        System.out.println(cat.getColor());


    }


}


class Address {
    String city;
    String street;
    int houseNumber;
    int zip;

    Address(int zip, String city, String street, int houseNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zip = zip;
    }
}

package object;

/**
 * FirstNewVersion
 * 17.06.2020
 */
public class Car {
    String modelName;
    String type;
    String motorID;
    String color = "grey";
    double volumeMotor;
    int tiles;
    int doors;
    int mileage;

    public Car() { // default constructor
    }

    public Car(String newModelName,
               String type,
               String motorID,
               String color,
               double volumeMotor,
               int tiles,
               int doors,
               int mileage) {
        // initialisation this - ссылка на объект, на самого себя
        this.modelName = newModelName;
        this.type = type;
        this.motorID = motorID;
        this.color = color;
        this.volumeMotor = volumeMotor;
        this.tiles = tiles;
        this.doors = doors;
        this.mileage = mileage;

    }

    public Car(String factoryColor) { //
        color = factoryColor;
    }

    void move(int km) {
        System.out.println("Машина проехала " + km + " km");
        mileage += km;
    }

    void paint(String newColor) {
        System.out.println("Машина окрашена в " + newColor + " из " + color);
        color = newColor;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car myNewCar = new Car();
        myNewCar.move(100);
        System.out.println(myNewCar.mileage);

        myNewCar.move(400);
        System.out.println(myNewCar.mileage);

        myNewCar.paint("rose");

        Car ferrari = new Car("yellow");
        System.out.println(ferrari.color);
    }
}
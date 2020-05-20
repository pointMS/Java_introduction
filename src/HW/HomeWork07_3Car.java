package HW;

/**
 * First
 * 29.04.2020  17:06
 */
//Напишите программу для машины на светофоре. Что делать если горит красный, жёлтый или зелёный свет.
public class HomeWork07_3Car {
    public static void main(String[] args) {
        int colour = 3;
        System.out.println(car(colour));
    }

    public static String car(int colour) {
        String light;
        switch (colour) {
            case 1:
                light = "RED - stop!";
                break;
            case 2:
                light = "GREEN - you can go!";
                break;
            case 3:
                light = "YELLOW - please wait and be ready";
                break;
            default:
                light = "Traffic light is broken :(";
                break;
        }
        return light;
    }
}

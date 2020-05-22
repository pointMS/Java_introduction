package Ls13_May11;

/**
 * First * 11.05.2020  20:54
 */
public class HW13TernaryExercises {
    public static void main(String[] args) {
        policeTernary(156);
        ampelTernary("green");

    }

    public static void policeTernary(int speed) {
        String result = "";
        result = (speed > 65) ? "штраф или лишение прав" : "легкое порицание";
        System.out.println("Если ехать со скоростью " + speed + ", то можно заработать " + result);
    }

    public static void ampelTernary(String colour) {
        String result = "";
        result = (colour == "red") ? "надо остановиться" : "можно ехать";
        System.out.println("Когда на светофоре горит " + colour + ", то " + result);
    }
}

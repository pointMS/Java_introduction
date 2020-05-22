package Ls08_Apr30;

/**
 * First
 * 30.04.2020  20:51
 */
public class TestFortune {
    public static void main(String[] args) {
        String direction = "Right";
        switch (direction) {
            case "Right":
                System.out.println("Пойдешь направо - коня потеряешь...");
                break;
            case "Left":
                System.out.println("Пойдешь налево - дракона встретишь и будешь с ним три дня биться");
                break;
            case "Straight":
                System.out.println("Пойдешь прямо - попадешь в замок, где живет принцесса, который охраняют два дракона.");
                break;
            default:
                System.out.println("Назад нельзя");
                break;

        }
    }
}

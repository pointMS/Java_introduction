package Ls07_Apr29;

/**
 * First
 * 29.04.2020  14:27
 */
//Напишите программу, которая объяснит наступление определённых событий в зависимости от выбора витязя

public class HomeWork07_2Fortune {
    public static void main(String[] args) {
        int direction = 1;
        System.out.println("Рыцарь сделал выбор: " + fortune(direction));
    }

    public static String fortune(int tryToGo) {
        String direction;
        switch (tryToGo) {
            case 1:
                direction = "Пойдешь направо - коня потеряешь...";
                break;
            case 2:
                direction = "Пойдешь налево - дракона встретишь и будешь с ним три дня биться";
                break;
            case 3:
                direction = "Пойдешь прямо - попадешь в замок, где живет принцесса, который охраняют два дракона.";
                break;
            default:
                direction = "А назад нельзя!";
                break;
        }
        return direction;
    }
}

package Ls07_Apr29;

/**
 * First
 * 29.04.2020  13:45
 */
//Напишите программу действий для сотрудника дорожной полиции, который остановил машину.
//При езде до 50км/час нарушений нет;
//за езду от 50км/час до 65км/час устное порицание и лекция на 5 минут;
//за превышение скорости от 16км/час - 40 евро штрафа;
//за езду от 100км/час до 130км/час - штраф 500 евро;
//и за езду свыше 130км/час - штраф в 1000 евро, забирание прав + на 3 года и конфискация транспортного средства.

public class HomeWork07_1Police {
    public static void main(String[] args) {

        /*police(58);
        police(85);
        police(129);
        police(140);*/
        policeTernary(158);

    }

    public static void police(int speed) {
        if (speed < 50) {
            System.out.println("Нарушений нет!");
        } else if (speed >= 51 & speed <= 65) {
            System.out.println("Предупреждение и назидательная беседа в течение 5 минут");
        } else if (speed >= 66 & speed <= 100) {
            System.out.println("Штраф 40 евро");
        } else if (speed >= 101 & speed <= 130) {
            System.out.println("Штраф 500 евро");
        } else {
            System.out.println("Штраф 1000 евро, лишение прав на 3 года и конфискация авто");
        }
    }

    public static void policeTernary(int speed) {
        String result = "";
        result = (speed > 65) ? "штраф или лишение прав" : "легкое порицание";
        System.out.println("Если ехать со скоростью " + speed + ", то можно заработать " + result);

    }
}

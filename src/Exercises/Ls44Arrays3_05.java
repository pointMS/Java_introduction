package Exercises;

/**
 * FirstNewVersion 23.06.2020
 */
public class Ls44Arrays3_05 {
    public static void main(String[] args) {
        //Arrays3-05
        //Даны два массива целых, отсортированных в порядке возрастания, внешний и внутренний,
        // верните true, если все числа во внутреннем массиве появляются во внешнем.
        // Наилучшее решение - выполнить только один «линейный» проход обоих массивов,
        // используя тот факт, что оба массива уже отсортированы.

        int[] outer1 = {1, 2, 4, 6};
        int[] a2 = {1, 2, 4, 6};
        int[] a3 = {1, 2, 4, 4, 6};

        int[] inner1 = {2, 4};
        int[] b2 = {2, 3, 4};
        int[] b3 = {2, 4};
//        System.out.println(linearIn(outer1, inner1)); // → true
//        System.out.println(linearIn(a2, b2)); // → false
//        System.out.println(linearIn(a3, b3)); // → true

        System.out.println(linearInOne(outer1, inner1));
        System.out.println(linearInOne(a2, b2));
        System.out.println(linearInOne(a3, b3));

    }

    public static boolean linearInOne(int[] outer, int[] inner) {
        int i = 0;
        int j = 0;
        while (i < inner.length && j < outer.length) {
            if (inner[i] > outer[j]) {
                j++;
            } else if (inner[i] < outer[j]) {
                return false;
            } else {
                i++;
            }
        }
        return true;
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        boolean notFound;
        for (int i = 0; i < inner.length; i++) {
            notFound = true;
            for (int j = 0; j < outer.length && notFound; j++) {
                if (outer[j] == inner[i]) {
                    notFound = false;
                }
                if (notFound) return false;
            }
        }
        return true;
    }


}


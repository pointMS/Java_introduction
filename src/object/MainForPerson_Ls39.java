package object;

/**
 * FirstNewVersion
 * 16.06.2020
 */
public class MainForPerson_Ls39 {
    public static void main(String[] args) {
        System.out.println("____________ #0");
        System.out.println(bmiIndex(175, 100, 30,"m"));
        double h1 = 155;
        double m1 = 75;

        System.out.println("____________ #1");
//        Person_Ls39 studentOne = new Person_Ls39();
//        studentOne.firstName = "Vasya";
//        studentOne.weight = 80;
//        studentOne.height = 180;
//        studentOne.age = 30;
//        studentOne.gender = "m";
//
//        System.out.println(bmiIndex(studentOne.height,
//                studentOne.weight, studentOne.age, studentOne.gender));
//
//        Person_Ls39 personTwo = new Person_Ls39();
//        personTwo.weight = 75;
//        personTwo.height = 155;
//        personTwo.firstName = "Lena";
//        personTwo.findBmiClassIndex();
//        System.out.println("____________ #2");
//        System.out.println(personTwo.bmi);
//

    }

    private static double bmiIndex(double height, double weight, int age, String gender) {
        height = height / 100;
        return weight / (height * height);
    }

}

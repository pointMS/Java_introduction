package object;

/**
 * FirstNewVersion
 * 16.06.2020
 */
public class Person {
    String firstName;
    double weight;
    double height;
    int age;
    String gender;
    boolean matriculation;
    double bmi;

    public Person() {

    }

    public Person(double personWeight, double personHeight) {
        weight = personWeight;
        height = personHeight;
    }

    public Person(String personName, double personWeight, double personHeight) {
        weight = personWeight;
        height = personHeight;
        this.firstName = personName;
        findBmiClassIndex();
    }

    public double getBmi() { //getter - get - получать

        return bmi;
    }


    public void findBmiClassIndex() {
        double personWeight = weight;
        double personHeight = height / 100;

        bmi = personWeight / (personHeight * personHeight);
    }

    void myPrint() {
        System.out.println(firstName + " first name" + " has weight " + weight + " BMI = " + bmi);
    }
}

class PersonTest {
    public static void main(String[] args) {
        Person myLittlePerson = new Person("Сидоров", 90, 175);
        myLittlePerson.myPrint();

        System.out.println("Через getter " + myLittlePerson.getBmi());
    }
}

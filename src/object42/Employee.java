package object42;

/**
 * FirstNewVersion
 * 19.06.2020
 */
public class Employee extends Person { //наследуется из Person
    private String employeeID;

    public Employee(String ln, String fn, String empId, int a) {
        super(ln, fn); // super - always first, ссылка на конструктор из супер-класса Person
        this.employeeID = empId;
        age = a;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String printAll() {
        return (fullName() + " ID: " + employeeID + " age: " + age);//fillName from the Person
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee ceo = new Employee("Doe", "Jane", "1", 25);
        Employee cto = new Employee("Miller", "John", "2", 30);
        Employee e1 = new Employee("Seregin", "Sergei", "3", 25);
        Employee e2 = new Employee("Petrov", "Petr", "4", 27);
        Employee e3 = new Employee("Vasechkin", "Vasiliy", "5", 43);
        Employee e4 = new Employee("Dmitriev", "Dmtri", "6", 36);

        cto.age++; // изменение возраста, age - параметр public! остальные недоступны
//        System.out.println(ceo.printAll());
//        System.out.println(cto.printAll());

        Employee[] factory = {ceo, cto, e1, e2, e3, e4};
        for (Employee worker : factory) {
            System.out.println(worker.printAll());
        }
        System.out.println(" - - - - - - ");

        Employee[] sortFactory = bubbleSort(factory);
        for (Employee worker : sortFactory) {
            System.out.println(worker.printAll());
        }
    }

    private static Employee[] bubbleSort(Employee[] factory) {
        boolean unsorted = true; // массив не отсортирован
        while (unsorted) {
            int count = 0;
            for (int i = 0; i < factory.length - 1; i++) {
                if (factory[i].age > factory[i + 1].age) {
                    int temp = factory[i].age;
                    factory[i].age = factory[i + 1].age;
                    factory[i + 1].age = temp;
                    count++;
                }
            }
            if (count == 0) {
                unsorted = false;
            }
        }
        return factory;
    }
}




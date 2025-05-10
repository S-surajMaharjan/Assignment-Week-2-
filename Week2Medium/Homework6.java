class Employee {
    String name;
    double salary;
    int yearsOfExperience;
    Employee(String n, double s, int y) {
        name = n; salary = s; yearsOfExperience = y;
    }
    void calculateBonus() {
        double bonus = (yearsOfExperience > 5) ? salary * 0.2 : salary * 0.1;
        System.out.println(name + "'s Bonus: " + bonus);
    }
}

public class Homework6 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 50000, 6);
        Employee e2 = new Employee("Bob", 40000, 3);
        Employee e3 = new Employee("Charlie", 60000, 10);
        e1.calculateBonus(); e2.calculateBonus(); e3.calculateBonus();
    }
}

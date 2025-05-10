class Car {
    String brand;
    int year;

    void showDetails() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class Homework10 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.year = 2020;
        Car c2 = new Car();
        c2.brand = "Ford";
        c2.year = 2022;
        c1.showDetails();
        c2.showDetails();
    }
}

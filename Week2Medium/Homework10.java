class Car {
    String brand, model;
    int price;
    Car(String b, String m, int p) {
        brand = b; model = m; price = p;
    }
    void displayIfExpensive() {
        if (price > 2000000)
            System.out.println("Expensive Car: " + brand + " " + model + " - Rs." + price);
    }
}

public class Homework10 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Fortuner", 2500000);
        Car car2 = new Car("Suzuki", "Swift", 800000);
        Car car3 = new Car("Tesla", "Model 3", 4000000);
        Car car4 = new Car("Hyundai", "i20", 1000000);
        Car car5 = new Car("BMW", "X5", 7000000);
        car1.displayIfExpensive();
        car2.displayIfExpensive();
        car3.displayIfExpensive();
        car4.displayIfExpensive();
        car5.displayIfExpensive();
    }
}

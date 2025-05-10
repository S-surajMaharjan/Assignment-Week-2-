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
        Car car1 = new Car("Mercedes", "S-Class", 25000000);
        Car car2 = new Car("Audi", "A6", 4000000);
        Car car3 = new Car("Porsche", "911", 25000000);
        Car car4 = new Car("Ford", "Mustang", 3500000);
        Car car5 = new Car("Lamborghini", "Huracan", 22000000);
        car1.displayIfExpensive();
        car2.displayIfExpensive();
        car3.displayIfExpensive();
        car4.displayIfExpensive();
        car5.displayIfExpensive();
    }
}

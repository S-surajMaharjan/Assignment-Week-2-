class Product {
    String productName;
    double price, discountPercentage;
    Product(String p, double pr, double d) {
        productName = p; price = pr; discountPercentage = d;
    }
    void calculateFinalPrice() {
        double finalPrice = price - (price * discountPercentage / 100);
        System.out.println(productName + " Final Price: " + finalPrice);
    }
}

public class Homework7 {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000, 10);
        Product p2 = new Product("Phone", 30000, 15);
        Product p3 = new Product("Tablet", 20000, 5);
        p1.calculateFinalPrice(); p2.calculateFinalPrice(); p3.calculateFinalPrice();
    }
}

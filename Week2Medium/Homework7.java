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
        Product p1 = new Product("Headphones", 1500, 20);
        Product p2 = new Product("Smartwatch", 8000, 25);
        Product p3 = new Product("Camera", 20000, 10);
        p1.calculateFinalPrice(); p2.calculateFinalPrice(); p3.calculateFinalPrice();
    }
}

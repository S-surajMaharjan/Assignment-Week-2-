class Circle {
    double radius;
    final double PI = 3.14159;
    Circle(double r) {
        radius = r;
    }
    void calculateArea() {
        System.out.println("Area: " + (PI * radius * radius));
    }
    void calculateCircumference() {
        System.out.println("Circumference: " + (2 * PI * radius));
    }
}

public class Homework9 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(10);
        circle1.calculateArea(); circle1.calculateCircumference();
        circle2.calculateArea(); circle2.calculateCircumference();
    }
}

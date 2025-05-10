class Rectangle {
    int length, width;
    Rectangle(int l, int w) {
        length = l; width = w;
    }
    void calculateArea() {
        System.out.println("Area: " + (length * width));
    }
}

public class Homework4 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(8, 9);
        Rectangle r2 = new Rectangle(5, 12);
        Rectangle r3 = new Rectangle(11, 4);
        r1.calculateArea(); r2.calculateArea(); r3.calculateArea();
    }
}

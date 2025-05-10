public class Homework2 {
    public static void main(String[] args) {
        int a = 5, b = 5;
        System.out.println("Add: " + (a + b));
        System.out.println("Subtract: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        if(b==0){
            System.out.println("Unable to divide by zero");
        }
        else{
            System.out.println("Divide: " + (a / b));
        }
    }
}

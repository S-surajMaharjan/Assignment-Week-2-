public class Homework8 {
    public static void main(String[] args) {
        int num1=5;
        int num2=6;
        char op= '+';
        if (op == '+')
            System.out.println("Result: " + (num1 + num2));
        else if (op == '-')
            System.out.println("Result: " + (num1 - num2));
        else if (op == '*')
            System.out.println("Result: " + (num1 * num2));
        else if (op == '/')
            System.out.println("Result: " + (num1 / num2));
        else
            System.out.println("Invalid operator");
    }
}

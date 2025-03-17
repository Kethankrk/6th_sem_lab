

public class Arithmetic {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]), b = Integer.parseInt(args[1]);

        System.out.println("Sum = " + (a + b));
        System.out.println("Difference = " + (a - b));
        System.out.println("Product = " + (a * b));
        System.out.println("Quotient = " + (a / b));
        System.out.println("Reminder = " + (a % b));
    }
}
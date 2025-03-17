import java.util.Scanner;

public class Convertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        
        String binary = Integer.toBinaryString(number);
        String hex = Integer.toHexString(number);
        String octal = Integer.toOctalString(number);
        
        System.out.println("Binary: " + binary);
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Octal: " + octal);
        
        sc.close();
    }
}
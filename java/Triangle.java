
import java.util.Scanner;



public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 sides of a triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a < b + c && b < a + c && c < a + b){
            System.out.println(a == b && b == c && c == a ? "Equvalent" : (a == b || b == c | c == a) ? "Isoceles" : "Scalene");
            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Area of the triangle is " + area);
        }
        else{
            System.out.println("Unable to form a triangle using the given sides!");
        }

        
        
    }
}
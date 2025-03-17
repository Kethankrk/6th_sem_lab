
import java.util.Scanner;



public class SumAndReverse {
    static void sumAndReverse(int n){
        int reverse = 0, sum = 0;

        while(n > 0){
            int d = n % 10;
            reverse = reverse * 10 + d;
            sum += d;
            n /= 10;
        }

        System.out.printf("Rverese: %d, sum: %d\n", reverse, sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sumAndReverse(num);
    }
}
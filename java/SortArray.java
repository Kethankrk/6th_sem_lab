
import java.util.Arrays;
import java.util.Scanner;


public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for(int i = 0; i < size; i++){
            System.out.printf("Enter a number [%d]: ", i);
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        System.out.printf("Smallest: %d\n", numbers[0]);
        System.out.printf("Second largest: %d\n", numbers[size - 2]);
        System.out.printf("Largest: %d\n", numbers[size - 1]);
    }
}
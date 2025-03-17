import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter another string: ");
        String s2 = sc.nextLine();

        if(s1.length() == s2.length() && Arrays.equals(s1.chars().sorted().toArray(), s2.chars().sorted().toArray())){
            System.out.println("Given strings are anagram");
        }
        else{
            System.out.println("Given strings are not anagram!");
        }

    }
}
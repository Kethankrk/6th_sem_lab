
import java.util.Scanner;


class Complex {
    int real, img;
    Complex(int real, int img){
        this.real = real;
        this.img = img;
    }

    Complex add(Complex other){
        return new Complex(this.real + other.real, this.img + other.img);
    }

    @Override
    public String toString(){
        return real + "+" + img + "i";
    }
}

public class ComplexAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a complex number: ");

        Complex num1 = new Complex(sc.nextInt(), sc.nextInt());

        System.out.print("Enter another complex number: ");
        Complex result = num1.add(new Complex(sc.nextInt(), sc.nextInt()));

        System.out.println("Sum: " + result);
    }
}
import java.util.Scanner;

abstract class Shape {
    abstract void printDetails();
}

abstract class TwoDim extends Shape{
    abstract  double getArea();
}

abstract  class ThreeDim extends Shape{
    abstract double getVolume();
}


class Square extends TwoDim {
    private int side;
    Square(int side){
        this.side = side;
    }

    @Override
    double getArea(){
        return side * side;
    }

    @Override
    void printDetails(){
        System.out.printf("The area of the given square is %f\n", getArea());
    }
}

class Triangle extends  TwoDim{
    private int b, h;

    Triangle(int b, int h) {
        this.b = b;
        this.h = h;
    }

    @Override
    double getArea(){
        return 0.5f * b * h;
    }

    @Override
    void printDetails(){
        System.out.printf("The area of the given triangle is %f\n", getArea());
    }
}

class Sphere extends ThreeDim{
    private int r;

    Sphere(int r) {
        this.r = r;
    }

    @Override
    double getVolume(){
        return (4 * Math.PI * r * r * r) / 3;
    }

    @Override
    void printDetails(){
        System.out.printf("The volume of the given Sphere is %f\n", getVolume());
    }
}

class Cube extends ThreeDim{
    private int s;

    Cube(int s) {
        this.s = s;
    }

    @Override
    double getVolume(){
        return s * s * s;
    }

    @Override
    void printDetails(){
        System.out.printf("The volume of the given cube is %f\n", getVolume());
    }
}


public class Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of a square: ");
        Square sq = new Square(sc.nextInt());

        System.out.print("Enter the base and height of a triangle respectively: ");
        Triangle tr = new Triangle(sc.nextInt(), sc.nextInt());

        System.out.print("Enter the radius of a sphere: ");
        Sphere sp = new Sphere(sc.nextInt());
        
        System.out.print("Enter the side of a cube: ");
        Cube cb = new Cube(sc.nextInt());

        sq.printDetails();
        tr.printDetails();
        sp.printDetails();
        cb.printDetails();
    }
}
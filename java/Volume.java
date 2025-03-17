import java.util.Scanner;

class Volume {
    double area(float l, float w, float h){
        return  l * w * h;
    }

    double area(float s) {
        return s * s * s ;
    }

    double area(float r, float h){
        return Math.PI * r * r * h;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Volume vol = new Volume();
        
        System.out.print("Enter the length, widht, and height of a reacangebox respectively: ");
        double rec = vol.area(sc.nextFloat(), sc.nextFloat(), sc.nextFloat());

        System.out.print("Enter the side of a cube: ");
        double cube = vol.area(sc.nextFloat());

        System.out.print("Enter the radius and height of a cylinder respectively: ");
        double cyl = vol.area(sc.nextFloat(), sc.nextFloat());

        System.out.printf("Volume\nCube:\t%f\nReactangeBox:\t%f\nCylinder:\t%f\n", cube, rec, cyl);
        sc.close();
    }
}
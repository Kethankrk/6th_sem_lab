import java.util.Scanner;


class Student {
    int admNo;

    void readDetails(Scanner sc){
        System.out.print("Enter admission number: ");
        admNo = sc.nextInt();
    }
}

class Mark extends Student {
    int[] marks = new int[5];
    int total = 0, avg;

    void readMarks(Scanner sc){
        System.out.printf("Marks of %s\n", admNo);
        for(int i = 0; i < marks.length; i++){
            System.out.print("Enter mark: ");
            marks[i] = sc.nextInt();
        }

    }

    void calculate(){
        for(int mark: marks){
            total += mark;
        }
        avg = total / marks.length;
    }

    void printDetails(){
        System.out.printf("%d\t%s\t%d\t%d\n", admNo, total > 175 ? "PASSED" : "FAILED", total, avg);
    }
}





class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        Mark[] studentMarks = new Mark[n];

        for(int i = 0; i < n; i++){
            Mark student = new Mark();
            student.readDetails(sc);
            student.readMarks(sc);
            student.calculate();
            studentMarks[i] = student;
        }
        System.out.print("AdmNo\tResult\tTotal\tAverage\n");
        for(Mark student: studentMarks){
            student.printDetails();
        }
    }
}
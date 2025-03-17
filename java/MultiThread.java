
import java.util.Scanner;


class EvenOdd implements Runnable {
    private final int limit;
    private final boolean isEven;

    EvenOdd(int limit, boolean isEven){
        this.limit = limit;
        this.isEven = isEven;
        new Thread(this).start();
    }

    @Override
    public void run(){
        for(int i = isEven ? 2 : 1; i < limit; i += 2){
            System.out.println(isEven ? i : "\t" + i);
            try {
                Thread.sleep(250);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

        new EvenOdd(limit, true);
        new EvenOdd(limit, false);
    }
}
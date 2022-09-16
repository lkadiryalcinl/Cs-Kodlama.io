import java.util.Scanner;

public class miniProject1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Type a num please : ");
        int num = in.nextInt();
        boolean isPrime = true;

        if (num == 1)
            isPrime = false;
        if (num < 0)
            System.out.println("invalid num.");

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                isPrime = false;

            if (num == 2) {
                isPrime = true;
            }
        }

        if (isPrime)
            System.out.println("prime num.");
        else
            System.out.println("not a prime num.");
    }
}

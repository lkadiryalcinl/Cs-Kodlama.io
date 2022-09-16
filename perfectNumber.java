import java.util.Scanner;

/**
 * perfectNumber
 */
public class perfectNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;

        System.out.print("please, Type a number : ");
        int typedNum = in.nextInt();

        for (int i = 1; i < typedNum; i++) {
            if (typedNum % i == 0)
                total += i;
        }

        if (total == typedNum)
            System.out.println("This typed num is perfect.");
        else
            System.out.println("This typed num is not perfect.");

    }
}
import java.util.Scanner;

public class friendsNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numTotal1 = 0;
        int numTotal2 = 0;

        System.out.print("please, Type number1 : ");
        int typedNum1 = in.nextInt();
        System.out.print("Now 2 : ");
        int typedNum2 = in.nextInt();

        for (int i = 1; i < typedNum1; i++)
            if (typedNum1 % i == 0)
                numTotal1 += i;

        for (int k = 1; k < typedNum2; k++)
            if (typedNum2 % k == 0)
                numTotal2 += k;

        if (typedNum1 == numTotal2 && typedNum2 == numTotal1)
            System.out.println("These typed nums are friend.");
        else
            System.out.println("These typed num are'nt friend.");
    }
}

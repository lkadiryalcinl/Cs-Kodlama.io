import javax.lang.model.util.ElementScanner14;

public class arrRecap {
    public static void main(String[] args) {
        double[] doubleList = { 1.2, 2.3, 3.1, 7.3, 3.9, 9.7, 5.1 };

        System.out.print("numbers : ");
        for (int i = 0; i < doubleList.length; i++) {
            if (i == doubleList.length - 1)
                System.out.print(doubleList[i]);
            else
                System.out.print(doubleList[i] + " , ");
        }

        System.out.println("\n------------------------------");
        double total = 0;

        for (double number : doubleList)
            total += number;

        System.out.println("total : " + total);

        System.out.println("------------------------------");

        double max = doubleList[0];

        for (double number : doubleList)
            if (max < number)
                max = number;

        System.out.println("Max number : " + max);
        System.out.println("------------------------------");
    }

}
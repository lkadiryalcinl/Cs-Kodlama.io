public class findMax {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 40, 70, 1, 42, 2, 7 };

        int max = arr[0];

        for (int i = 1; i < arr.length; i++)
            if (max < arr[i])
                max = arr[i];

        System.out.println(max);
    }
}

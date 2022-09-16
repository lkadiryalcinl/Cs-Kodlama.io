public class findNum {
    public static void main(String[] args) {
        int[] numberArr = { 1, 2, 5, 6, 23, 8, 2, 4 };
        int needToFind = 23;
        boolean isHere = false;

        for (int i = 0; i < numberArr.length; i++)
            if (needToFind == numberArr[i])
                isHere = true;

        if (isHere)
            System.out.println("We find the " + needToFind + " number in the array.");
        else
            System.out.println("We didn't find the " + needToFind + " number in the array.");
    }
}

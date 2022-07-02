import java.util.Scanner;

class MissingNumberFinder {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int size = in.nextInt();
            if (size > 0) {
                int[] arr = new int[size - 1];
                for (int i = 0; i < size - 1; i++)
                    arr[i] = in.nextInt();
                System.out.println(missingNumberFinder(arr, size));
            }
        }
    }

    static int missingNumberFinder(int array[], int n) {
        // write your code here

        int count = 0;
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            count += array[i];
        }

        for (int i = 1; i <= n; i++) {
            total += i;
        }

        return (total - count);
    }

}

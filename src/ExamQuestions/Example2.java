package ExamQuestions;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Example2 {
    public static int quickSelect(int[] b, int low, int high, int k) {
        int pivot = b[high];
        int pivotloc = low;

        for (int i = low; i < high; i++) {
            if (b[i] < pivot) {
                int temp = b[i];
                b[i] = b[pivotloc];
                b[pivotloc] = temp;
                pivotloc++;
            }
        }
        int temp = b[high];
        b[high] = b[pivotloc];
        b[pivotloc] = temp;

        if (pivotloc == k) {
            return b[pivotloc];
        } else if (pivotloc > k) {
            return quickSelect(b, low, pivotloc - 1, k);
        } else {
            return quickSelect(b, pivotloc + 1, high, k);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = ThreadLocalRandom.current().nextInt(1, 101);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }

        int[] b = new int[n];
        int l = n - 1;

        for (int i = 0; i < n; i++) {
            b[i] = a[i][l--];
        }

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += quickSelect(b, 0, n - 1, i);
        }

        for (int i = 0; i < n; i++) {
            b = Arrays.stream(b).sorted().toArray();
            System.out.println(b[i]);
        }

        System.out.println("\n" + sum);
    }
}

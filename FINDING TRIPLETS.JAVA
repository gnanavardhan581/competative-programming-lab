import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] a = new long[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextLong();

        long x = sc.nextLong();

        Arrays.sort(a);

        boolean found = false;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && a[i] == a[i - 1])
                continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                long sum = a[i] + a[left] + a[right];

                if (sum == x) {
                    System.out.println(a[i] + " " + a[left] + " " + a[right]);
                    found = true;

                    long leftValue = a[left];
                    long rightValue = a[right];

                    while (left < right && a[left] == leftValue)
                        left++;

                    while (left < right && a[right] == rightValue)
                        right--;
                } else if (sum < x) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        if (!found)
            System.out.println("No Triplet Found");
    }
}

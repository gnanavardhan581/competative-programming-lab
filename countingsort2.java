import java.util.Scanner;

public class Solution {
    public static void countingSort(int[] arr) {
        int[] count = new int[100];
        
        for (int num : arr) {
            count[num]++;
        }
        
        boolean first = true;
        for (int i = 0; i < 100; i++) {
            while (count[i] > 0) {
                if (!first) {
                    System.out.print(" ");
                }
                System.out.print(i);
                first = false;
                count[i]--;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            countingSort(arr);
        }
        scanner.close();
    }
}

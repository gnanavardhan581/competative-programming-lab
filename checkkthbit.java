import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            
            if (((n >> k) & 1) == 1) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        
        scanner.close();
    }
}

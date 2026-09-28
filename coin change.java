import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] coins = new int[m];

        for (int i = 0; i < m; i++)
            coins[i] = sc.nextInt();

        long[] dp = new long[n + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int j = coin; j <= n; j++) {
                dp[j] += dp[j - coin];
            }
        }

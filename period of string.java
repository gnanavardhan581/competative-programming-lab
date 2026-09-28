import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int n = s.length();
        int[] lps = new int[n];
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int n = s.length();
        int[] lps = new int[n];

        for (int i = 1, j = 0; i < n; i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j))
                j = lps[j - 1];

            if (s.charAt(i) == s.charAt(j))
                j++;

            lps[i] = j;
        }

        int period = n - lps[n - 1];

        if (n % period == 0)
            System.out.println(period);
        else
            System.out.println(n);

        sc.close();
    }
}

        for (int i = 1, j = 0; i < n; i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j))
                j = lps[j - 1];

            if (s.charAt(i) == s.charAt(j))
                j++;

            lps[i] = j;
        }

        int period = n - lps[n - 1];

        if (n % period == 0)
            System.out.println(period);
        else
            System.out.println(n);

        sc.close();
    }
}

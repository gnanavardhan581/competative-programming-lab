import java.io.*;
import java.util.*;

public class Main {
    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Long> list = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.trim().split("\\s+");
            for (String x : parts) {
                if (!x.isEmpty())
                    list.add(Long.parseLong(x));
            }
        }

        if (list.size() == 3) {
            check(list.get(0), list.get(1), list.get(2));
        } else {
            int q = list.get(0).intValue();
            int index = 1;

            for (int i = 0; i < q; i++) {
                check(list.get(index), list.get(index + 1), list.get(index + 2));
                index += 3;
            }
        }
    }

    static void check(long a, long b, long t) {
        if (t == 0 || (t <= Math.max(a, b) && t % gcd(a, b) == 0))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

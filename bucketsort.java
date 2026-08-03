import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<List<Double>> buckets = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            double x = sc.nextDouble();
            int index = (int) (x * n);
            buckets.get(index).add(x);
        }

        for (List<Double> bucket : buckets) {
            Collections.sort(bucket);
        }

        boolean first = true;
        for (List<Double> bucket : buckets) {
            for (double x : bucket) {
                if (!first) System.out.print(" ");
                System.out.printf("%.2f", x);
                first = false;
            }
        }
    }
}

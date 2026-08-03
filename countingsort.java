import java.io.*;
import java.util.*;

public class Solution {

    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> freq = new ArrayList<>(Collections.nCopies(100, 0));
        for (int num : arr) {
            freq.set(num, freq.get(num) + 1);
        }
        return freq;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(arrTemp[i]));
        }

        List<Integer> result = countingSort(arr);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i != result.size() - 1) {
                System.out.print(" ");
            }
        }

        bufferedReader.close();
    }
}

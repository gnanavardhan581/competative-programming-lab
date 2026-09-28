import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().trim();
        String p = br.readLine().trim();

        int i = 0, j = 0;
        int star = -1;
        int match = 0;

        while (i < s.length()) {
            if (j < p.length() &&
                (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
                i++;
                j++;
            } 
            else if (j < p.length() && p.charAt(j) == '*') {
                star = j;
                match = i;
                j++;
            } 
            else if (star != -1) {
                j = star + 1;
                match++;
                i = match;
            } 
            else {
                System.out.println(0);
                return;
            }
        }

        while (j < p.length() && p.charAt(j) == '*') {
            j++;
        }

        System.out.println(j == p.length() ? 1 : 0);
    }
}

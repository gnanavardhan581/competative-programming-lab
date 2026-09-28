import java.util.*;

public class Main {
    static String getAbbr(String s) {
        StringBuilder x = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c))
                x.append(c);
        }

        return x.toString();
    }

    static boolean match(String abbr, String pattern) {
        int j = 0;

        for (int i = 0; i < abbr.length() && j < pattern.length(); i++) {
            if (abbr.charAt(i) == pattern.charAt(j))
                j++;
        }

        return j == pattern.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String line = sc.nextLine();
        String pattern = sc.nextLine().trim();

        String[] words = line.split(",");

        List<String> result = new ArrayList<>();

        for (String word : words) {
            word = word.trim();
            String abbr = getAbbr(word);

            if (match(abbr, pattern))
                result.add(word);
        }

        result.sort((a, b) -> {
            String x = getAbbr(a);
            String y = getAbbr(b);

            int cmp = x.compareTo(y);

            if (cmp != 0)
                return cmp;

            return a.compareTo(b);
        });

        if (result.isEmpty()) {
            System.out.println("No match found");
        } else {
            for (String word : result)
                System.out.println(word);
        }

        sc.close();
    }
}

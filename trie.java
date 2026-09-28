import java.util.*;

public class Main {
    static class Node {
        Node[] child = new Node[26];
        boolean end;
    }

    static Node root = new Node();

    static void insert(String s) {
        Node current = root;

        for (char c : s.toCharArray()) {
            int index = c - 'a';

            if (current.child[index] == null) {
                current.child[index] = new Node();
            }

            current = current.child[index];
        }

        current.end = true;
    }

    static boolean search(String s) {
        Node current = root;

        for (char c : s.toCharArray()) {
            int index = c - 'a';

            if (current.child[index] == null) {
                return false;
            }

            current = current.child[index];
        }

        return current.end;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String input = sc.next();

        String[] words = input.split(",");

        for (String word : words) {
            insert(word);
        }

        String search = sc.next();

        if (search(search)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

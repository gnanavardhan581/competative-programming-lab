import java.util.*;

public class Main {
    static int n;

    static boolean bfs(int[][] graph, int s, int t, int[] parent) {
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.add(s);
        visited[s] = true;
        parent[s] = -1;

        while (!q.isEmpty()) {
            int u = q.poll();

            for (int v = 0; v < n; v++) {
                if (!visited[v] && graph[u][v] > 0) {
                    q.add(v);
                    parent[v] = u;
                    visited[v] = true;

                    if (v == t)
                        return true;
                }
            }
        }

        return false;
    }

    static int maxFlow(int[][] graph, int s, int t) {
        int[][] residual = new int[n][n];

        for (int i = 0; i < n; i++)
            residual[i] = graph[i].clone();

        int[] parent = new int[n];
        int flow = 0;

        while (bfs(residual, s, t, parent)) {
            int pathFlow = Integer.MAX_VALUE;

            for (int v = t; v != s; v = parent[v]) {
                int u = parent[v];
                pathFlow = Math.min(pathFlow, residual[u][v]);
            }

            for (int v = t; v != s; v = parent[v]) {
                int u = parent[v];
                residual[u][v] -= pathFlow;
                residual[v][u] += pathFlow;
            }

            flow += pathFlow;
        }

        return flow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int e = sc.nextInt();

        int[][] graph = new int[n][n];

        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int capacity = sc.nextInt();

            graph[u][v] += capacity;
        }

        System.out.println(maxFlow(graph, 0, n - 1));

        sc.close();
    }
}

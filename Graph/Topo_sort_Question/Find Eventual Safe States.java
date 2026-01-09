package Topo_sort_Question;

import java.util.*;

class FindEventualSafeStates {
    // LeetCode 802: Find Eventual Safe States
    // Approach: Reverse graph + Kahn's BFS (topological pruning)
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> rev = new ArrayList<>(n);
        for (int i = 0; i < n; i++) rev.add(new ArrayList<>());

        // inDegree counts original out-degree per node
        int[] inDegree = new int[n];
        for (int u = 0; u < n; u++) {
            for (int v : graph[u]) {
                rev.get(v).add(u); // reverse edge v -> u
                inDegree[u]++;     // original out-degree
            }
        }

        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) if (inDegree[i] == 0) q.add(i);

        List<Integer> safe = new ArrayList<>();
        while (!q.isEmpty()) {
            int node = q.poll();
            safe.add(node);
            for (int prev : rev.get(node)) {
                if (inDegree[prev] > 0 && --inDegree[prev] == 0) {
                    q.add(prev);
                }
            }
        }

        Collections.sort(safe);
        return safe;
    }

    public static void main(String[] args) {
        int[][] graph = {
            {1,2},    // 0 -> 1,2
            {2,3},    // 1 -> 2,3
            {5},      // 2 -> 5
            {0},      // 3 -> 0 (cycle with 0,1,3)
            {5},      // 4 -> 5
            {},       // 5 terminal
            {}        // 6 terminal
        };
        FindEventualSafeStates solver = new FindEventualSafeStates();
        List<Integer> res = solver.eventualSafeNodes(graph);
        System.out.println(res); // Expected: [2,4,5,6]
    }
}

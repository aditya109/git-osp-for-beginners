/*
There is an undirected connected tree with n nodes labeled from 0 to n - 1 and n - 1 edges.

You are given the integer n and the array edges where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the tree.

Return an array answer of length n where answer[i] is the sum of the distances between the ith node in the tree and all other nodes.

Input: n = 6, edges = [[0,1],[0,2],[2,3],[2,4],[2,5]]
Output: [8,12,6,10,10,10]


*/

public int[] sumOfDistancesInTree(int N, int[][] edges) {
        if (N == 1) {
            return new int[N];
        }
        if (N == 2) {
            return new int[]{1, 1};
        }
        
        List<int[]>[] graph = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges.length; i++) {
            // [0] = to  [1] = sum  [2] = num
            graph[edges[i][0]].add(new int[]{edges[i][1], 0, 0}); 
            graph[edges[i][1]].add(new int[]{edges[i][0], 0, 0});
        }
        
        int[] result = new int[N];
        boolean[] seen = new boolean[N];
        for (int i = 0; i < N; i++) {
            result[i] = dfs(graph, i, seen)[0];
        }
        return result;
    }

    private int[] dfs(List<int[]>[] graph, int i, boolean[] seen) {
        seen[i] = true;
        int sum = 0;
        int num = 1;
        for (int[] adj : graph[i]) {
            if (!seen[adj[0]]) {
                if (adj[1] == 0 && adj[2] == 0) {
                    int[] res = dfs(graph, adj[0], seen);
                    adj[1] = res[0];
                    adj[2] = res[1];
                }
                sum += (adj[1] + adj[2]);
                num += adj[2];
            }
        }
        seen[i] = false;
        return new int[]{sum, num};
    }

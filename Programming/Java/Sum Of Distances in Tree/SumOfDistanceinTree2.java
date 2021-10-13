/*
Question:
Suppose there is a tree with N nodes labelled from 0 to n-1
We have to return an array of length n where there is sum of each and every branch from root to leaf.
*/

/*
Steps to solve the algo:

--> Take node 0 as root
1. Initial an array of hashset tree, tree[i] contains all connected nodes to i.
2. Initial an array count, count[i] counts all nodes in the subtree i.
3. Initial an array of res, res[i] counts sum of distance in subtree i.

4.Post order dfs traversal, update count and res:
    count[root] = sum(count[i]) + 1
    res[root] = sum(res[i]) + sum(count[i])
5.
Pre order dfs traversal, update res:
    When we move our root from parent to its child i, count[i] points get 1 closer to root, n - count[i] nodes get 1 futhur to root.
    res[i] = res[root] - count[i] + N - count[i]

    return res, done.
*/


import java.util.*;

class Solution {

    int[] res, count;
    ArrayList<HashSet<Integer>> tree;

    public int[] sumOfDistancesInTree(int N, int[][] edges) {
        tree = new ArrayList<HashSet<Integer>>();
        res = new int[N];
        count = new int[N];
        for (int i = 0; i < N ; ++i)
            tree.add(new HashSet<Integer>());
        for (int[] e : edges) {
            tree.get(e[0]).add(e[1]);
            tree.get(e[1]).add(e[0]);
        }
        dfs(0, -1);
        dfs2(0, -1);
        return res;
    }

    public void dfs(int root, int pre) {
        for (int i : tree.get(root)) {
            if (i == pre) continue;
            dfs(i, root);
            count[root] += count[i];
            res[root] += res[i] + count[i];
        }
        count[root]++;
    }


    public void dfs2(int root, int pre) {
        for (int i : tree.get(root)) {
            if (i == pre) continue;
            res[i] = res[root] - count[i] + count.length - count[i];
            dfs2(i, root);
        }
    }

    public static void main(String [] args){
        Solution s1 = new Solution();
        int N = 4;
        int[][] edges = new int[N][N];
        s1.sumOfDistancesInTree(N, edges);

    } 
} 

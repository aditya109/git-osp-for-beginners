#include <iostream>
#include <array>
#include <climits>
#include <cstring>
using namespace std;
#define N 4UL
int t[21][(1 << 21)];
// If all cities have been visited
int VISITED_ALL = (1 << N) - 1;
int tsp(array<array<int, N>, N> const& graph, int mask, int i) {
    if (mask == VISITED_ALL) {
        return graph[i][0];
    }
    // if already visited
    if (t[i][mask] != -1) {
        return t[i][mask];
    }
    int ans = INT_MAX;
    // Try to goto an unvisited city
    for (size_t city = 0; city < N; city++) {
        if ((mask & (1 << city)) == 0) {
            ans = min(ans, graph[i][city] + tsp(graph, mask ^ (1 << city), city));
        }
    }
    
    return t[i][mask] = ans; // saving and return the ans
}
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    memset(&t, -1, sizeof t);
    // Adj matrix which defines the graph
    array<array<int, N>, N> graph = {{
        {0, 20, 42, 25},
        {20, 0, 30, 34},
        {42, 30, 0, 10},
        {25, 34, 10, 0},
    }};
    cout << tsp(graph, 1, 0);       // initial mask = 0001, initial city = 0
    // 85;
    return 0;
}
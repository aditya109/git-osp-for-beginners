'use strict';

const Queue = require('./02.Queue');
const Graph = require('./03.Graph');

function bfs(graph, visited, node, result) {
  const queue = new Queue();

  queue.enqueue(node);
  visited[node] = true;

  while (!queue.isEmpty()) {
    const front = queue.dequeue();
    result.ans += front;

    let temp = graph.list[front].head;
    while (temp) {
      if (!visited[temp.data]) {
        queue.enqueue(temp.data);
        visited[temp.data] = true;
      }
      temp = temp.nextElement;
    }
  }
}

function bfsTraversal(g) {
  let result = {
    ans: '',
  };
  let num_of_vertices = g.vertices;

  const visited = new Array(num_of_vertices).fill(false);

  for (let i = 0; i < num_of_vertices; i++) {
    if (!visited[i]) {
      bfs(g, visited, i, result);
    }
  }

  return result.ans;
}

let g1 = new Graph(6);
g1.addEdge(1, 2);
g1.addEdge(1, 3);
g1.addEdge(2, 4);
g1.addEdge(2, 5);
console.log(bfsTraversal(g1, 0));

'use strict';
const LinkedList = require('./01.LinkedList');
const Node = require('./00.Node');

module.exports = class Graph {
  constructor(vertices) {
    this.vertices = vertices;

    this.list = [];

    var it;
    for (it = 0; it < vertices; it++) {
      let temp = new LinkedList();
      this.list.push(temp);
    }
  }

  addEdge(source, destination) {
    if (source < this.vertices && destination < this.vertices)
      this.list[source].insertAtHead(destination);
    return this;
  }

  printGraph() {
    console.log('>>Adjacency List of Directed Graph<<');
    var i;
    for (i = 0; i < this.list.length; i++) {
      process.stdout.write('|' + String(i) + '| => ');
      let temp = this.list[i].getHead();
      while (temp != null) {
        process.stdout.write('[' + String(temp.data) + '] -> ');
        temp = temp.nextElement;
      }
      console.log('null ');
    }
  }

  strGraph() {
    let str = '';
    var i;
    for (i = 0; i < this.list.length; i++) {
      str = str + '|' + String(i) + '| => ';
      let temp = this.list[i].getHead();
      while (temp != null) {
        str += '[' + String(temp.data) + '] -> ';
        temp = temp.nextElement;
      }
      str += 'null ';
    }
    return str;
  }
};

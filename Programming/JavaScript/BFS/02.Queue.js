'use strict';

module.exports = class Queue {
  constructor(mySize) {
    this.items = [];
    this.size = mySize;
    this.front = 0;
    this.back = -1;
  }

  isFull() {
    return this.items.length >= this.size;
  }

  isEmpty() {
    return this.items.length == 0;
  }

  getFront() {
    if (this.items.length != 0) {
      return this.items[0];
    } else {
      console.log('No elements in the queue');
    }
  }

  enqueue(element) {
    if (this.items.length >= this.size) {
      console.log('Queue is full');
    } else {
      this.items.push(element);
    }
  }

  dequeue() {
    if (this.items.length == 0) {
      console.log('No elements');
    } else {
      return this.items.shift();
    }
  }
};

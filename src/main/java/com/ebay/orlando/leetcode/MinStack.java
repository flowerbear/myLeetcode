package com.ebay.orlando.leetcode;

public class MinStack {
  Node top = null;

  public void push(int x) {
    if (top == null) {
      top = new Node(x);
      top.min = x;
      top.next = null;
    } else {
      Node tmp = new Node(x);
      tmp.next = top;
      tmp.min = top.min >= x ? x : top.min;
      top = tmp;
    }
  }

  public void pop() {
    top = top.next;
  }

  public int top() {
    return top == null ? 0 : top.val;
  }

  public int getMin() {
    return top == null ? 0 : top.min;
  }
}


class Node {
  int val;
  int min;
  Node next;

  public Node(int val) {
    this.val = val;
  }
}

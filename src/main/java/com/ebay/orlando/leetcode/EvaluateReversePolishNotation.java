package com.ebay.orlando.leetcode;

import java.util.Stack;

public class EvaluateReversePolishNotation {
  public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<Integer>();
    for (String token : tokens) {
      if (token.charAt(0) >= '0' && token.charAt(0) <= '9' || token.length() != 1) {
        stack.push(Integer.parseInt(token));
      } else {
        Integer opB = stack.pop();
        Integer opA = stack.pop();
        if (token.equals("+"))
          stack.push(opA + opB);
        else if (token.equals("-"))
          stack.push(opA - opB);
        else if (token.equals("*"))
          stack.push(opA * opB);
        else
          stack.push(opA / opB);
      }
    }

    if (stack.isEmpty()) return 0;
    return stack.pop();
  }
}

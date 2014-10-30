package com.ebay.orlando.leetcode;

public class ReverseWordsinaString {
  public String reverseWords(String s) {
    if (s == null || s.length() == 0) {
      return "";
    }
    StringBuilder str = new StringBuilder();

    String[] stringArray = s.split(" ");
    for (int i = stringArray.length - 1; i >= 0; i--) {
      if (!stringArray[i].trim().equals("")) {
        str.append(stringArray[i]).append(" ");
      }
    }
    return str.toString().trim();
  }

  public String reverseWords1(String s) {
    StringBuilder reversed = new StringBuilder();
    int j = s.length();
    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) == ' ') {
        j = i;
      } else if (i == 0 || s.charAt(i - 1) == ' ') {
        if (reversed.length() != 0) {
          reversed.append(' ');
        }
        reversed.append(s.substring(i, j));
      }
    }
    return reversed.toString();
  }
}

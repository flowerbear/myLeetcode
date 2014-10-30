package com.ebay.orlando.leetcode;

public class FindMinimumInRotatedSortedArray {

  public int findMin(int[] num) {
    int len = num.length;
    if (len == 0) {
      return 0;
    } else if (len == 1) {
      return num[0];
    } else {
      int i = 0, j = len - 1;
      while (i < j && num[i] > num[j]) {
        int m = (i + j) / 2;
        if (num[m] > num[j]) {
          i = m + 1;
        } else if (num[m] < num[i]) {
          j = m;
        }
      }
      return num[i];
    }
  }
}

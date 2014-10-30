package com.ebay.orlando.leetcode;

public class FindMinimumInRotatedSortedArrayII {
  // Normal implementation. O(n)
  public int findMin(int[] num) {
    int len = num.length;
    if (len == 0) {
      return 0;
    } else if (len == 1) {
      return num[0];
    } else {
      int min = num[0];
      for (int i = 1; i < len; i++) {
        if (num[i] < min) {
          min = num[i];
          break;
        }
      }
      return min;
    }
  }

  // Binary search. O(log(n))
  // for case [1, 1, 1, 0, 1] or [1, 0, 1, 1, 1] num[i] = num[m] = num[j]
  public int findMin1(int[] num) {
    int len = num.length;
    if (len == 0) {
      return 0;
    } else if (len == 1) {
      return num[0];
    } else {
      int i = 0, j = len - 1;
      while (i < j) {
        if (num[i] < num[j]) {
          return num[i];
        }
        int m = (i + j) / 2;
        if (num[i] > num[m]) {
          j = m;
        } else if (num[i] < num[m]) {
          i = m + 1;
        } else {
          if (num[m] > num[j]) {
            i = m + 1;
          } else {
            i++;
            j--;
          }
        }
      }
      return num[i];
    }
  }
}

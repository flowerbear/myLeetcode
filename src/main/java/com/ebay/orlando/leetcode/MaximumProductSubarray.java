package com.ebay.orlando.leetcode;

public class MaximumProductSubarray {

  public int maxProduct(int[] A) {
    assert A.length > 0;
    int max = A[0], min = A[0], maxAns = A[0];
    for (int i = 1; i < A.length; i++) {
      int mx = max, mi = min;
      max = Math.max(Math.max(A[i], mx * A[i]), mi * A[i]);
      min = Math.min(Math.min(A[i], mx * A[i]), mi * A[i]);
      maxAns = Math.max(maxAns, max);
    }
    return maxAns;
  }
}

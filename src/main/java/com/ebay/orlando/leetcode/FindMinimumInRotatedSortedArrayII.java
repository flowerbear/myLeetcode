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
            int i = 0, j = 1;
            for (; j < len; j++) {
                if (num[j] >= num[i]) {
                    i++;
                } else {
                    return num[j];
                }
            }
            return num[0];
        }
    }
	
	// Binary search. O(log(n))
	public int findMin1(int[] num) {
		return 1;
	}
}

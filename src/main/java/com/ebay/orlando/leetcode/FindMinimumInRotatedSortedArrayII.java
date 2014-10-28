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
    // for case [1, 1, 1, 0, 1] or [1, 0, 1, 1, 1] num[i] = num[m] = num[j]
    public int findMin1(int[] num) {
        int len = num.length;
        if (len == 0) {
            return 0;
        } else if (len == 1) {
            return num[0];
        } else {
            int i = 0, j = len - 1;
            for (; i < j && num[i] >= num[j];) {
                int m = (i + j) / 2;
                if (num[m] > num[j]) {
                    i = m + 1;
                } else if (num[m] < num[i]) {
                    j = m;
                } else {
                    i = i + 1;
                }
            }
            return num[i];
        }
    }
}

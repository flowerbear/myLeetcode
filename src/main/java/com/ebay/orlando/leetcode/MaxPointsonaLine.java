package com.ebay.orlando.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MaxPointsonaLine {
  public static int maxPoints(Point[] points) {
    if (points == null) {
      return 0;
    } else if (points.length <= 2) {
      return points.length;
    } else {
      int max = 0;
      Map<Double, Integer> temp = new HashMap<Double, Integer>();
      for (int i = 0; i < points.length; i++) {
        temp.clear();
        int dup = 1;
        for (int j = 0; j < points.length; j++) {
          double slope = 0.00;
          if (j == i) {
            continue;
          } else if (points[i].x == points[j].x && points[i].y == points[j].y) {
            dup++;
            continue;
          } else if (points[i].x == points[j].x) {
            slope = Integer.MAX_VALUE;
          } else {
            slope = 1.0 * (points[i].y - points[j].y) / (points[i].x - points[j].x);
          }
          temp.put(slope, temp.containsKey(slope) ? temp.get(slope) + 1 : 1);
        }
        if (temp.size() == 0) {
          max = dup;
        } else {
          for (Double slope : temp.keySet()) {
            max = Math.max(max, dup + temp.get(slope));
          }
        }
      }
      return max;
    }
  }
  
  public static void main(String[] args)  {
    Point[] points = new Point[]{new Point(84,250),new Point(0,0),new Point(1,0),new Point(0,-70),new Point(0,-70),new Point(1,-1),new Point(21,10),new Point(42,90),new Point(-42,-230)};
    System.out.println(maxPoints(points));
  }
}


class Point {
  int x;
  int y;

  Point() {
    x = 0;
    y = 0;
  }

  Point(int a, int b) {
    x = a;
    y = b;
  }
}

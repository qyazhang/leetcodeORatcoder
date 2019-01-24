package practice.Sort;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPoints {

  public int[][] kClosest(int[][] points, int K) {

    PriorityQueue<int[]> pq = new PriorityQueue<int[]>((p1, p2) -> p2[0] * p2[0] + p2[1] * p2[1] - p1[0] * p1[0] - p1[1] * p1[1]);
    for (int[] p : points) {
      pq.offer(p);
      if (pq.size() > K) {
        pq.poll();
      }
    }
    int[][] res = new int[K][2];
    while (K > 0) {
      res[--K] = pq.poll();
    }
    return res;

  }


}

//class Point {
//  int x;
//  int y;
//  Point(int a, int b) {
//    this.x = a;
//    this.y = b;
//  }
//}

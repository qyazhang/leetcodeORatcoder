package practice.Tree;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTreesI {
  public int numTrees(int n) {

    return dfsCount(1, n);

  }

  public int dfsCount(int start, int end) {

    if (start>=end) return 1;
    else {
      int sum = 0;
      for (int i=start;i<=end;i++) {
        sum += dfsCount(start, i-1)*dfsCount(i+1,start);
        System.out.println(sum);
      }
      return sum;
    }

  }

}

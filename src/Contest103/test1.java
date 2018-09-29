
package Contest103;

import java.util.Arrays;

public class test1 {

  public int smallestRangeI(int[] A, int K) {

    int minValue = Integer.MAX_VALUE;
    Arrays.sort(A);
    for (int i=-K;i<=K;i++) {
      int tem = A[0]+i;
      int max = 0;
      for (int j=1;j<A.length;j++){
        if (tem>=A[j]-K&&tem<=A[j]+K) max = Math.max(max, 0);
        else if (tem<A[j]-K) max = Math.max(max, Math.abs(A[j]-K-tem));
        else max = Math.max(max, Math.abs(A[j]+K-tem));
      }
      minValue = Math.min(minValue, max);
    }
    return minValue;
  }

}

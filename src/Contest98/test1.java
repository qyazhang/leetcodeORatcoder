
package Contest98;

import java.util.HashSet;

public class test1 {

  public int[] fairCandySwap(int[] A, int[] B) {

    int sumA = 0;
    int sumB = 0;
    HashSet<Integer> tempB = new HashSet<>();

    for (int i=0;i<A.length;i++) {
      sumA+=A[i];
    }
    for (int i=0;i<B.length;i++) {
      sumB+=B[i];
      tempB.add(B[i]);
    }

    int diff = sumA - sumB;

    int[] res = new int[2];

    for (int i=0;i<A.length;i++) {
      int wanted = A[i] - diff/2;
      if (tempB.contains(wanted)) {
        res[0] = A[i];
        res[1] = wanted;
        break;
      }
    }

    return res;
  }

}

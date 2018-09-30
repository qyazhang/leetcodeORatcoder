
package leetcode.leetcodeContest102;

import java.util.Arrays;

public class test4 {

  public int sumSubseqWidths(int[] A) {
    int sum = 0;
    int mod = 1000000007;
    Arrays.sort(A);
    for (int i = 0; i < A.length - 1; i++) {
      for (int j = i + 1; j < A.length; j++) {

        int numA = A[i];
        int numB = A[j];
        long diff = Math.abs(numA - numB);

        long tempSum = diff * (long) (Math.pow(2, j - i - 1) % mod);
        tempSum = tempSum % mod;
        long sumT = (sum + tempSum);
        sumT = sumT % mod;
        sum = (int) sumT;

      }
    }
    return sum;
  }
//[5,69,89,92,31,16,25,45,63,40,16,56,24,40,75,82,40,12,50,62,92,44,67,38,92,22,91,24,26,21,100,42,23,56,64,43,95,76,84,79,89,4,16,94,16,77,92,9,30,13]
}

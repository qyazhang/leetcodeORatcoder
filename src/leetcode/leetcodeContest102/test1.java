
package leetcode.leetcodeContest102;

public class test1 {

  class Solution {
    public int[] sortArrayByParity(int[] A) {

      int start = 0;
      int end = A.length - 1;
      while (start < end) {

        if (A[start] % 2 == 1 && A[end] % 2 == 0) {
          int temp = A[start];
          A[start] = A[end];
          A[end] = temp;
          start++;
          end--;
        } else if (A[start] % 2 == 0) start++;
        else if (A[end] % 2 == 1) end--;

      }
      return A;
    }
  }

}

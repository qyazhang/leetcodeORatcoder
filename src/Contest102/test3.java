package Contest102;

import java.util.Arrays;

public class test3 {

  static public void main(String[] args) {

    int[] A = {71,55,82,55};
    int res = sumSubarrayMins(A);
    System.out.println(res);

  }

  static public int sumSubarrayMins(int[] A) {

    double mod = Math.pow(10,9)+7;
    double sum = 0;
    for (int i=0;i<A.length;i++){
      int num = A[i];
      int len = 1;
      int start = i;
      int end = i;
      while (true) {
        if (start>=0&&A[start]>=num) start--;
        if (start==-1) break;
        if (A[start]<num) break;
      }
      while (true) {
        if (end<A.length&&A[end]>=num) end++;
        if (end==A.length) break;
        if (A[end]<num) break;
      }
      len = end - start -1;
      int count = len;
      if (!(i==end-1||i==start+1)) {
        int le = i-start-1;
        int ri = end-i-1;
        count = (1+len)*len/2 - (1+le)*le/2 - (1+ri)*ri/2;
      }
//      System.out.println("num "+num);
//      System.out.println("i "+i+" left "+start+" right "+end);
//
//      System.out.println("len" +len);
//      System.out.println("len num "+count);
      double tempSum = count*num%mod;
      sum = (sum + tempSum)%mod;
    }
    return (int)sum;
  }
}

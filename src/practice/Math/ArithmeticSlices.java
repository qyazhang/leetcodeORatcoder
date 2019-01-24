package practice.Math;

public class ArithmeticSlices {

  public int numberOfArithmeticSlices(int[] A) {

    int len = 2;
    int res = 0;
    for (int i=2; i<A.length; i++) {
      if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
        len += 1;
      } else {
        res += (len - 1) * (len - 2) / 2;
        len = 2;
      }
      System.out.println(len);
    }
    if (len!=2) res+=(len - 1) * (len - 2) / 2;
    return res;
    
//    这个是discussion里面的写法，真的amazing
//    int curr = 0, sum = 0;
//    for (int i=2; i<A.length; i++)
//      if (A[i]-A[i-1] == A[i-1]-A[i-2]) {
//        curr += 1;
//        sum += curr;
//      } else {
//        curr = 0;
//      }
//    return sum;

  }

}

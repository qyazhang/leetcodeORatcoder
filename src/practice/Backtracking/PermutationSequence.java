package practice.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {

  public String getPermutation(int n, int k) {
    List<Integer> nums = new ArrayList<>();
    if (n==0) return "";
    for (int i = 1; i <= n; i++) {
      nums.add(i);
    }
    char[] res = new char[n];
    int pos = 0;
    while (pos < n) {

      int oneGroupNum = fact(n - pos - 1);
      if (k!=0){
        int groupNum = (k - 1) / oneGroupNum;
        System.out.println(groupNum);
        System.out.println(nums.get(groupNum));
        res[pos] = (char) ('0' + nums.get(groupNum));
        nums.remove(groupNum);
        k = k % oneGroupNum;
        pos++;
      }
      if (k==0) {
        res[pos] = (char) ('0' + nums.get(0));
        pos++;
      }


    }
    return String.valueOf(res);

  }


  public int fact(int n) {
    if (n == 1 || n == 0) return 1;
    else return n * fact(n - 1);
  }

}

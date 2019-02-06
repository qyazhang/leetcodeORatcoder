package practice.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

  //如果考虑backtracking的话，写一个循环，没个循环里面用Combinations里的就可以完成。
  //看到leet里面的主题里提到了bit，想到位运算的确可以完成而且更简单

  //补：backtracking的话，好像更简单，是吧Combinations中的每一步加进去就行了

  public List<List<Integer>> subsets(int[] nums) {

    int len = nums.length;
    int maxNum = (int)Math.pow(2, nums.length);

    List<List<Integer>> res = new ArrayList<>();

    for (int i=0;i<maxNum;i++) {
      StringBuilder bitmap = new StringBuilder(Integer.toBinaryString(i));
      for (int c=bitmap.length();c<len;c++) {
        bitmap.insert(0, '0');
      }
      List<Integer> item = new ArrayList<>();
      for (int j=0;j<len;j++) {
        if (bitmap.charAt(len-1-j)=='1') {
          item.add(nums[j]);
        }
      }
      res.add(item);
    }
    return res;
  }

}

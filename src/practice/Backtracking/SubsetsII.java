package practice.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SubsetsII {
  public List<List<Integer>> subsets(int[] nums) {
    Arrays.sort(nums);
    int len = nums.length;
    int maxNum = (int)Math.pow(2, nums.length);

    HashSet<List<Integer>> set = new HashSet<>();

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
      set.add(item);
    }
    List<List<Integer>> res = new ArrayList<>(set);
    return res;
  }

  // HashSet is unnecessary
//  public List<List<Integer>> subsetsWithDup(int[] nums) {
//    List<List<Integer>> res = new ArrayList<>();
//    if (nums.length == 0) return res;
//    Arrays.sort(nums);
//    dfs(nums, 0, res, new ArrayList<>());
//    return res;
//  }
//
//  public void dfs(int[] nums, int start, List<List<Integer>> res, List<Integer> list) {
//    res.add(new ArrayList<>(list));
//    for (int i = start; i < nums.length; i++) {
//      if (i > start && nums[i] == nums[i-1]) continue;
//      list.add(nums[i]);
//      dfs(nums, i + 1, res, list);
//      list.remove(list.size() - 1);   // backtracking
//    }
//  }
}

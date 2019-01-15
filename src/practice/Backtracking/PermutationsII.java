package practice.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PermutationsII {

  public List<List<Integer>> permuteUnique(int[] nums) {

    List<List<Integer>> res = new ArrayList<>();
    //List<Integer> numColle = Arrays.stream(nums).boxed().collect(Collectors.toList());

    createPer(nums, new int[nums.length], new ArrayList<>(), res);

    return res;
  }

  public void createPer(int[] nums, int[] used, List<Integer> perTemp, List<List<Integer>> res) {

    if (nums.length==perTemp.size()) {
      //TODO: 为啥这里直接add(perTemp)得到的是空的结果啊？
      if (!res.contains(perTemp))
        res.add(new ArrayList<>(perTemp));
    }

    else {
      for (int i=0;i<nums.length;i++) {
        if (used[i]==1) continue; // element already exists, skip
        perTemp.add(nums[i]);
        used[i] = 1;
        createPer(nums, used, perTemp, res);
        perTemp.remove(perTemp.size() - 1);
        used[i] = 0;
      }
    }

  }

}

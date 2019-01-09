package practice.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Permutations {

  public List<List<Integer>> permute(int[] nums) {

    List<List<Integer>> res = new ArrayList<>();
    //List<Integer> numColle = Arrays.stream(nums).boxed().collect(Collectors.toList());

    createPer(nums, new ArrayList<>(), res);

    return res;
  }

  public void createPer(int[] nums, List<Integer> perTemp, List<List<Integer>> res) {

    if (nums.length==perTemp.size()) {
      //TODO: 为啥这里直接add(perTemp)得到的是空的结果啊？
      res.add(new ArrayList<>(perTemp));
    }

    else {
      for (int num : nums) {
        if (perTemp.contains(num)) continue; // element already exists, skip
        perTemp.add(num);
        createPer(nums, perTemp, res);
        perTemp.remove(perTemp.size() - 1);
      }
    }

  }

}

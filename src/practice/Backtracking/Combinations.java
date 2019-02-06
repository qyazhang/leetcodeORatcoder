package practice.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

  public List<List<Integer>> combine(int n, int k) {

    List<List<Integer>> res = new ArrayList<List<Integer>>();
    List<Integer> item = new ArrayList<>();
    helper(1, n, k, item, res);

    return res;

  }

  public void helper(int start, int n, int kRemained, List<Integer> item, List<List<Integer>> res) {

    if (kRemained == 0) {
      res.add(new ArrayList<>(item));
      return;
    }

    else {
      for (int i=start;i<=n;i++) {
        item.add(i);
        System.out.println("add "+i);
        helper(i+1, n, kRemained-1, item, res);
        item.remove(item.size()-1);
      }
    }

  }

}

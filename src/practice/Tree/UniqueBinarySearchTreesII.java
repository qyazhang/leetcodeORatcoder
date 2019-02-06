package practice.Tree;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTreesII {

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  public List<TreeNode> generateTrees(int n) {

    return dfsHelper(1, n);

  }

  public List<TreeNode> dfsHelper(int start, int end) {

    List<TreeNode> list = new ArrayList<TreeNode>();

    if (start > end) {
      list.add(null);
      return list;
    }

    if (start == end) {
      list.add(new TreeNode(start));
      return list;
    }

    List<TreeNode> left, right;
    for (int i = start; i <= end; i++) {

      left = dfsHelper(start, i - 1);
      right = dfsHelper(i + 1, end);

      for (TreeNode lnode : left) {
        for (TreeNode rnode : right) {
          TreeNode root = new TreeNode(i);
          root.left = lnode;
          root.right = rnode;
          list.add(root);
        }
      }

    }

    return list;
  }
  //TODO: recursive here, why and how DP?

}

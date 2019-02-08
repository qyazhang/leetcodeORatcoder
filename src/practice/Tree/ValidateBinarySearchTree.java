package practice.Tree;

public class ValidateBinarySearchTree {

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  public boolean isValidBST(TreeNode root) {
    //Here use long for
    return dfsJudge(root, Long.MIN_VALUE, Long.MIN_VALUE);

  }

  public boolean dfsJudge(TreeNode root, long minVal, long maxVal) {
    if (root == null) return true;
    if (root.val >= maxVal || root.val <= minVal) return false;
    return dfsJudge(root.left, minVal, root.val) && dfsJudge(root.right, root.val, maxVal);
  }

}

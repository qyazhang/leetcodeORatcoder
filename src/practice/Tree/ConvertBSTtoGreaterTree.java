package practice.Tree;

public class ConvertBSTtoGreaterTree {

  static int sum = 0;
  public TreeNode convertBST(TreeNode root) {
    replace(root);
    return root;
  }

  public void replace(TreeNode node) {

    if (node == null) return;
    replace(node.right);
    node.val += sum;
    sum = node.val;
    replace(node.left);

  }


}

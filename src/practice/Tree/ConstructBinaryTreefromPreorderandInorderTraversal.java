package practice.Tree;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreefromPreorderandInorderTraversal {

  //TODO: Attention this point: use preorder to locate the root position
  public TreeNode buildTree(int[] preorder, int[] inorder) {
    Map<Integer, Integer> inMap = new HashMap<Integer, Integer>();

    for (int i = 0; i < inorder.length; i++) {
      inMap.put(inorder[i], i);
    }

    TreeNode root = dfsBuild(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inMap);
    return root;
  }

  public TreeNode dfsBuild(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> inMap) {
    if (preStart > preEnd || inStart > inEnd) return null;

    TreeNode root = new TreeNode(preorder[preStart]);
    int inRoot = inMap.get(root.val);
    int numsLeft = inRoot - inStart;

    root.left = dfsBuild(preorder, preStart + 1, preStart + numsLeft, inorder, inStart, inRoot - 1, inMap);
    root.right = dfsBuild(preorder, preStart + numsLeft + 1, preEnd, inorder, inRoot + 1, inEnd, inMap);

    return root;
  }

}

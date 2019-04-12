package practice.Tree;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestorofaBinaryTree {

  //  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//
//   if (root == null || root == p || root == q) return root;
//   TreeNode l = lowestCommonAncestor(root.left, p, q);
//   TreeNode r = lowestCommonAncestor(root.right, p, q);
//   //here means p and q are in left and right
//   if (l != null && r!=null) return root;
//   //here is left is null, so p and q are in right
//   return l == null? r : l;
//
//  }
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    List<TreeNode> pl = new ArrayList<>();
    List<TreeNode> ql = new ArrayList<>();
    if (find(root, p, pl) && find(root, q, ql)) {
      for (int i=0;i<Math.min(pl.size(),ql.size());i++) {
        if (pl.get(i)!=ql.get(i)) {
          return pl.get(i-1);
        }
      }
    }
    return null;
  }

  public boolean find(TreeNode node, TreeNode t, List<TreeNode> route) {
    if (node == null) return false;
    route.add(node);
    if (node == t) return true;
    if (find(node.left, t, route) || find (node.right, t, route)) return true;
    route.remove(route.size()-1);
    return false;
  }

}

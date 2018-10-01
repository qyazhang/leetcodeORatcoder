package leetcode.leetcodeContest0902;


import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4};

        System.out.println();
    }

    public TreeNode increasingBST(TreeNode root) {

        int[] s = sortedArr(root);
        TreeNode res = new TreeNode(s[0]);
        TreeNode pos = res;
        for (int i=1;i<s.length;i++) {
            pos.right = new TreeNode(s[i]);
            pos = pos.right;
        }
        return res;

    }

    public int[] sortedArr(TreeNode node) {

        if (node.left==null&&node.right==null) {
            int[] res = {node.val};
            return res;
        }
        else if (node.left!=null&&node.right==null) {
            int[] left = sortedArr(node.left);
            int[] cen = {node.val};
            int[] res = merge(left, cen);
            return res;
        }
        else if (node.left==null&&node.right!=null) {
            int[] right = sortedArr(node.right);
            int[] cen = {node.val};
            int[] res = merge(cen,right);
            return res;
        }
        else {
            int[] left = sortedArr(node.left);
            int[] cen = {node.val};
            int[] right = sortedArr(node.right);
            int[] res1 = merge(left,cen);
            int[] res = merge(res1,right);
            return res;
         }

    }
    public int[] merge(int[] a,int[] b){
        int alen = a.length;
        int blen = b.length;
        a = Arrays.copyOf(a, alen+blen);
        System.arraycopy(b, 0, a, alen, blen);
        return a;
    }
}

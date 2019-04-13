package chapterAll;

import structure.TreeNode;

/**
 * Created by jaywangs on 2019/2/27
 */
public class T55_02_IsBalancedTree {
    /**
     * 普通解法 节点重复遍历
     **/
    public boolean isBalancedTree(TreeNode root) {
        if (root == null) return true;
        int left = treeHeight(root.left);
        int right = treeHeight(root.right);
        int diff = left - right;
        if (diff > 1 || diff < -1){
            return false;
        }
        return isBalancedTree(root.left) && isBalancedTree(root.right);
    }

    private int treeHeight(TreeNode root) {
        return root == null ? 0 : 1 + Math.max(treeHeight(root.left), treeHeight(root.right));
    }

    private boolean isBalanced;
    public boolean isBalancedTree2(TreeNode root) {
        height(root);
        return isBalanced;
    }

    private int height(TreeNode root) {
        if (root == null || !isBalanced)
            return 0;
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) > 1)
            isBalanced = false;
        return 1 + Math.max(left, right);
    }
}

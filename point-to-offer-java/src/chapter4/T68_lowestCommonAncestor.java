package chapter4;

import structure.TreeNode;

/**
 * Created by jaywangs on 2019/3/2
 */
public class T68_lowestCommonAncestor {
    public TreeNode lowestCommonAncestorInBST(TreeNode root,TreeNode p, TreeNode q) {
        if (root == null)
            return root;
        if (root.val > p.val && root.val > q.val)
            return lowestCommonAncestorInBST(root.left, p, q);
        if (root.val < p.val && root.val < q.val)
            return lowestCommonAncestorInBST(root.right, p, q);
        return root;
    }

    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p, TreeNode q) {
        if (root == null || root.left == p || root.right == p)
            return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        return left == null ? right : right == null ? left : root;
    }
}

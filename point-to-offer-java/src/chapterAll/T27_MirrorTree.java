package chapter4;

import structure.TreeNode;

/**
 * Created by jaywangs on 2019/3/27
 */
public class T27_MirrorTree {
    public void Mirror(TreeNode root) {
        if (root == null) return;
        swap(root);
        Mirror(root.left);
        Mirror(root.right);
    }

    public void swap(TreeNode node) {
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
    }
}

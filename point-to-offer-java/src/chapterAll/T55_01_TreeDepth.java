package chapterAll;

import structure.TreeNode;

/**
 * Created by jaywangs on 2019/2/27
 */
public class T55_01_TreeDepth {
    public int TreeDepth (TreeNode root) {
        return root == null ? 0 : 1 + Math.max(TreeDepth(root.left), TreeDepth(root.right));
    }
}

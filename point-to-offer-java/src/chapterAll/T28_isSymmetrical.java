package chapterAll;

import structure.TreeNode;

/**
 * Created by jaywangs on 2019/3/13
 */
public class T28_isSymmetrical {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot == null) return true;
        return isSymmetricalCore(pRoot.left, pRoot.right);
    }

    private boolean isSymmetricalCore(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;
        if (root1.val != root2.val)
            return false;
        return isSymmetricalCore(root1.left, root2.right) && isSymmetricalCore(root1.right, root2.left);
    }
}

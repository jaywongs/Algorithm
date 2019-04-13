package chapterAll;

import structure.TreeNode;

/**
 * Created by jaywangs on 2019/4/11
 */
public class T26_isSubTree {
    public boolean HasSubTree(TreeNode root1, TreeNode root2){
        if (root1 == null || root2 == null)
            return false;
        return isSubTree(root1, root2) || HasSubTree(root1.left, root2) || HasSubTree(root1.right, root2);
    }

    private boolean isSubTree(TreeNode root1, TreeNode root2){
        if (root2 == null)
            return true;
        if (root1 == null)
            return false;
        if (root1.val != root2.val)
            return false;
        else
            return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
    }
}

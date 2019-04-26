package solutions.dfs;

import structure.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jaywangs on 2019/4/25
 */
public class T105_ConstructBinaryTreefromPreorderandInorderTraversal {
    /**
     * Given preorder and inorder traversal of a tree, construct the binary tree.
     *
     * Note:
     * You may assume that duplicates do not exist in the tree.
     *
     * For example, given
     *
     * preorder = [3,9,20,15,7]
     * inorder = [9,3,15,20,7]
     * Return the following binary tree:
     *
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     **/

    private Map<Integer, Integer> indexForInOrder = new HashMap<>();
    public TreeNode buildTree(int [] pre, int [] in) {
        for (int i = 0; i < in.length; i++)
            indexForInOrder.put(in[i], i);
        return buildTree(pre, 0, pre.length - 1, 0);
    }

    private TreeNode buildTree (int [] pre, int preL, int preR, int inL) {
        if (preL > preR)
            return null;
        int index = indexForInOrder.get(pre[preL]);
        int leftSize = index - inL;
        TreeNode root = new TreeNode(pre[preL]);
        root.left = buildTree(pre, preL + 1, preL + leftSize, inL);
        root.right = buildTree(pre, preL + leftSize + 1, preR, inL + leftSize + 1);
        return root;
    }
}

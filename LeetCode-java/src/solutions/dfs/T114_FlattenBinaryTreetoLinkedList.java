package solutions.dfs;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaywangs on 2019/4/14
 */
public class T114_FlattenBinaryTreetoLinkedList {
    /**
     * 给定一个二叉树，原地将它展开为链表。
     *
     * 例如，给定二叉树
     *
     *     1
     *    / \
     *   2   5
     *  / \   \
     * 3   4   6
     * 将其展开为：
     *
     * 1
     *  \
     *   2
     *    \
     *     3
     *      \
     *       4
     *        \
     *         5
     *          \
     *           6
     **/
    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        if (root == null) return;
        fun(root, list);
        for (int i = 0; i < list.size() - 1; i++){
            list.get(i).right = list.get(i+1);
        }
    }

    private void fun(TreeNode node, List<TreeNode> list) {
        list.add(node);
        if (node.left != null)
            fun(node.left, list);
        if (node.right != null)
            fun(node.right, list);
        node.left = node.right = null;
    }
}

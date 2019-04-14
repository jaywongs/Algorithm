package solutions.dfs;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaywangs on 2019/4/14
 */
public class T113_PathSumII {
    /**
     * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
     *
     * Note: A leaf is a node with no children.
     *
     * Example:
     *
     * Given the below binary tree and sum = 22,
     *
     *       5
     *      / \
     *     4   8
     *    /   / \
     *   11  13  4
     *  /  \    / \
     * 7    2  5   1
     * Return:
     *
     * [
     *    [5,4,11,2],
     *    [5,8,4,5]
     * ]
     **/
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> list = new ArrayList<>();
        pathSumCore(root, list, sum);
        return res;
    }

    private void pathSumCore(TreeNode root, List<Integer> list, int left) {
        if (root == null) return;
        list.add(root.val);
        if (root.left == null && root.right == null && root.val == left){
            res.add(new ArrayList<>(list));
        }else {
            pathSumCore(root.left, list, left - root.val);
            pathSumCore(root.right, list, left - root.val);
        }
        list.remove(list.size() - 1);
    }
}

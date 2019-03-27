package chapter4;

import structure.TreeNode;

import java.util.ArrayList;

/**
 * Created by jaywangs on 2019/3/27
 */
public class T34_TreePathSum {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<Integer> path = new ArrayList<Integer>();
        backtracing(root, target, path);
        return res;
    }

    private void backtracing(TreeNode root, int target, ArrayList<Integer> path) {
        if (root == null) return;
        path.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            res.add(new ArrayList<>(path));
        }else {
            backtracing(root.left, target, path);
            backtracing(root.right, target, path);
        }
        path.remove(path.size() - 1);
    }
}

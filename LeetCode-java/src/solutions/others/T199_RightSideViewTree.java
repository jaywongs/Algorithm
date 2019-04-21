package solutions.others;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class T199_RightSideViewTree {
    public int depth = -1;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        backTrack(root, list, 0);
        return list;
    }

    public void backTrack(TreeNode root, List<Integer> list, int level){
        if (root == null)
            return;
        if (level > depth){
            list.add((int)root.val);
            depth = level;
        }
        backTrack(root.right, list, level + 1);
        backTrack(root.left, list, level + 1);
    }
}

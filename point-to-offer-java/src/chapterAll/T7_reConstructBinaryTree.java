package chapter4;

import structure.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jaywangs on 2019/3/8
 */

public class T7_reConstructBinaryTree {
    private Map<Integer, Integer> indexForInOrder = new HashMap<>();
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        for (int i = 0; i < in.length; i ++)
            indexForInOrder.put(in[i], i);
        return reConstructBinaryTree(pre, 0, pre.length-1, 0);
    }

    private TreeNode reConstructBinaryTree (int [] pre, int preL, int preR, int inL) {
        if(preL > preR) return null;
        TreeNode root = new TreeNode(pre[preL]);
        int index = indexForInOrder.get(root.val);
        int leftSize = index - inL;
        root.left = reConstructBinaryTree(pre, preL + 1, preL + leftSize, inL);
        root.right = reConstructBinaryTree(pre, preL + leftSize + 1, preR, inL + leftSize + 1);
        return root;
    }
}

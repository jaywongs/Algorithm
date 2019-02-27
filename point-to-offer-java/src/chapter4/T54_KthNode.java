package chapter4;

import structure.TreeNode;

/**
 * Created by jaywangs on 2019/2/27
 */
public class T54_KthNode {
    public TreeNode KthNode(TreeNode pRoot, int k) {
        return inOrder(pRoot, k);
    }


    private int cnt;
    private TreeNode inOrder(TreeNode node, int k) {

        if (node.left != null) inOrder(node.left, k);
        cnt += 1;
        if (cnt == k){
            return node;
        }
        if (node.right != null) inOrder(node.right, k);
        return null;
    }
}

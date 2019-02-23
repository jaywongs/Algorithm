package chapter4;

import structure.TreeNode;

/**
 * Created by jaywangs on 2019/2/22
 * 二叉搜索树与双向链表
 * 将二叉搜索树转换为双向链表，树的left指向prev节点，树的right指向post节点
 * 左右支转换完之后要与根节点组合，所以左右支要返回自己的最小点与最大点两个节点，返回值使用数组
 */
public class T36_ConvertBSTtoList {
    private TreeNode pre = null;
    private TreeNode head = null;

    public TreeNode convert(TreeNode root){
        inOrder(root);
        return head;
    }

    private void inOrder(TreeNode node) {
        if (node == null)
            return;
        inOrder(node.left);
        node.left = pre;
        if (pre != null)
            pre.right = node;
        pre = node;
        if (head == null)
            head = node;
        inOrder(node.right);
    }

}

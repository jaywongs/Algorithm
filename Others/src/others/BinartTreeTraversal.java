package others;

import structure.TreeNode;

import java.util.Stack;

/**
 * Created by jaywangs on 2019/3/30
 */
public class BinartTreeTraversal {

    public void preOrderRecurisively(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preOrderRecurisively(root.left);
        preOrderRecurisively(root.right);
    }

    public void preOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()){
            while (node != null){
                System.out.print(node.val + " ");
                stack.push(node);
                node = node.left;
            }
            if (!stack.isEmpty())
                node = stack.pop().right;
        }
    }

    public void inOrderRecurisively(TreeNode root) {
        if (root == null) return;
        inOrderRecurisively(root.left);
        System.out.print(root.val + " ");
        inOrderRecurisively(root.right);
    }

    public void inOrder (TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            if (!stack.isEmpty()){
                node = stack.pop();
                System.out.print(node.val + " ");
                node = node.right;
            }

        }
    }

    public void postOrderRecurisively(TreeNode root) {
        if (root == null) return;
        inOrderRecurisively(root.left);
        inOrderRecurisively(root.right);
        System.out.print(root.val + " ");
    }

    public void postOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        TreeNode lastVisted = root;
        while (node != null || !stack.isEmpty()){
            while (node != null){
                stack.push(node);
                node = node.left;
            }
            node = stack.peek();
            if (node.right == null || node.right == lastVisted) {
                System.out.print(node.val + " ");
                stack.pop();
                lastVisted = node;
                node = null;
            }else {
                node = node.right;
            }
        }
    }
}

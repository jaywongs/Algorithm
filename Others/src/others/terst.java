package chapter3;


import structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by jaywangs on 2019/3/14
 */
public class terst {

    public static void main(String[] args) {
        int [] pre = {7,10,4,3,1,2,8,11};
        int [] in = {4,10,3,1,7,11,8,2};
        TreeNode root = generateTree(pre,0, pre.length - 1, in, 0, pre.length - 1);

        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int cnt = queue.size();
            while (cnt-- > 0){
                TreeNode node = queue.poll();
                if (node == null) {
                    continue;
                }
                res.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
        }

        for (int value: res) {
            System.out.print(value + " ");
        }

    }


    private static TreeNode generateTree (int[] a,int ab,int ae, int[] b,int bb,int be) {
        if(ab > ae || bb > be) {
            return null;
        }
        TreeNode node = new TreeNode(a[ab]);
        int bi = -1;
        for(int i = bb ;i <= be ; i++) {
            if(b[i] == a[ab]) {
                bi = i;
                break;
            }
        }
        if(bi == -1) {
            throw new NullPointerException("cannot find "+a[ab]);
        }
        node.left = generateTree(a,ab+1,(ab+1)+(bi-1-bb),b,bb,bi-1);
        node.right = generateTree(a,(ab+1)+(bi-1-bb)+1,ae,b,bi+1,be);
        return node;
    }
}

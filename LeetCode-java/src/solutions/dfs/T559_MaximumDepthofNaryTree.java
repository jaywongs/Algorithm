package solutions.dfs;

import structure.Node;

/**
 * Created by jaywangs on 2019/4/14
 */
public class T559_MaximumDepthofNaryTree {
    /**
     * 给定一个 N 叉树，找到其最大深度。
     *
     * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
     *
     * 例如，给定一个 3叉树 :
     * 我们应返回其最大深度，3。
     *
     * 说明:
     *
     * 树的深度不会超过 1000。
     * 树的节点总不会超过 5000。
     **/
    public int maxDepth(Node root) {
        return depth(root);
    }

    private int depth(Node root){
        if (root == null)
            return 0;
        int max = 1;
        for (Node node: root.children){
            max = Math.max(depth(node) + 1, max);
        }
        return max;
    }
}

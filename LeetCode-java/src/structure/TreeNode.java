package structure;

/**
 * Created by jaywangs on 2019/2/22
 *
 */
public class TreeNode<T> {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(){

    }

    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }

}

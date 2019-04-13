package chapterAll;
import structure.TreeNode;

/**
 * Created by jaywangs on 2019/2/22
 */
public class T37_SerializeTree {

    private String deserializeStr;

    public String Serialize(TreeNode root){
        if (root == null){
            return "#";
        }
        return root.val + " " + Serialize(root.left) + " " + Serialize(root.right);
    }

    public TreeNode Deserialize(String str){
        if (str == null || str.length() == 0)
            return null;
        String[] treeNodeStr = str.split(" ");
        return Deserialize(treeNodeStr);
    }

    private int index = -1;

    private TreeNode Deserialize(String[] treeNodeStr){
        index ++;
        TreeNode node = null;
        if (index < treeNodeStr.length && treeNodeStr[index] != "#"){
            node = new TreeNode(Integer.valueOf(treeNodeStr[index]));
            node.left = Deserialize(treeNodeStr);
            node.right = Deserialize(treeNodeStr);
        }
        return node;
    }

}

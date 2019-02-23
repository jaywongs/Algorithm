package chapter4;
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
        deserializeStr = str;
        return Deserialize();
    }

    private TreeNode Deserialize(){
        if (deserializeStr.length() == 0) {
            return null;
        }
        int index = deserializeStr.indexOf(" ");
        String node = index == -1 ? deserializeStr : deserializeStr.substring(0, index);
        deserializeStr = index == -1 ? "" : deserializeStr.substring(index + 1);
        if (node.equals("#"))
            return null;
        int val = Integer.valueOf(node);
        TreeNode t = new TreeNode(val);
        t.left = Deserialize();
        t.right = Deserialize();
        return t;
    }

}

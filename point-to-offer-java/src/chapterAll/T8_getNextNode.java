package chapterAll;

import structure.TreeLinkNode;

/**
 * Created by jaywangs on 2019/3/13
 */
public class T8_getNextNode {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if (pNode.right != null){
            return leftest(pNode.right);
        }else{
            while (pNode.next != null) {
                TreeLinkNode parent = pNode.next;
                if (parent.left == pNode)
                    return parent;
                pNode = pNode.next;
            }
        }
        return null;
    }

    private TreeLinkNode leftest(TreeLinkNode node) {
        if (node.left == null)
            return node;
        else
            return leftest(node.left);
    }
}

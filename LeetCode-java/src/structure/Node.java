package structure;

import java.util.List;

/**
 * Created by jaywangs on 2019/4/14
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node(){}

    public Node(int _val, List<Node> _children) {
        this.val = _val;
        this.children = _children;
    }
}

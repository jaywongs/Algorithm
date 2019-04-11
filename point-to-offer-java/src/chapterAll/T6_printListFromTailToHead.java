package chapter4;

import structure.ListNode;

import java.util.ArrayList;

/**
 * Created by jaywangs on 2019/3/8
 */
public class T6_printListFromTailToHead {
    ArrayList<Integer> ret = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        printHelper(listNode);
        return ret;
    }

    private void printHelper(ListNode listNode){
        if (listNode == null)
            return;
        printHelper(listNode.next);
        ret.add(listNode.val);
    }
}

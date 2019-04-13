package chapterAll;

import structure.ListNode;

import java.util.ArrayList;

/**
 * Created by jaywangs on 2019/3/8
 */
public class T6_printListFromTailToHead {
    /**
     * 从尾到头反过来打印出每个结点的值。
     **/
    //递归法
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

    //头插法
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode){
        ListNode head = new ListNode(-1);
        while (listNode != null) {
            ListNode next = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = next;
        }
        while (head.next != null) {
            ret.add(head.next.val);
            head = head.next;
        }
        return ret;
    }
}

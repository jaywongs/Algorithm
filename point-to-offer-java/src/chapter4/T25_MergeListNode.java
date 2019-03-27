package chapter4;

import structure.ListNode;

/**
 * Created by jaywangs on 2019/3/24
 */
public class T25_MergeListNode {
    public ListNode merge1(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        if (list1.val <= list2.val) {
            list1.next = merge1(list1.next, list2);
            return list1;
        }else {
            list2.next = merge1(list1, list2.next);
            return list2;
        }
    }

    public ListNode merge2(ListNode list1, ListNode list2) {
        ListNode newNode = new ListNode(-1);
        ListNode cur = newNode;
        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                cur.next = list1;
                list1 = list1.next;
            }else {
                cur.next = list2.next;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if (list1 == null)
            cur.next = list2;
        if (list2 == null)
            cur.next = list1;
        return newNode.next;
    }
}

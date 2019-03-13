package chapter4;

import structure.ListNode;

/**
 * Created by jaywangs on 2019/3/13
 */
public class T18_02_deleteDuplication {
    public ListNode deleteDuplication(ListNode pHead){
        if (pHead == null || pHead.next == null)
            return pHead;
        ListNode next = pHead.next;
        if (next.val == pHead.val) {
            while (next != null && pHead.val == next.val)
                next = next.next;
            return deleteDuplication(next);
        }else {
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }

}

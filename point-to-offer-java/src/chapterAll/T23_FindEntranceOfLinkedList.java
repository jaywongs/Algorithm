package chapterAll;

import structure.ListNode;

/**
 * Created by jaywangs on 2019/3/30
 */
public class T23_FindEntranceOfLinkedList {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead == null || pHead.next == null) return null;
        ListNode p1 = pHead;
        ListNode p2 = pHead;
        boolean isFirst = true;
        while (p1 != null && p2 != null) {

            if (!isFirst && p1 == p2){
                p2 = pHead;
                while (p1 != p2){
                    p1 = p1.next;
                    p2 = p2.next;
                }
                return p1;
            }

            p1 = p1.next;
            p2 = p2.next.next;
            isFirst = false;
        }
        return null;
    }
}

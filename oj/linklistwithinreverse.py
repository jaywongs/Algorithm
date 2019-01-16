class Node(object):
    def __init__(self, val):
        self.val = val
        self.next = None


class LinkList(object):
    def __init__(self, lst):
        self._head = Node(lst.pop(0))
        tail = self._head
        for val in lst:
            node = Node(val)
            tail.next = node
            tail = node


def reverseKGroup(head, k):
    dummy = jump = Node(0)
    dummy.next = l = r = head

    while True:
        count = 0
        while r and count < k:  # use r to locate the range
            r = r.next
            count += 1
        if count == k:  # if size k satisfied, reverse the inner linked list
            pre, cur = r, l
            for _ in range(k):
                cur.next, cur, pre = pre, cur.next, cur  # standard reversing
            jump.next, jump, l = pre, l, r  # connect two k-groups
        else:
            return dummy.next


while True:
    try:
        s = input().split()
        n = int(s.pop(0))
        k = int(s.pop(-1))
        linklist = LinkList(s)
        res = reverseKGroup(linklist._head, k)
        lst = []
        while res is not None:
            # print(res.val, end=' ')
            lst.append(res.val)
            res = res.next
        print(' '.join(str(i) for i in lst))
    except EOFError:
        break
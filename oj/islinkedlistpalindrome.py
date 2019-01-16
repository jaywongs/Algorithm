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


# 空间复杂度0（n）
def ispalindromewithstack(head):
    if head is None or head.next is None:
        return True
    p = head
    stack = []
    while p is not None:
        stack.append(p.val)
        p = p.next
    p = head
    while p is not None:
        if stack.pop() != p.val:
            return False
        else:
            p = p.next
    return True


# 空间复杂度0（1）
def ispalindromewithoutstack(head):
    if head is None or head.next is None:
        return True
    slow = head
    fast = head
    while fast is not None and fast.next is not None: # 找到链表中点
        slow = slow.next
        fast = fast.next.next
    if fast is not None: # odd nodes: let right half smaller
        slow = slow.next
    # 逆转链表
    slow = reverse(slow)
    # 比较判断链表是否是回文链表
    while slow is not None and head is not None:
        if slow.val != head.val:
            return False
        head = head.next
        slow = slow.next
    return True


def reverse(head):
    prev = None
    while head is not None:
        next = head.next
        head.next = prev
        prev = head
        head = next
    return prev


while True:
    try:
        s = input().split()
        s.pop(0)
        linklist = LinkList(s)
        print('true' if ispalindromewithoutstack(linklist._head) else 'false')
    except EOFError:
        break
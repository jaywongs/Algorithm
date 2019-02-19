class Node(object):
    def __init__(self, value, next=None):
        self.value = value
        self.next = next


def reverse_link_list(head):
    if head is None:
        return None
    pre = None
    p = head

    while p is not None:
         next = p.next
         p.next = pre
         pre = p
         p = next
    return pre

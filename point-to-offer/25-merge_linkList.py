class Node(object):
    def __init__(self, value, next=None):
        self.value = value
        self.next = next


def merge_linklist_recurisively(l1, l2):
    if l1 is None:
        return l2
    if l2 is None:
        return l1
    l = None
    if l1.value < l2.value:
        l = l1
        l.next = merge_linklist_recurisively(l1.next, l2)
    else:
        l = l2
        l.next = merge_linklist_recurisively(l1, l2.next)

    return l

def merge_linklist(l1, l2):
    if l1 is None:
        return l2
    if l2 is None:
        return l2

    l = None
    temp = l2

    while l1 is not None and temp is not None:
        if l1.value < temp.value:
            temp = l1.next
            l1 .next = l2
            l2 = temp
    # todo
    

if __name__ == "__main__":
    l1_5 = Node(10)
    l1_4 = Node(7, l1_5)
    l1_3 = Node(5, l1_4)
    l1_2 = Node(2, l1_3)
    l1_1 = Node(1, l1_2)

    l2_3 = Node(6)
    l2_2 = Node(6, l2_3)
    l2_1 = Node(5, l2_2)
    l1_1 = merge_linklist_recurisively(l1_1, l2_1)

    while l1_1 is not None:
        print(l1_1.value)
        l1_1 = l1_1.next
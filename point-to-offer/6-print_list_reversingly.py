class Node(object):
    def __init__(self, data, next=None):
        self.data = data
        self.next = next

def print_list_reversingly1(head):
    if head is None:
        return
    stack = []
    while head is not None:
        stack.append(head.data)
        head = head.next

    while len(stack):
        print(stack.pop())


def print_list_reversingly2(head):
    if head is None:
        return
    print_list_reversingly2(head.next)
    print(head.data)


if __name__ == "__main__":
    n5 = Node(data=5)
    n4 = Node(data=4, next=n5)
    n3 = Node(data=3, next=n4)
    n2 = Node(data=2, next=n3)
    head = Node(data=1, next=n2)
    print_list_reversingly2(head)
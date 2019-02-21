from queue import Queue

class TreeNode(object):
    def __init__(self, value, left_child=None, right_child= None):
        self.value = value
        self.left_child = left_child
        self.right_child = right_child


    def print_tree_from_top_to_bottom(root):
        if root is None:
            return
        queue = Queue()
        queue.put(root)
        while not queue.empty():
            node = queue.get()
            if node.left_child:
                queue.put(node.left_child)
            if node.right_child:
                queue.put(node.right_child)
            print(node.value, end=' ')


    def print_tree_from_top_to_bottom2(root):
        if root is None:
            return
        queue = Queue()
        n_node = 1
        n_next_node = 0
        while not queue.empty():
            node = queue.get()
            print(node.value, end=' ')

            if node.left_child:
                n_next_node += 1
                queue.put(node.left_child)
            if node.right_child:
                n_next_node += 1
                queue.put(node.right_child)
            n_node -= 1
            if n_node == 0:
                print()
                n_node = n_next_node
                n_next_node = 0

    def print_tree_from_top_to_bottom3(root):
        if root is None:
            return
        stack1 = []
        stack2 = []
        stack1.append(root)
        level = 1

        while len(stack1) != 0 or len(stack2) != 0:
            if level & 1:
                cur_stack = stack1
                next_stack = stack2
            else:
                cur_stack = stack2
                next_stack = stack1

            while len(cur_stack) != 0:
                node = cur_stack.pop()
                print(node.value, end=' ')
                if level & 1:
                    if node.left_child:
                        next_stack.append(node.left_child)
                    if node.right_child:
                        next_stack.append(node.right_child)
                else:
                    if node.right_child:
                        next_stack.append(node.right_child)
                    if node.left_child:
                        next_stack.append(node.left_child)
            print()
            level += 1

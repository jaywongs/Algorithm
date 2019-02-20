class TreeNode(object):
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right


def is_symmetrical(root):
    return is_symmetrical_core(root, root)


def is_symmetrical_core(node1, node2):
    if node1 is None and node2 is None:
        return True
    if node1 is None or node2 is None:
        return False
    if node1.value != node2.value:
        return False
    return is_symmetrical_core(node1.left, node2.right) and is_symmetrical_core(node1.right, node2.left)


if __name__ == "__main__":
    node7 = TreeNode(5)
    node6 = TreeNode(7)
    node5 = TreeNode(7)
    node4 = TreeNode(5)
    node3 = TreeNode(6, left=node6, right=node7)
    node2 = TreeNode(6, left=node4, right=node5)
    node1 = TreeNode(8, left=node2, right=node3)
    root = node1
    print(is_symmetrical(root))
# Christopher Oh
# SJSU CS 146
# HW 10 - Binary Search Tree Level Order Traversal
from typing import Optional, List
import TreeNode

class Solution:
    def __init__(self):
        print("HW 10")

    def levelOrder(self, root) -> List[List[int]]:
        nodes_by_level = []

        if root is not None:
            self.helper(root, nodes_by_level, 0)

        return nodes_by_level

    def helper(self, node, nodes_by_level, level):
        while len(nodes_by_level) - 1 < level:
            nodes_by_level.append([])

        nodes_by_level[level].append(node.val)

        if node.left is not None:
            self.helper(node.left, nodes_by_level, level + 1)

        if node.right is not None:
            self.helper(node.right, nodes_by_level, level + 1)

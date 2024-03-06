class Solution:
    def __init__(self):
        print("Lab 5")

    def isValidBST(self, root):
        if root is None:
            return True
        list = []
        self.readTree(root, list)
        return self.isInOrder(list)

    def readTree(self, root, list):
        if root.left is not None:
            self.readTree(root.left, list)
        list.append(root.val)
        if root.right is not None:
            self.readTree(root.right, list)

    def isInOrder(self, list):
        for i in range(0, len(list) - 1):
            if list[i] >= list[i + 1]:
                return False
        return True

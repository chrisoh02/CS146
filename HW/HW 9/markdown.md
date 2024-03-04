To find the lowest common ancestor between p and q, we need to find the node at which the tree "split" to get p and q in its lineage

If both p and q are less than root, that means that p and q share a common ancestor with either root's left child or one of left child's descendants

Likewise, if both p and q are greater than the root, that means that p and q share a common ancestor with either root's right child or one of right child's descendants

In either case, we can simply call the function again, this time passing either the left child or right child as the root (depending on which case) as the root

If p is greater than the root and q is less than the root or vice versa, this means that the tree has split and we have found the lowest common ancestor. We can simply return the root

Pseudo Code:

def lowestCommonAncestor(root, p, q):
  if both p and q are less than root:
    return lowestCommonAncestor(root.leftChild, p, q)
  else if both p and q are greater than root:
    return lowestCommonAncestor(root.rightChild, p, q)
  else: //tree has split
    return root

/**
 * Christopher Oh
 * SJSU CS 146
 * Homework 9
 */

public class Solution {
    public Solution() {}


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        if (p.val < root.val && q.val < root.val) { //both p and q are less than root
            return lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) { //both p and q are greater than root
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }
}

/**
 * Christopher Oh
 * SJSU CS 146
 * Lab 5, validate binary search tree
 */

import java.util.ArrayList;

public class Solution2 {
    public Solution2 () {}

    public boolean isValidBST (TreeNode root) {
        if (root == null) return true;
        ArrayList<Integer> list = new ArrayList<>();
        readTree(root, list);
        return isInOrder(list);
    }

    private void readTree (TreeNode node, ArrayList<Integer> list) {
        if (node.left != null) { readTree(node.left, list); }
        list.add(node.val);
        if (node.right != null) { readTree(node.right, list); }
    }

    private boolean isInOrder (ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) return false;
        }
        return true;
    }
}

/**
 * Christopher Oh
 * SJSU CS 146
 * HW 10 - BST level order tree traversal
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public Solution () {}


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        if (root != null) helper(root, list, 0);

        return list;
    }

    /**
     * Adds the node to its level in the tree
     * The index of the arraylist in list is its level
     * ex) list.get(3) refers to level 3 on the tree
     * root is at level 0
     * @param node
     * @param list
     * @param level
     */
    private void helper (TreeNode node, List<List<Integer>> list, int level) {
        /**
         * if the list doesn't have as many levels as the node in the parameter, add levels to list until it does
         */
        while (list.size() - 1 < level) {
            ArrayList<Integer> temp = new ArrayList<>();
            list.add(temp);
        }

        list.get(level).add(node.val);
        if (node.left != null) helper(node.left, list, level + 1);
        if (node.right != null) helper(node.right, list, level + 1);
    }

}

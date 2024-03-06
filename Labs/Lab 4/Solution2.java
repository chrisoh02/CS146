public class Solution2 {
    public Solution2 () {}
    public TreeNode invertTree (TreeNode root) {
        if (root == null) return null;

        invertTree(root.left);
        invertTree(root.right);

        //swap
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;

        return root;
    }
}

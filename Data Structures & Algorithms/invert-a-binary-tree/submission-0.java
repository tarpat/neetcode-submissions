/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode invertTree(TreeNode root) {
        return flip(root);
    }

    public TreeNode flip(TreeNode node) {
        if (node == null) {
            return null;
        }

        TreeNode left = node.left;
        TreeNode right = node.right;

        node.left = flip(right);
        node.right = flip(left);

        return node;
    }
}

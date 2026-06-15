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
    public List<List<Integer>> levelOrder(TreeNode root) {
        int height = max_height(root);
        List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            tree.add(new ArrayList<Integer>());
        }
        populate(root, tree, 0);
        return tree;
    }

    public void populate(TreeNode curr, List<List<Integer>> tree, int currLevel) {
        if (curr != null) {
            tree.get(currLevel).add(curr.val);
            populate(curr.left, tree, currLevel + 1);
            populate(curr.right, tree, currLevel + 1);
        }
    }

    public int max_height(TreeNode curr) {
        if (curr == null) {
            return 0;
        }

        return 1 + Math.max(max_height(curr.right), max_height(curr.left));
    }
}

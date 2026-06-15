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
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        generate(root, arr);
        int prev = arr.get(0) - 1;
        for (Integer i : arr) {
            if (i <= prev) {
                return false;
            }
            prev = i;
        }
        return true;
    }

    public void generate(TreeNode root, ArrayList<Integer> arr) {
        if (root != null) {
            generate(root.left, arr);
            arr.add(root.val);
            generate(root.right, arr);
        }
    }
}

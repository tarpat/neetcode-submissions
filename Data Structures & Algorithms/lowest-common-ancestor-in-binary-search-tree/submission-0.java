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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Queue<TreeNode> q_queue = new LinkedList<TreeNode>();
        Queue<TreeNode> p_queue = new LinkedList<>();
        helper(q_queue, root, q);
        helper(p_queue, root, p);
        TreeNode prev = root;
        while (!q_queue.isEmpty() && !p_queue.isEmpty()) {
            TreeNode q_node = q_queue.poll();
            TreeNode p_node = p_queue.poll();
            if (q_node.val != p_node.val) {
                return prev;
            }

            prev = q_node;
        }

        return prev;
    }

    public void helper(Queue<TreeNode> queue, TreeNode curr, TreeNode target) {
        queue.offer(curr);
        if (curr.val < target.val) {
            helper(queue, curr.right, target);
        } else if (curr.val > target.val) {
            helper(queue, curr.left, target);
        }
    }
}

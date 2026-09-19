# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def check(self, root, p, q):
        if (p.val < root.val and q.val > root.val) or (p.val > root.val and q.val < root.val) or (p.val < root.val and q.val == root.val) or (p.val > root.val and q.val == root.val) or (p.val == root.val and q.val < root.val) or (p.val == root.val and q.val > root.val):
            return root
        
        if p.val < root.val and q.val < root.val:
            return self.check(root.left, p, q)
        
        return self.check(root.right, p, q)


    def lowestCommonAncestor(self, root: TreeNode, p: TreeNode, q: TreeNode) -> TreeNode:
        
        # BST so it's ordered
        # where they split is the ancestor
        return self.check(root, p, q)
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def helper(self, root: Optional[TreeNode]):
        if not root:
            return 0
        
        l = self.helper(root.left)
        r = self.helper(root.right)
        if l == -1 or r == -1:
            return -1

        if l + 1 == r or r + 1 == l or r == l:
            val = max(l, r)
            return val + 1

        
        return -1

    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        if not root:
            return True
        
        return self.helper(root) != -1
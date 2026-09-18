# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def helper(self, root):
        if not root:
            return 0
        
        l = self.helper(root.left)
        r = self.helper(root.right)
        self.best = max(l + r, self.best)
        '''
                    1
                                2
                        3              4
                            5               6
        '''

        return max(l, r) + 1
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        '''
                    1
            2               2
        3       3       3       3
        '''
        self.best = 0
        l = self.helper(root.left)
        r = self.helper(root.right)
        return max(self.best, l+r)

        


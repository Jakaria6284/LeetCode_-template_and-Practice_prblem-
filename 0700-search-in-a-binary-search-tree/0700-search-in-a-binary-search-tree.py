# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def searchBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        return self.recur(root, val)

    def recur(self, root, val):
        if root is None:
            return None

        if root.val == val:
            return root  

        
        left = self.recur(root.left, val)
        right = self.recur(root.right, val)

        if left is not None:
            return left
        if right is not None:
            return right
        

        
        return None

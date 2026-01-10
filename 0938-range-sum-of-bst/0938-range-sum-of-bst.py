# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rangeSumBST(self, root: Optional[TreeNode], low: int, high: int) -> int:
        ans=0
        return self.recur(root,low,high)
        


    def recur(self,root,low,high):
        if root is None:
            return 0
        

        ans=0
        if low <= root.val <= high:
            ans=ans+root.val
        ans+=self.recur(root.left,low,high)
        ans+=self.recur(root.right,low,high)

        return ans

        

        


        
        
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
    public int goodNodes(TreeNode root) {
       int ans=  count(root,root.val);
       return ans;

        
    }

    int count(TreeNode node,int max)
    {
        if(node==null)return 0;
        max=Math.max(node.val,max);

        int left=count(node.left,max);
        int right=count(node.right,max);

        int res=left+right;

        if(node.val>=max)
        {
            res++;
        }

        return res;
    }
}
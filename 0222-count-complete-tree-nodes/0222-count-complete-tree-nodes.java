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
    int max=0;
    public int countNodes(TreeNode root) {
        count(root);
        return max;
        
    }
    public int count(TreeNode root)
    {
       if(root==null) return 0;
       int left=count(root.left);
       int right=count(root.right);
       max=1+Math.max(max,Math.max(left,right));
       return max;
    }
}
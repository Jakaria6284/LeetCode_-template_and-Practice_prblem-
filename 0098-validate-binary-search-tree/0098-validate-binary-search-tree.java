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
        if(root==null)return false;
        Stack<TreeNode>stack=new Stack<>();

       
        TreeNode curr=root;
        TreeNode prevroot=null;
        while(curr!=null || !stack.isEmpty())
        {
            while(curr!=null)
            {
                stack.push(curr);
                curr=curr.left;
            }

            curr=stack.pop();
            if(prevroot!=null && curr.val<=prevroot.val)return false;
            prevroot=curr;
            curr=curr.right;
        }
        return true;
    }
}

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
    public TreeNode convertBST(TreeNode root) {
        if (root == null) return root;
       convertbst(root,0);
       return root;
   
        
    }
    public int convertbst(TreeNode root,int newNode)
    {
         if(root==null) return newNode;
         newNode=root.val+convertbst(root.right,newNode);
         root.val=newNode;
         newNode=convertbst(root.left,newNode);
         return newNode;


    }
}
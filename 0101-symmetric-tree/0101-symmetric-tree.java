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
    public boolean isSymmetric(TreeNode root) {

        if(root==null)
        {
            return true;
        }

        Queue<TreeNode>queue=new LinkedList<>();
         queue.offer(root.left);
         queue.offer(root.right);
        

        while(!queue.isEmpty())
        {
            TreeNode rootLeft=queue.poll();
            TreeNode rootRight=queue.poll();

           if (rootLeft == null && rootRight == null) {
                continue;
            }
           
            if (rootLeft == null || rootRight == null || rootLeft.val != rootRight.val) {
                return false;
            }

           
            queue.offer(rootLeft.left);
            queue.offer(rootRight.right);
            queue.offer(rootLeft.right);
            queue.offer(rootRight.left);
           
            
        }

        return true;
        
    }
}
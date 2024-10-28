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
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        int leftsize=0;
        int rightsize=0;
        Queue<TreeNode>queue=new LinkedList<>();
            queue.offer(root);

            while(!queue.isEmpty())
            {
                int queueSize=queue.size();
                leftsize++;

                for(int i=0;i<queueSize;i++)
                {
                   TreeNode node=queue.poll();
                   if(node.left!=null)
                   queue.offer(node.left);
                   if(node.right!=null)
                   queue.offer(node.right);
                }
                
            }

       
        return leftsize;
    }
}
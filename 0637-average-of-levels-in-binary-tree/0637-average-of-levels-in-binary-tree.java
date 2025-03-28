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
    public List<Double> averageOfLevels(TreeNode root) {
       
        List<Double>list=new ArrayList<>();
         if(root==null)return list;
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);


        while(!queue.isEmpty())
        {
            int size=queue.size();
            double sum=0;
            double count=0.00000;
            for(int i=0;i<size;i++)
            {
                TreeNode node=queue.poll();
                sum=sum+node.val;
                count++;

                if(node.left!=null )
                {
                    queue.offer(node.left);
                }

                 if(node.right!=null )
                {
                    queue.offer(node.right);
                }
            }
            list.add(sum/count);
        }

        return list;
    }
}
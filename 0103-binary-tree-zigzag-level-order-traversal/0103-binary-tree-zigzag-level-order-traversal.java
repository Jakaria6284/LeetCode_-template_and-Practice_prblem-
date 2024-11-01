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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)
        {
            return result;
        }
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        int size=0;

        while(!queue.isEmpty())
        {
            List<Integer>list=new ArrayList<>();
            size++;
            int len=queue.size();

            for(int i=0;i<len;i++)
            {
                TreeNode node=queue.poll();
                list.add(node.val);
                if(node.left!=null)
                {
                    queue.offer(node.left);
                }
                if(node.right!=null)
                {
                    queue.offer(node.right);
                }

            }

            if(size%2==0)
            {
              Collections.reverse(list);
            }

            result.add(list);
        }

          return result;
    }
}
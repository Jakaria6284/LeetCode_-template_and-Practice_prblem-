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
    public void flatten(TreeNode root) {
        LinkedList<TreeNode>list=new LinkedList<>();
          linkedlistMake(root,list);

           TreeNode prev = null;
        for (TreeNode node : list) {
            if (prev != null) {
                prev.left = null;
                prev.right = node;
            }
            prev = node;
        }
        
    }

    public void linkedlistMake(TreeNode node,LinkedList<TreeNode>list)
    {
            if(node==null)return ;
            list.add(node);
            linkedlistMake(node.left,list);
            linkedlistMake(node.right,list);
    }
}
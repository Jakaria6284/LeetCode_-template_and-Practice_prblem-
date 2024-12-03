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
    public int sumNumbers(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        StringBuilder str=new StringBuilder();
        dfs(root,str,list);
         int sum=0;
        for(int i=0;i<list.size();i++)
        {
            sum=sum+list.get(i);
        }
        return sum;
        
    }
    public void dfs(TreeNode root,StringBuilder str,List<Integer>list)
    {
        if(root==null)
        { 
            return ;
        }
         str.append(root.val);
         if(root.left==null && root.right==null )
            {
               list.add(Integer.parseInt(str.toString()));
            }
       
        dfs(root.left,str,list);
        dfs(root.right,str,list);
        str.deleteCharAt(str.length()-1);
    }
}
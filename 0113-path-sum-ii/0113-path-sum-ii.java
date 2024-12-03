/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(root, result, list, 0, targetSum);
        return result;

    }

    public void dfs(TreeNode root, List<List<Integer>> result, List<Integer> list, int sum, int targetSum) {
        if(root==null)
        {
            return ;
        }
          sum=sum+root.val;
          list.add(root.val);
          if(root.left==null && root.right==null && sum==targetSum)
          {
            result.add(new ArrayList<>(list));
          }
         
          dfs(root.left,result, list, sum, targetSum);
          dfs(root.right,result, list, sum, targetSum);
          list.remove(list.size()-1);
          
    }
}
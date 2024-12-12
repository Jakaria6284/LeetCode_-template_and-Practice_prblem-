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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer>list=new ArrayList<>();
        helper(root,list);
         Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < list.size(); i++) {
            int complement = k - list.get(i);
            // Check if the complement exists in the set
            if (set.contains(complement)) {
                return true;
            }
            set.add(list.get(i));  // Add current element to the set
        }

        return false;

        
    }

    public void helper(TreeNode root,List<Integer>list)
    {
        if(root==null)return ;

        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
    }

}
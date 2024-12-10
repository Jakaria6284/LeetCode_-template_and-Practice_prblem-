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
    int index=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        int[] inorder = Arrays.copyOf(preorder, preorder.length);
        Arrays.sort(inorder);
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<preorder.length;i++)
        {
          map.put(inorder[i],i);
        }

        return helper(preorder,map,0,preorder.length-1);
       

    }
    public TreeNode helper(int[]preorder,Map<Integer,Integer>map,int left,int right)
    {
        if(left>right)
        {
            return null;
        }

        int rootval=preorder[index++];
        int rootvalIndex=map.get(rootval);
        TreeNode node=new TreeNode(rootval);
        node.left=helper(preorder,map,left,rootvalIndex-1);
        node.right=helper(preorder,map,rootvalIndex+1,right);
        return node;
    }
}
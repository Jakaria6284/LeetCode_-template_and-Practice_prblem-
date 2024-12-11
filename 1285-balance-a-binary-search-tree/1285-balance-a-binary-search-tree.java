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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        sortedArrayFromTree(root,list);
        
       return  finalTree(root,list,0,list.size()-1);

    }

    public TreeNode finalTree(TreeNode root,List<Integer>list,int l,int r)
    {
        if(l>r)
        {
            return null;
        }
       
        int mid=l+(r-l)/2;
        TreeNode node=new TreeNode(list.get(mid));
        node.left=finalTree(node,list,l,mid-1);
        node.right=finalTree(node,list,mid+1,r);
        return node;
    }

    public void sortedArrayFromTree(TreeNode root,List<Integer>list)
    {
       if(root==null)
       {
        return ;
       }
       sortedArrayFromTree(root.left,list);
       list.add(root.val);
       sortedArrayFromTree(root.right,list);


    }
}